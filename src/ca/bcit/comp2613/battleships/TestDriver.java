package ca.bcit.comp2613.battleships;
//pull
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import ca.bcit.comp2613.battleships.model.Marker;
import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.util.ShipUtil;
import ca.bcit.comp2613.battleships.util.MarkerUtil;


//import ca.bcit.comp2613.coursematerial.day05.Log4jDemo;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.log4j.Logger;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import java.io.ByteArrayOutputStream;

public class TestDriver {

    public static void main(String[] args) throws ConfigurationException {
    	
		Logger log = Logger.getLogger(TestDriver.class);
		PropertiesConfiguration propertiesConfiguration = new PropertiesConfiguration();
			
			propertiesConfiguration.load(TestDriver.class.getResourceAsStream("ship_info.properties"));
			log.info("Boardsize is " + propertiesConfiguration.getString("boardSize1"));
		
    //ship class
        ArrayList<Ship> listOfShip = ShipUtil.shipGenerator(100);
        
        
        //System.out.println("----Sort By ID...only thats it");
        log.info("----Sort By ID...only thats it");
        log.info("changed the output to JSON string type");
        ShipUtil.shipIDorder();
        
        try {
			FileUtils.writeStringToFile(new File("sortedShip.txt"), ShipUtil.shipIDorder());
			System.out.println(FileUtils.readFileToString(new File("sortedShip.txt")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        //ArrayList<Ship> shipSearch = ShipUtil.findShipByPosition(listOfShip, 100);
        //ArrayList<Ship> shipEndurance = ShipUtil.findShipByEndurance(listOfShip, 2);
        ArrayList<Ship> shipSearchRegexX = ShipUtil.findShipByPositionRegexX(listOfShip, "5");
        
        //System.out.println("list: " + listOfShip);
        log.info("list: " + listOfShip);
        
        //System.out.println(shipSearch);
        //System.out.println("endurance: " + shipEndurance);
        log.info("find by position x: " +shipSearchRegexX);
        //System.out.println("find by position x: " +shipSearchRegexX);
        
     //marker class
        ArrayList<Marker> listOfMarker = MarkerUtil.markerGenerator(100);
        
        //System.out.println(listOfMarker);
        log.info(listOfMarker);
     //find marker position X
        ArrayList<Marker> markerSearch = MarkerUtil.findMarkerByPositionX(listOfMarker, 6);
        //System.out.println("find by position x: " + markerSearch);
        log.info("find by position x: " + markerSearch);
        ArrayList<Marker> markerSearchRegex = MarkerUtil.findMarkerByPositionXRegex(listOfMarker, "10");
        //System.out.println(markerSearchRegex);
        log.info(markerSearchRegex);
    
        
    }


    

}
