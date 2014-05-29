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
        ArrayList<Ship> shipSearchRegex = ShipUtil.findShipByPositionRegex(listOfShip, "5");
        System.out.println(listOfShip);
        //System.out.println(shipSearch);
        System.out.println(shipEndurance);
        System.out.println(shipSearchRegex);
        
     //marker class
        ArrayList<Marker> listOfMarker = MarkerUtil.markerGenerator(100);
        System.out.println(listOfMarker);
     //find marker position X
        ArrayList<Marker> markerSearch = MarkerUtil.findMarkerByPositionX(listOfMarker, 6);
        System.out.println(markerSearch);
        ArrayList<Marker> markerSearchRegex = MarkerUtil.findMarkerByPositionXRegex(listOfMarker, "10");
        System.out.println(markerSearchRegex);
    }
    

}
