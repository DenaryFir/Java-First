package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class uiInputPanel {
	
	public uiInputPanel() {
		
		JPanel inputPanel = new JPanel();
		GridLayout inputPanelGrid = new GridLayout(1, 4);
		inputPanel.setLayout(inputPanelGrid);
		inputPanel.setPreferredSize(new Dimension(120, 125));
		inputPanel.setBackground(Color.orange);
		
//		JLabel inputCTASKLabel = new JLabel();
//		inputCTASKLabel.setText("CTASK");
		JLabel inputStartDateLabel = new JLabel();
		inputStartDateLabel.setText("Start Date");
		JLabel inputStartTimeLabel = new JLabel();
		inputStartTimeLabel.setText("Start Time");
		JLabel inputEndDateLabel = new JLabel();
		inputEndDateLabel.setText("End Date");
		JLabel inputEndTimeLabel = new JLabel();
		inputEndTimeLabel.setText("End Time");
		
		inputPanel.add(inputStartDateLabel);
		inputPanel.add(inputStartTimeLabel);
		inputPanel.add(inputEndDateLabel);
		inputPanel.add(inputEndTimeLabel);
		
	}

}
