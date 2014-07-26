package ca.bcit.comp2613.battleships.sandbox;

import java.util.HashMap;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextFieldReference {

	private static HashMap<String, JTextField> textFieldMap = new HashMap<String, JTextField>();
	
	public static JTextField createTextField(String uniqueTextFieldName) {
	    JTextField retval = new JTextField(uniqueTextFieldName);
	    return retval;
	}

	public static void main(String[] args) {
	    JPanel panel = new JPanel();
	    panel.add(createTextField("coordiantes"));
	    panel.add(createTextField("x"));
	    panel.add(createTextField("y"));
	    panel.add(createTextField("score"));
	    
	    
	    JTextField x = textFieldMap.get("x");
	    JTextField y = textFieldMap.get("y");
	    
	    x.setText("Hello");
	    // or
	    textFieldMap.get("x").setText("GoodBye");
	}
	
}
