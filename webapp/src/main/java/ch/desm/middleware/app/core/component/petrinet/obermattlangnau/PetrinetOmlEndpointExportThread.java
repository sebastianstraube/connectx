package ch.desm.middleware.app.core.component.petrinet.obermattlangnau;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ch.desm.middleware.app.core.common.DaemonThreadBase;
import ch.desm.middleware.app.core.utility.Pair;

import javax.websocket.EncodeException;

public class PetrinetOmlEndpointExportThread extends DaemonThreadBase {

    private static Logger LOGGER = Logger.getLogger(PetrinetOmlEndpointExportThread.class);
    private static int SLEEP_INTERVAL = 512;

    private Object pendingSensorEventsLock;
    private List<Pair<String, Integer>> pendingSensorEvents;
    private PetrinetOmlBrokerClient petrinet;
    private PetrinetOmlEndpointExportAdapter petrinetAdapter;


    public PetrinetOmlEndpointExportThread(String threadName, PetrinetOmlBrokerClient petrinet) {
        super(threadName);

        this.pendingSensorEventsLock = new Object();
        this.pendingSensorEvents = new LinkedList<Pair<String, Integer>>();
        this.petrinet = petrinet;
        this.petrinetAdapter = new PetrinetOmlEndpointExportAdapter();

    }

    /*
     * initialize sequence
     */
    public void init() {
        petrinetAdapter.init();
    }

    public void setSensor(String signalName, int value) {
        synchronized (pendingSensorEventsLock) {
            Pair<String, Integer> pair = new Pair<String, Integer>(signalName, value);
            pendingSensorEvents.add(pair);
        }
    }

    public void run() {
        while (!isInterrupted()) {

            applySensorEvents();
            simulatePetriNet();
            applyPlaces();

            try {
                Thread.sleep(SLEEP_INTERVAL);
            } catch (InterruptedException e) {
                LOGGER.log(Level.ERROR, e);
            }
        }
    }

    private void applySensorEvents() {
        List<Pair<String, Integer>> pendingSensorEventsCopy = new LinkedList<>();
        synchronized (pendingSensorEventsLock) {
            pendingSensorEventsCopy.addAll(pendingSensorEvents);
            pendingSensorEvents.clear();
        }

        for (Pair<String, Integer> sensorEvent : pendingSensorEventsCopy) {
            petrinetAdapter.setSensor(sensorEvent.getLeft(), sensorEvent.getRight());
        }
    }

    private void simulatePetriNet() {
        while (petrinetAdapter.fireOneTransition()) {
            petrinetAdapter.writeActors();
        }
    }

    private void applyPlaces() {
        for (Pair<String, Integer> changedPlace : petrinetAdapter.getChangedPlaces()) {
            try {
                String encodedMessage = petrinet.getEncoder().encode(changedPlace);
                petrinet.getEndpoint().onIncomingEndpointMessage(encodedMessage);
            } catch (EncodeException e) {
                LOGGER.log(Level.ERROR, e);
            }
        }
    }
}