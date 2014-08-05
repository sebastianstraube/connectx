package ch.desm.middleware.modules.communication.endpoint.dll;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import ch.desm.Dll;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObectDllIsolierstoss;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllBalise;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllBase;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllLoop;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllSignal;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllTrack;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllTrackConnection;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllTrainPosition;
import ch.desm.middleware.modules.communication.endpoint.dll.objects.EndpointObjectDllWeiche;
import ch.desm.middleware.modules.core.daemon.DaemonThread;

public class EndpointDllPolling extends DaemonThread {
	
	private static Logger log = Logger.getLogger(EndpointDllPolling.class);
	
	private int waitTimeMs;
	private Dll dll;
	private EndpointDll endpoint;

	public EndpointDllPolling(String name, int waitTimeMs, Dll locsimDll,
			EndpointDll endpoint) {
		super(name);
		this.dll = locsimDll;
		this.endpoint = endpoint;
		this.waitTimeMs = waitTimeMs;
	}

	@Override
	public void run() {
		try {

			while (!isInterrupted()) {
				log.trace("Polling Thread active: " + this.getName() + " wait time: " + waitTimeMs);
				pollingDllEvents();
				Thread.sleep(waitTimeMs);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void pollingDllEvents() throws Exception {
		ArrayList<EndpointDllEvent> events = null;

		events = dll.getEvents();

		for (EndpointDllEvent event : events) {

			ArrayList<Integer> params = event.params;

			switch (event.type) {
			case EndpointObjectDllBase.ENUM_CMD_ISOLIERSTOSS:
				int isolierstossId = params.get(0);
				EndpointObectDllIsolierstoss isolierstoss = dll
						.getIsolierstoss(isolierstossId);

				endpoint.receiveEndpointObject(isolierstoss);
				break;
			case EndpointObjectDllBase.ENUM_CMD_WEICHE:
				int weicheId = params.get(0);
				EndpointObjectDllWeiche weiche = dll.getWeiche(weicheId);

				endpoint.receiveEndpointObject(weiche);
				break;
			case EndpointObjectDllBase.ENUM_CMD_TRAINPOSITION:
				int trainTyp = params.get(0);
				EndpointObjectDllTrainPosition trainPosition = dll
						.getTrainPosition(trainTyp);

				endpoint.receiveEndpointObject(trainPosition);
				break;
			case EndpointObjectDllBase.ENUM_CMD_SIGNAL:
				int signalId = params.get(0);
				EndpointObjectDllSignal signal = dll.getSignal(signalId);

				endpoint.receiveEndpointObject(signal);
				break;
			case EndpointObjectDllBase.ENUM_CMD_KILOMETER_DIRECTION:
				int kilometerDirection = dll.getKilometerDirection();

				endpoint.receiveEndpointObject(kilometerDirection);
				break;
			case EndpointObjectDllBase.ENUM_CMD_BALISE:
				int baliseIdBalise = params.get(0);
				EndpointObjectDllBalise balise = dll.getBalise(baliseIdBalise);

				endpoint.receiveEndpointObject(balise);
				break;
			case EndpointObjectDllBase.ENUM_CMD_LOOP:
				int baliseIDLoop = params.get(0);
				EndpointObjectDllLoop loop = dll.getLoop(baliseIDLoop);

				endpoint.receiveEndpointObject(loop);
				break;
			case EndpointObjectDllBase.ENUM_CMD_TRACK:
				int gleisId = params.get(0);
				EndpointObjectDllTrack track = dll.getTrack(gleisId);

				endpoint.receiveEndpointObject(track);
				break;
			case EndpointObjectDllBase.ENUM_CMD_TRACK_CONNECTION:
				int gleis1Id = params.get(0);
				int gleis2Id = params.get(1);
				EndpointObjectDllTrackConnection trackConnection = dll
						.getTrackConnection(gleis1Id, gleis2Id);

				endpoint.receiveEndpointObject(trackConnection);
				break;
			}
		}
	}
}