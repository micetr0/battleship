package ca.bcit.comp2613.battleships.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Collections;
import java.util.List;

import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.model.ShipType;


import java.io.ByteArrayOutputStream;

public class ShipUtilBU {
    
    
public static ArrayList<Ship> shipGenerator(int numberCreate) {
    
    ArrayList<Ship> shipArray = new ArrayList<>();
    Random generator = new Random();
    
    int shipTypeAssign = 0;
    
    for(int i=0; i<numberCreate; i++){
        Ship ship = new Ship();
        ship.setId(Integer.toString(i));
        ship.setPositionX(generator.nextInt(20));
        ship.setPositionY(generator.nextInt(20));
        //dont need endurance because of enum
        //ship.setEndurance(generator.nextInt(3));
        shipTypeAssign = generator.nextInt(5) + 2;
        if (shipTypeAssign == 2){
            ship.setShipType (ShipType.DESTROYER);
        }
        else if (shipTypeAssign == 3){
            ship.setShipType (ShipType.SUBMARINE); 
        }
        else if (shipTypeAssign == 4){
            ship.setShipType (ShipType.BATTLESHIP); 
        }
        else if (shipTypeAssign == 5){
            ship.setShipType (ShipType.CARRIER); 
        }
               
        shipArray.add(ship);   
        
/*      Collections.sort(ship);
         for (Integer integer : ship) {
            System.out.println(ship);
        }
*/               
    }   
    return shipArray;
}



/*public static ArrayList<Ship> findShipByEndurance(ArrayList<Ship> Ships, Integer searchEndurance) {
    ArrayList<Ship> searchEnduranceResult = new ArrayList<>();
    //for each Ship in Ships, print the ship object, variable theShip takes value of each Ship object in the collection)
    for (Ship theShip : Ships) {
        if (theShip.getEndurance() == searchEndurance) {
            searchEnduranceResult.add(theShip);
        }
    }
    return searchEnduranceResult;
}
*/

public static ArrayList<Ship> findShipByPositionX(ArrayList<Ship> Ships, Integer thePositionX) {
    ArrayList<Ship> searchResult = new ArrayList<>();
    for (Ship theShip : Ships) {
        if (theShip.getPositionX() == thePositionX) {
            searchResult.add(theShip);
        }
    }
    return searchResult;
}

public static ArrayList<Ship> findShipByPositionRegexX(ArrayList<Ship> Ships, String regexX) {
    ArrayList<Ship> searchResult = new ArrayList<>();
    for(Ship theShip : Ships) {
        if (theShip.getPositionX().toString().matches(regexX)) {
            searchResult.add(theShip);
        }
    }
    return searchResult;
}

public static void printShip(Ship ship) {
    System.out.println(ship);
    }

/*@SuppressWarnings("rawtypes")
public class ShipSortByID implements Comparator {
    
 public int compare(Ship id1, Ship id2) {
     
     int value = 0;
     
     if (Ship.id1.id > Ship.id2.id)
         value = 1;
     else if (Ship.id1.id < Ship.id2.id)
         value = -1;
     else if (Ship.id1.id > Ship.id2.id)
         value = 0;
     
     return value;
             
 }
*/ 

//public static String shipIDorder() {
//	
//	Random shipIDorderandom = new Random();
//	
//	ArrayList<Ship> myShips = new ArrayList<>();
//	String randomString = String.valueOf(shipIDorderandom.nextInt(9));
//	Ship ship1 = new Ship (randomString,2,2,5);
//	randomString = String.valueOf(shipIDorderandom.nextInt(9));
//	Ship ship2 = new Ship (randomString,2,2,5);
//	randomString = String.valueOf(shipIDorderandom.nextInt(9));
//	Ship ship3 = new Ship (randomString,2,2,5);
//	randomString = String.valueOf(shipIDorderandom.nextInt(9));
//	Ship ship4 = new Ship (randomString,2,2,5);
//	
//	myShips.add(ship1);
//	myShips.add(ship2);
//	myShips.add(ship3);
//	myShips.add(ship4);
//	
//	Collections.sort(myShips);
//	String shipAsJSONString = null; 
//			
//	
//	ObjectMapper objectMapper = new ObjectMapper();
//	try {
//		ByteArrayOutputStream test = new ByteArrayOutputStream();
//		objectMapper.writeValue(test, myShips);
//		shipAsJSONString = test.toString();
//		System.out.println(shipAsJSONString);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		for (Ship shipIDsort : myShips) {
//		System.out.println(shipIDsort);
//		}
//		return shipAsJSONString;
//  }
//	
}
