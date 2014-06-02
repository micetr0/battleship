package ca.bcit.comp2613.battleships.util;

import java.util.ArrayList;
import java.util.Random;

import ca.bcit.comp2613.battleships.model.Ship;

public class ShipUtil {
    
    
public static ArrayList<Ship> shipGenerator(int numberCreate) {
    
    ArrayList<Ship> shipArray = new ArrayList<>();
    Random generator = new Random();
    for(int i=0; i<numberCreate; i++){
        Ship ship = new Ship();
        ship.setId(Integer.toString(i));
        //incorporate X and Y random position
        ship.setPositionX(generator.nextInt(20));
        ship.setPositionY(generator.nextInt(20));
        //there's only 0-4 hp max
        ship.setEndurance(generator.nextInt(3));
        shipArray.add(ship);   
    }
    
    return shipArray;
}


public static ArrayList<Ship> findShipByEndurance(ArrayList<Ship> Ships, Integer searchEndurance) {
    ArrayList<Ship> searchEnduranceResult = new ArrayList<>();
    //for each Ship in Ships, print the ship object, variable theShip takes value of each Ship object in the collection)
    for (Ship theShip : Ships) {
        if (theShip.getEndurance() == searchEndurance) {
            searchEnduranceResult.add(theShip);
        }
    }
    return searchEnduranceResult;
}


/* 
public static ArrayList<Ship> findShipByPosition(ArrayList<Ship> Ships, Integer thePosition) {
    ArrayList<Ship> searchResult = new ArrayList<>();
    for (Ship theShip : Ships) {
        if (theShip.getPosition() == thePosition) {
            searchResult.add(theShip);
        }
    }
    return searchResult;
}
*/


public static ArrayList<Ship> findShipByPositionXRegex(ArrayList<Ship> Ships, String regex) {
    ArrayList<Ship> searchResult = new ArrayList<>();
    for(Ship theShip : Ships) {
        if (theShip.getPositionX().toString().matches(regex)) {
            searchResult.add(theShip);
        }
    }
    return searchResult;
}

//will be looking to combine x and y search together
public static ArrayList<Ship> findShipByPositionYRegex(ArrayList<Ship> Ships, String regex) {
    ArrayList<Ship> searchResult = new ArrayList<>();
    for(Ship theShip : Ships) {
        if (theShip.getPositionY().toString().matches(regex)) {
            searchResult.add(theShip);
        }
    }
    return searchResult;
}


public static void printShip(Ship ship) {
    System.out.println(ship);
}
}
