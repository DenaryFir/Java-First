package homeTest;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class DetailMaker {
	
	public ArrayList<JLabel> labelGenerator (ArrayList<String> labelArray) {
		
		ArrayList<JLabel> labelArrayList = new ArrayList<JLabel>();
		
		for ( int i = 0 ; i < labelArray.size(); i++ ) {
			JLabel labelToAdd = new JLabel();
			labelToAdd.setName(labelArray.get(i));
			labelToAdd.setText(labelArray.get(i));
			labelArrayList.add(labelToAdd);
			
		}
		
		return(labelArrayList);
		
	}

	
	public ArrayList<JComboBox> comboBoxGenerator (ArrayList<String> labelArray) {
		
		ArrayList<JComboBox> comboBoxArray = new ArrayList<JComboBox>();
		
		for ( int i = 0 ; i < labelArray.size(); i++ ) {
			JComboBox comboToAdd = new JComboBox();
			comboToAdd.setName(labelArray.get(i));
			comboBoxArray.add(comboToAdd);
			
		}
		
		return(comboBoxArray);
	}

	
	public ArrayList<JButton> buttonGenerator (ArrayList<String> buttonArray) {
		
		ArrayList<JButton> buttonArrayList = new ArrayList<JButton>();
		
		for ( int i = 0 ; i < buttonArray.size(); i++ ) {
			JButton buttonToAdd = new JButton(buttonArray.get(i));
			buttonToAdd.setName(buttonArray.get(i));
			buttonArrayList.add(buttonToAdd);
			
		}
		
		return(buttonArrayList);
	}

}
