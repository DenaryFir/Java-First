package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputPanel implements ActionListener {
	
	JPanel inputPanel = new JPanel();
	JButton clearButton = new JButton();
	JButton searchButton = new JButton();
	ArrayList<JLabel> labelArray = new ArrayList<JLabel>();
	ArrayList<JComboBox> userInputArray = new ArrayList<JComboBox>();
	ArrayList<JButton> buttonArray = new ArrayList<JButton>();
	
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public InputPanel (ArrayList<ArrayList<String>> inputPanelDetail) {
		
		DetailMaker detailMaker = new DetailMaker();
		
		labelArray = detailMaker.labelGenerator(inputPanelDetail.get(1));
		userInputArray = detailMaker.comboBoxGenerator(inputPanelDetail.get(1));
		buttonArray = detailMaker.buttonGenerator(inputPanelDetail.get(2));
		
		formatColours = colours.returnFormatColours();
		inputPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		inputPanel.setLayout(new GridLayout( 0, 5 ));
		inputPanel.setBackground(formatColours.get(inputPanelDetail.get(0).get(0)));
		//inputPanel.setPreferredSize(new Dimension(1000, 150));
		
		for ( int i = 0 ; i < labelArray.size() ; i ++ ) {
			
			JPanel panelToAddJPanel = new JPanel();
			
			panelToAddJPanel.setName(labelArray.get(i).getName());
			panelToAddJPanel.setLayout(new BoxLayout(panelToAddJPanel, BoxLayout.Y_AXIS));
			panelToAddJPanel.setBackground(formatColours.get(inputPanelDetail.get(0).get(0)));
			labelArray.get(i).setForeground(formatColours.get(inputPanelDetail.get(0).get(1)));
			panelToAddJPanel.setAlignmentY(panelToAddJPanel.CENTER_ALIGNMENT);
			panelToAddJPanel.add(labelArray.get(i));
			panelToAddJPanel.add(userInputArray.get(i));
			
			inputPanel.add(panelToAddJPanel);
					
		}

		for ( int i = 0 ; i < buttonArray.size() ; i ++ ) {

			buttonArray.get(i).addActionListener(this);
			inputPanel.add(buttonArray.get(i));
			
		}	
		
	}
	
	public JPanel returnInputPanel () {
		inputPanel.setVisible(true);
		return(inputPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == searchButton) {
			String source = "removeBatchJob";
			PopupFrame popUp = new PopupFrame(source);
			popUp.returnPopUpFrame();
			
			
		}
		else if (e.getSource() == clearButton) {
			
		}
		else {
			System.out.println("How have you done this?");
		}
	}

}
