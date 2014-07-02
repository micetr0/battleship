package ca.bcit.comp2613.battleships.model;

import javax.swing.table.DefaultTableModel;

public class SwingShipModel extends DefaultTableModel {
	
	@Override
	public boolean isCellEditable (int row, int column) {
		//all cells false
		return false;
	}
	
	

}
