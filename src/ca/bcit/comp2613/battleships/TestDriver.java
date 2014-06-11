package ca.bcit.comp2613.battleships;
//pull
import java.util.ArrayList;

import ca.bcit.comp2613.battleships.model.Marker;
import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.util.ShipUtil;
import ca.bcit.comp2613.battleships.util.MarkerUtil;

public class TestDriver {

    public static void main(String[] args) {
    	
   //ship class
        ArrayList<Ship> listOfShip = ShipUtil.shipGenerator(100);
        //ArrayList<Ship> shipSearch = ShipUtil.findShipByPosition(listOfShip, 100);
        ArrayList<Ship> shipEndurance = ShipUtil.findShipByEndurance(listOfShip, 2);
        //find by position regex
        ArrayList<Ship> shipSearchRegex = ShipUtil.findShipByPositionRegex(listOfShip,"45");
        //find by position
        ArrayList<Ship> shipSearchPosition = ShipUtil.findShipByPosition(listOfShip, 4,5);
        
        //Ship search query outputs
        System.out.println("Asgn2 Start");
        System.out.println("");
        System.out.println("Complete List of Ship" + listOfShip);    
        System.out.println("Ship Endurance" + shipEndurance);
        System.out.println("Search by Ship position regex" + shipSearchRegex);
        System.out.println("Search by Ship position " + shipSearchPosition);
        //System.out.println(shipSearch);
                
   //marker class
        System.out.println("Search by Marker: ");
    	System.out.println(" ");
        ArrayList<Marker> listOfMarker = MarkerUtil.markerGenerator(100);
        System.out.println("Complete list of marker:" + listOfMarker);
        
     //find marker by match position X and Y
        ArrayList<Marker> markerXSearch = MarkerUtil.findMarkerByPositionX(listOfMarker, 6);
        System.out.println("position X match: " + markerXSearch);
        
        ArrayList<Marker> markerYSearch = MarkerUtil.findMarkerByPositionY(listOfMarker, 6);
        System.out.println("position Y match: " + markerYSearch);
                
     //find Marker by Regex position X and Y
 
        ArrayList<Marker> markerYSearchRegex = MarkerUtil.findMarkerByPositionYRegex(listOfMarker, "10");
        System.out.println("position X regex: " + markerYSearchRegex);
        
        ArrayList<Marker> markerSearchRegex = MarkerUtil.findMarkerByPositionXRegex(listOfMarker, "10");
        System.out.println("position Y regex: " + markerSearchRegex);
        
        System.out.println(" ");
        System.out.println("Asgn2 End");
        System.out.println("");
        
        
      
        System.out.println("Asgn3 Start");
        System.out.println("");
        
        	System.out.println("this list is modified to have output for marker enum class" + listOfMarker);
        
        System.out.println("Asgn3 end");
        System.out.println("");
        
        
        
        
        
        
        
    }
    

}
