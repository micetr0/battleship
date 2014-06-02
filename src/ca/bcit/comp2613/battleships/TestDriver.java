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
        //find by position X
        ArrayList<Ship> shipSearchXRegex = ShipUtil.findShipByPositionXRegex(listOfShip, "5");
        //find by position Y
        ArrayList<Ship> shipSearchYRegex = ShipUtil.findShipByPositionYRegex(listOfShip, "5");
        System.out.println(listOfShip);
        
        //Ship search query outputs
        System.out.println("Ship List printed: ");
    	System.out.println(" ");
        System.out.println(listOfShip);
       
        System.out.println("Ship Endurance: ");
    	System.out.println(" ");
        System.out.println(shipEndurance);
        
        System.out.println("Search by Ship position X: ");
    	System.out.println(" ");
        System.out.println(shipSearchXRegex);
        
        System.out.println("Search by Ship position Y: ");
    	System.out.println(" ");
        System.out.println(shipSearchYRegex);
        //System.out.println(shipSearch);
        
     //marker class
        System.out.println("Search by Marker: ");
    	System.out.println(" ");
        ArrayList<Marker> listOfMarker = MarkerUtil.markerGenerator(100);
        System.out.println(listOfMarker);
        
     //find marker position X
        ArrayList<Marker> markerSearch = MarkerUtil.findMarkerByPositionX(listOfMarker, 6);
        System.out.println(markerSearch);
        ArrayList<Marker> markerSearchRegex = MarkerUtil.findMarkerByPositionXRegex(listOfMarker, "10");
        System.out.println(markerSearchRegex);
    }
    

}
