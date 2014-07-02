package ca.bcit.comp2613.battleships;

//pull
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import ca.bcit.comp2613.battleships.model.Marker;
import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.util.ShipUtil;
import ca.bcit.comp2613.battleships.util.MarkerUtil;
import ca.bcit.comp2613.battleships.model.SwingShipModel;

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

//import of Swing stuff
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.UUID;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ShipSwingApplication {

	private JFrame frame;
	private JTable table;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JLabel lblLastName;
	private JLabel lblId;
	private SwingShipModel swingShipModel;
	public String[] columnNames = new String[] { "id", "First Name",
			"Last Name" };
	private JTextField idTextField;
	public static List<Ship> ships;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShipSwingApplication window = new ShipSwingApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	

}