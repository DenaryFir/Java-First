package homeTest;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class uiDataPanel {
	
	public uiDataPanel() {
			
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));
		dataPanel.setPreferredSize(new Dimension(120, 250));
		dataPanel.setBackground(Color.green);	
		
	}

}
