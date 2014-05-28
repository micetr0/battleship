package ca.bcit.comp2613.battleships;

import java.util.ArrayList;

import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.util.ShipUtil;

public class TestDriver {

    public static void main(String[] args) {
        ArrayList<Ship> listOfShip = ShipUtil.shipGenerator(100);
        ArrayList<Ship> shipSearch = ShipUtil.findShipByPosition(listOfShip, 100);
        ArrayList<Ship> shipSearchRegex = ShipUtil.findShipByPositionRegex(listOfShip, "100");
        System.out.println(listOfShip);
        System.out.println(shipSearch);
        System.out.println(shipSearchRegex);
    }

}
