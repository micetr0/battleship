package ca.bcit.comp2613.battleships;

import java.util.ArrayList;
import java.util.Random;

import com.sun.org.apache.xpath.internal.operations.Equals;

import ca.bcit.comp2613.battleships.model.Marker;
import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.util.ShipUtil;
import ca.bcit.comp2613.battleships.util.MarkerUtil;

public class ThrowExceptionExample {
	  
	
	public static void main(String[] args) {
	
    ArrayList<Marker> listOfMarker = MarkerUtil.markerGenerator(100);
    Random rand = new Random();
    int randInt = rand.nextInt();
    	if (randInt % 10 == 0) {
    		
    		if (markerResult == "Null");
    		throw new MarkerOutofBoundExcemption();
    		
    		System.out.println("generation successful");
    	}
    
    System.out.println("Complete list of marker:" + listOfMarker);
    
    try {
    	markerResult = markerResult.get((int)(Math.random()*2));
    } catch (DontKnowHowException e) {
    	e.printStackTrace();
    }
    
    
    
    
	}
}
