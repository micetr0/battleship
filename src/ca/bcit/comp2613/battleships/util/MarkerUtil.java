package ca.bcit.comp2613.battleships.util;
import java.util.ArrayList;
import java.util.Random;

import ca.bcit.comp2613.battleships.model.Marker;
import ca.bcit.comp2613.battleships.model.markerState;

public class MarkerUtil {
	
		
	public static ArrayList<Marker> markerGenerator(int numberCreate) {
	    
	    ArrayList<Marker> markerArray = new ArrayList<>();
	    Random generator = new Random();
	    
	    //ArrayList<markerState> markerResult = new ArrayList<markerState>();
		
		//markerResult.add(markerState.HIT);
		//markerResult.add(markerState.MISS);
		Random random = new Random();
		random.nextInt(numberCreate);
		//markerResult.get((random.nextInt(2)));
		int tempHit = 0;
	    //output n quantity of marker
	    for(int i=0; i<numberCreate; i++){
	    	
	        Marker marker = new Marker();
	        marker.setId(Integer.toString(i));
	        //not sure how I am going to incorporate for x and y
	        marker.setPositionX(generator.nextInt(20));
	        marker.setPositionY(generator.nextInt(20));
	        tempHit = random.nextInt(2);
	        if (tempHit == 0) {
	        	 marker.setRandomHitMiss(markerState.HIT);
	        } else {
	        	marker.setRandomHitMiss(markerState.MISS);
	        }
	       
	        //marker.getRandomHitMiss();
	        markerArray.add(marker);   
	    }
	return markerArray;    
	}
	
	
	//add marker position X
	public static ArrayList<Marker> findMarkerByPositionX(ArrayList<Marker> Markers, Integer positionX) {
	    ArrayList<Marker> searchPosX = new ArrayList<>();
	    //for each Ship in Ships, print the ship object, variable theShip takes value of each Ship object in the collection)
	    for (Marker theMarker : Markers) {
	        if (theMarker.getPositionX() == positionX) {
	            searchPosX.add(theMarker);
	        }
	    }
	    return searchPosX;
	}
	
	//add marker position Y
	public static ArrayList<Marker> findMarkerByPositionY(ArrayList<Marker> Markers, Integer positionY) {
	    ArrayList<Marker> searchPosY = new ArrayList<>();
	    //for each Ship in Ships, print the ship object, variable theShip takes value of each Ship object in the collection)
	    for (Marker theMarker : Markers) {
	        if (theMarker.getPositionY() == positionY) {
	            searchPosY.add(theMarker);
	        }
	    }
	    return searchPosY;
	}
	
	//add regex stuff for
	public static ArrayList<Marker> findMarkerByPositionXRegex(ArrayList<Marker> Markers, String regex) {
	    ArrayList<Marker> searchResult = new ArrayList<>();
	    for(Marker theMarker : Markers) {
	        if (theMarker.getPositionX().toString().matches(regex)) {
	            searchResult.add(theMarker);
	        }
	    }
	    return searchResult;
	}
	
	public static ArrayList<Marker> findMarkerByPositionYRegex(ArrayList<Marker> Markers, String regex) {
	    ArrayList<Marker> searchResult = new ArrayList<>();
	    for(Marker theMarker : Markers) {
	        if (theMarker.getPositionY().toString().matches(regex)) {
	            searchResult.add(theMarker);
	        }
	    }
	    return searchResult;
	}
	
}
