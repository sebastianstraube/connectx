package ch.desm.middleware.modules.component.simulation.locsim.maps;

import java.util.Map;
import java.util.Map.Entry;

import ch.desm.middleware.modules.component.ComponentMapBase;


public class LocsimMapRs232 extends ComponentMapBase {
	
	@Override
	public Map<String, String> getMap() {
		return map;
	}
	
	public String getValue(String signalType, String channel){
		
		for(Entry<String, String> entry : map.entrySet()){
			if(entry.getKey().equalsIgnoreCase(signalType+channel)){
				return entry.getValue();
			}
		}
		
		return "";
	}
	
	@Override
	protected void initialize(){
		
		map.put("OS_INI1","locsim.initialization.ready.ini1"); //Locsim Schnittstellen Initialisation
		map.put("OS_INI2","locsim.initialization.ready.ini2");
		map.put("OS_INI7","locsim.initialization.ready.ini7");
		
		map.put("V00","ao269"); //HLDruck
		map.put("V01","ao173"); //BremszylinderDruck

		map.put("U18","s132"); //HauptschalterSchalter
		map.put("U20","s126"); //SchalterSteuerstrom
		map.put("U19","s129"); //SchalterStromabnehmer
		map.put("U27","s235"); //Totmannpedal

		map.put("U09","s140a"); //FahrtrichtungSchalter vorwärts
		map.put("U10","s140b"); //FahrtrichtungSchalter rückwärts

		map.put("U08","fahrschalter.bremsen.plus"); //Fahrschalter bremsen
		map.put("U07","fahrschalter.bremsen.punkt"); //Fahrschalter bremsen
		map.put("U06","fahrschalter.bremsen.minus"); //Fahrschalter bremsen
		map.put("U05","fahrschalter.neutral"); //Fahrschalter neutral
		map.put("U04","fahrschalter.fahren.minus"); //Fahrschalter fahren
		map.put("U03","fahrschalter.fahren.punkt"); //Fahrschalter fahren
		map.put("U02","fahrschalter.fahren.m"); //Fahrschalter fahren
		map.put("U01","fahrschalter.fahren.plus"); //Fahrschalter fahren
		map.put("U00","fahrschalter.fahren.plusplus"); //Fahrschalter fahren


		
	}
}
