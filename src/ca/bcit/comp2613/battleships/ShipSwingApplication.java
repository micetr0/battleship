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
	private JTextField positionXTextField;
	private JTextField positionYTextField;
	private JTextField enduranceTextField;
	private JLabel lblLastName;
	private JLabel lblId;
	private JLabel lblEndurance;
	private SwingShipModel swingShipModel;
	public String[] columnNames = new String[] { "id", "Position X",
			"Position Y", "Endurance" };
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
	
	public ShipSwingApplication() {
		ships = ShipUtil.shipGenerator(100);
		initialize();
		initTable();
		
	}
	
	private void initTable() {

		// table = new JTable(swingTeacherModel);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent e) {
						if (e.getValueIsAdjusting()) {
							populateFields();
						}
					}
				});
		refreshTable();

	}
	
	private void populateFields() {
		try {
			idTextField.setText(table.getModel()
					.getValueAt(table.getSelectedRow(), 0).toString());
			positionXTextField.setText(table.getModel()
					.getValueAt(table.getSelectedRow(), 1).toString());
			positionYTextField.setText(table.getModel()
					.getValueAt(table.getSelectedRow(), 2).toString());
			enduranceTextField.setText(table.getModel()
					.getValueAt(table.getSelectedRow(), 3).toString());
		} catch (Exception e) {}
	}
	
	public void doSave() {
		String id = idTextField.getText();
		
		String positionX = positionXTextField.getText();
		int xaxis = Integer.parseInt(positionX);
		
		String positionY = positionYTextField.getText();
		int yaxis = Integer.parseInt(positionY);
		
		String endurance = enduranceTextField.getText();
		int endure = Integer.parseInt(endurance);
		
		Ship ship = new Ship(id, xaxis, yaxis, endure);
		ShipUtil.save(ships, ship);
		//table.clearSelection();
		refreshTable();
	}
	
	//stopped here. need to add doDelete() method in ShipUtil
	public void doDelete() {
		String id = idTextField.getText();
		
		String positionX = positionXTextField.getText();
		int xaxis = Integer.parseInt(positionX);
		
		String positionY = positionYTextField.getText();
		int yaxis = Integer.parseInt(positionY);
		
		String endurance = enduranceTextField.getText();
		int endure = Integer.parseInt(endurance);
		
		Ship ship = new Ship(id, xaxis, yaxis, endure);
		ShipUtil.delete(ships, ship);
		refreshTable();
	}
	
	public void doNew() {
		String id = UUID.randomUUID().toString();
		idTextField.setText(id);
		positionXTextField.setText("");
		positionYTextField.setText("");
		enduranceTextField.setText("");
	}

	private void refreshTable() {
		// swingTeacherModel = new SwingTeacherModel();
		Object[][] data = null;

		data = new Object[ships.size()][4];
		int i = 0;
		for (Ship ship : ships) {
			data[i][0] = ship.getId();
			data[i][1] = ship.getPositionX();
			data[i][2] = ship.getPositionY();
			data[i][3] = ship.getEndurance();
			i++;
		}
		swingShipModel.setDataVector(data, columnNames);
		table.repaint();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// table = new JTable();
		swingShipModel = new SwingShipModel();

		table = new JTable(swingShipModel);

		// table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		// table.setBounds(0, 11, 585, 247);
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 11, 585, 247);
		frame.getContentPane().add(scrollPane);
		// scrollPane.add(table);
		// frame.getContentPane().add(table);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(44, 330, 103, 14);
		frame.getContentPane().add(lblFirstName);

		positionXTextField = new JTextField();
		positionXTextField.setBounds(159, 327, 325, 20);
		frame.getContentPane().add(positionXTextField);
		positionXTextField.setColumns(10);

		positionYTextField = new JTextField();
		positionYTextField.setBounds(159, 371, 325, 20);
		frame.getContentPane().add(positionYTextField);
		positionYTextField.setColumns(10);
		
		enduranceTextField = new JTextField();
		enduranceTextField.setBounds(159, 371, 325, 20); //need to play with the numbers
		frame.getContentPane().add(enduranceTextField);
		enduranceTextField.setColumns(10);
		
		//user input section begins

		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(44, 374, 77, 14);
		frame.getContentPane().add(lblLastName);

		lblId = new JLabel("id");
		lblId.setBounds(44, 288, 46, 14);
		frame.getContentPane().add(lblId);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doSave();
			}
		});
		btnSave.setBounds(44, 412, 89, 23);
		frame.getContentPane().add(btnSave);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doDelete();
			}
		});
		btnDelete.setBounds(169, 412, 89, 23);
		frame.getContentPane().add(btnDelete);

		JButton btnNewButton = new JButton("New");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doNew();
			}
		});
		btnNewButton.setBounds(496, 260, 89, 23);
		frame.getContentPane().add(btnNewButton);

		idTextField = new JTextField();
		idTextField.setEditable(false);
		idTextField.setBounds(159, 285, 325, 20);
		frame.getContentPane().add(idTextField);
		idTextField.setColumns(10);
	}
	
	
	
	

}