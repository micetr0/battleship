package ca.bcit.comp2613.battleships.util;
import java.util.ArrayList;
import java.util.Random;

import ca.bcit.comp2613.battleships.model.Marker;

public class MarkerUtil {
	
	public static ArrayList<Marker> markerGenerator(int numberCreate) {
	    
	    ArrayList<Marker> markerArray = new ArrayList<>();
	    Random generator = new Random();
	    
	    
	    //outputing n quantity of marker
	    for(int i=0; i<numberCreate; i++){
	    	
	        Marker marker = new Marker();
	        marker.setId(Integer.toString(i));
	        //not sure how I am going to incorporate for x and y
	        marker.setPositionX(generator.nextInt(20));
	        marker.setPositionY(generator.nextInt(20));
	        //there's only 0-4 hp max
	        markerArray.add(marker);   
	    }
	    
	    return markerArray;
	    
	    
	    
	}
}
