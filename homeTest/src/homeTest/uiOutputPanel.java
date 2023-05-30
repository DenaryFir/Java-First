package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class uiOutputPanel {

	
	public uiOutputPanel() {
		
		JPanel outputPanel = new JPanel();
		GridLayout outputPanelGrid = new GridLayout(2, 4);
		outputPanel.setLayout(outputPanelGrid);
		outputPanel.setPreferredSize(new Dimension(120, 125));
		outputPanel.setBackground(Color.blue);
		
	}
}
