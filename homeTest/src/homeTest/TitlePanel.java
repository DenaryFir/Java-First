package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel {
	
	JPanel titlePanel = new JPanel();
	ArrayList<JLabel> labelArrayList = new ArrayList<JLabel>();
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public TitlePanel (ArrayList<ArrayList<String>> titlePanelDetail) {
		
		DetailMaker detail = new DetailMaker();
		
		labelArrayList = detail.labelGenerator(titlePanelDetail.get(1));
		
		formatColours = colours.returnFormatColours();
		titlePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		titlePanel.setBackground(formatColours.get(titlePanelDetail.get(0).get(0)));
		
		labelArrayList.get(0).setForeground(formatColours.get(titlePanelDetail.get(0).get(1)));
		labelArrayList.get(1).setForeground(formatColours.get(titlePanelDetail.get(0).get(1)));
		
		titlePanel.add(Box.createRigidArea(new Dimension(10, 10)));
		
		for (int i = 0 ; i < labelArrayList.size() ; i ++ ) {
			JPanel panelToAdd = new JPanel();
			panelToAdd.setLayout(new BoxLayout(panelToAdd, BoxLayout.Y_AXIS));
			panelToAdd.setBackground(formatColours.get(titlePanelDetail.get(0).get(0)));
			panelToAdd.add(labelArrayList.get(i));
			panelToAdd.setAlignmentX(labelArrayList.get(i).CENTER_ALIGNMENT);
			titlePanel.add(panelToAdd);
			titlePanel.add(Box.createRigidArea(new Dimension(10, 10)));
		}

		titlePanel.add(Box.createRigidArea(new Dimension(20, 20)));

		
	}
	
	public JPanel returnTitlePanel () {
		titlePanel.setVisible(true);
		return(titlePanel);
	}
}
