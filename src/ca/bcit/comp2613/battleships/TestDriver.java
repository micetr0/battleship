package ca.bcit.comp2613.battleships;
//pull
import java.util.ArrayList;

import ca.bcit.comp2613.battleships.model.Marker;
import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.util.ShipUtil;
import ca.bcit.comp2613.battleships.util.MarkerUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestDriver {

    public static void main(String[] args) {
    	
    //ship class
        ArrayList<Ship> listOfShip = ShipUtil.shipGenerator(100);
        
        
        System.out.println("----Sort By ID----");
        
        Comparator<Ship> myComparator = new Comparator<Ship>() {

            @Override
            public int compare(Ship id1, Ship id2) {
                int retval = 0;
                if (id1.getId() > id2.getId())
                    retval = 1;
                else if (id1.getId() < id2.getId())
                    retval = -1;
                else if (id1.getId() > id2.getId())
                    retval = 0;
                }
                
                // TODO Auto-generated method stub
                
                return retval;
            }
            
            
        }
        Collections.sort(listOfShip, myComparator());
        for (Ship ship: listOfShip) {
        System.out.println(listOfShip);
        }
        
      
   
        //ArrayList<Ship> shipSearch = ShipUtil.findShipByPosition(listOfShip, 100);
        //ArrayList<Ship> shipEndurance = ShipUtil.findShipByEndurance(listOfShip, 2);
        ArrayList<Ship> shipSearchRegexX = ShipUtil.findShipByPositionRegexX(listOfShip, "5");
        System.out.println("list: " + listOfShip);
        //System.out.println(shipSearch);
        //System.out.println("endurance: " + shipEndurance);
        System.out.println("find by position x: " +shipSearchRegexX);
        
     //marker class
        ArrayList<Marker> listOfMarker = MarkerUtil.markerGenerator(100);
        System.out.println(listOfMarker);
     //find marker position X
        ArrayList<Marker> markerSearch = MarkerUtil.findMarkerByPositionX(listOfMarker, 6);
        System.out.println("find by position x: " + markerSearch);
        ArrayList<Marker> markerSearchRegex = MarkerUtil.findMarkerByPositionXRegex(listOfMarker, "10");
        System.out.println(markerSearchRegex);
        
    
        
    }
    

}
