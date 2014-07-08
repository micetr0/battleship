package ca.bcit.comp2613.battleships.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.model.ShipType;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.ByteArrayOutputStream;

public class ShipUtil {

	public static ArrayList<Ship> shipGenerator(int numberCreate) {

		ArrayList<Ship> shipArray = new ArrayList<>();
		Random generator = new Random();

		int shipTypeAssign = 0;

		for (int i = 0; i < numberCreate; i++) {
			Ship ship = new Ship();
			ship.setId(Integer.toString(i));
			ship.setPositionX(generator.nextInt(20));
			ship.setPositionY(generator.nextInt(20));

			//to do: fix ship type generator to range 2-5 only
			shipTypeAssign = generator.nextInt(5) + 2;
			if (shipTypeAssign == 2) {
				ship.setShipType(ShipType.DESTROYER);
				ship.setEndurance(2);
			} else if (shipTypeAssign == 3) {
				ship.setShipType(ShipType.SUBMARINE);
				ship.setEndurance(3);
			} else if (shipTypeAssign == 4) {
				ship.setShipType(ShipType.BATTLESHIP);
				ship.setEndurance(4);
			} else if (shipTypeAssign == 5) {
				ship.setShipType(ShipType.CARRIER);
				ship.setEndurance(5);
			}
			shipArray.add(ship);
		}
		return shipArray;
	}

	public static void printShip(Ship ship) {
		System.out.println(ship);
	}

	//adding ship in orders from largest to small using collection and comparator
	public static String shipIDorder() {
	
	Random shipIDorderandom = new Random();
	
	ArrayList<Ship> myShips = new ArrayList<>();
	String randomString = String.valueOf(shipIDorderandom.nextInt(9));
	Ship ship1 = new Ship (randomString,2,2,5);
	randomString = String.valueOf(shipIDorderandom.nextInt(9));
	Ship ship2 = new Ship (randomString,2,2,5);
	randomString = String.valueOf(shipIDorderandom.nextInt(9));
	Ship ship3 = new Ship (randomString,2,2,5);
	randomString = String.valueOf(shipIDorderandom.nextInt(9));
	Ship ship4 = new Ship (randomString,2,2,5);
	
	myShips.add(ship1);
	myShips.add(ship2);
	myShips.add(ship3);
	myShips.add(ship4);
	
	Collections.sort(myShips);
	String shipAsJSONString = null; 
			
	ObjectMapper objectMapper = new ObjectMapper();
	try {
		ByteArrayOutputStream report = new ByteArrayOutputStream();
		objectMapper.writeValue(report, myShips);
		shipAsJSONString = report.toString();
		System.out.println(shipAsJSONString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Ship shipIDsort : myShips) {
		System.out.println(shipIDsort);
		}
		return shipAsJSONString;
  }
	

	public static ArrayList<Ship> findShipByPositionX(ArrayList<Ship> Ships,
			Integer thePositionX) {
		ArrayList<Ship> searchResult = new ArrayList<>();
		for (Ship theShip : Ships) {
			if (theShip.getPositionX() == thePositionX) {
				searchResult.add(theShip);
			}
		}
		return searchResult;
	}

	public static ArrayList<Ship> findShipByPositionRegexX(
			ArrayList<Ship> Ships, String regexX) {
		ArrayList<Ship> searchResult = new ArrayList<>();
		for (Ship theShip : Ships) {
			if (theShip.getPositionX().toString().matches(regexX)) {
				searchResult.add(theShip);
			}
		}
		return searchResult;
	}
	
	//assign6
	
	public static void save(List<Ship> ships, Ship ship) {
		boolean foundUpdate = false;
		for (Ship shipLoop : ships) {
			if (shipLoop.getId().equals(ship.getId())) {
				shipLoop.setPositionX(ship.getPositionX());
				shipLoop.setPositionY(ship.getPositionY());
				shipLoop.setEndurance(ship.getEndurance());
				foundUpdate = true;
				break;
			}
		}
		if (!foundUpdate) { // do an insert
			ships.add(ship);
		}
	}

	public static void delete(List<Ship> ships, Ship ship){
		Iterator<Ship> iter = ships.iterator();
		while(iter.hasNext()) {
			Ship shipLoop = iter.next();
			if(shipLoop.getId().equals(ship.getId())) {
			iter.remove();
			break;
			}
		}	
	}
	
	
}
