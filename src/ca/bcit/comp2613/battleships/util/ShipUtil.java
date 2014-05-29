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
        //not sure how I am going to incorporate for x and y
        ship.setPosition(generator.nextInt(20));
        //there's only 0-4 hp max
        ship.setEndurance(generator.nextInt(3));
        shipArray.add(ship);   
    }
    
    return shipArray;
}

public static ArrayList<Ship> findShipByPosition(ArrayList<Ship> Ships, Integer thePosition) {
    ArrayList<Ship> searchResult = new ArrayList<>();
    for (Ship theShip : Ships) {
        if (theShip.getPosition() == thePosition) {
            searchResult.add(theShip);
        }
    }
    return searchResult;
}

public static ArrayList<Ship> findShipByPositionRegex(ArrayList<Ship> Ships, String regex) {
    ArrayList<Ship> searchResult = new ArrayList<>();
    for(Ship theShip : Ships) {
        if (theShip.getPosition().toString().matches(regex)) {
            searchResult.add(theShip);
        }
    }
    return searchResult;
}


public static void printShip(Ship ship) {
    System.out.println(ship);
}
}
