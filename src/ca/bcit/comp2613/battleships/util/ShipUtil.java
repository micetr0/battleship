package ca.bcit.comp2613.battleships.util;

import java.util.ArrayList;
import java.util.Random;

import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.model.ShipType;

public class ShipUtil {
    
    
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
}
