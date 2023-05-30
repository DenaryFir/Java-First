package homeTest;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ui {

	private JFrame window;
	
	public ui () {
		window  = new JFrame();
		window.setTitle("JFrame title");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(600, 250);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));
		dataPanel.setPreferredSize(new Dimension(120, 250));
		dataPanel.setBackground(Color.green);
		
		
		
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
		
		JPanel outputPanel = new JPanel();
		GridLayout outputPanelGrid = new GridLayout(2, 4);
		outputPanel.setLayout(outputPanelGrid);
		outputPanel.setPreferredSize(new Dimension(120, 125));
		outputPanel.setBackground(Color.blue);
		
		dataPanel.add(inputPanel);
		dataPanel.add(outputPanel);
		

		
		JLabel label = new JLabel();
		
		JPanel taskbarPanel = new JPanel();
		taskbarPanel.setLayout(new BoxLayout(taskbarPanel, BoxLayout.Y_AXIS));
		taskbarPanel.add(label);
		taskbarPanel.setBackground(Color.red);
		taskbarPanel.setPreferredSize(new Dimension(60, 10));
		taskbarPanel.setMaximumSize(new Dimension(60,250));
		
		taskbarPanel.add(Box.createRigidArea(new Dimension(60,10)));
		Button button = new Button("One");
		button.setMaximumSize(new Dimension(50,15));
		Button buttonTwo = new Button("Two");
		buttonTwo.setMaximumSize(new Dimension(50,15));
		Button buttonThree = new Button("Three");
		buttonThree.setMaximumSize(new Dimension(50,15));
		Button buttonFour = new Button("Four");
		buttonFour.setMaximumSize(new Dimension(50,15));
		
		
		taskbarPanel.add(button);
		taskbarPanel.add(Box.createRigidArea(new Dimension(60,10)));
		taskbarPanel.add(buttonTwo);
		taskbarPanel.add(Box.createRigidArea(new Dimension(60,10)));
		taskbarPanel.add(buttonThree);
		taskbarPanel.add(Box.createRigidArea(new Dimension(60,10)));
		taskbarPanel.add(buttonFour);
		
		//window.add(outputPanel);
		window.add(dataPanel);
		window.add(taskbarPanel, BorderLayout.WEST);
	}
	
	public void show() {
		window.setVisible(true);
	}
}

//JLabel label = new JLabel();
//
//JPanel taskbarPanel = new JPanel();
//taskbarPanel.setLayout(new BoxLayout(taskbarPanel, BoxLayout.PAGE_AXIS));
//taskbarPanel.add(label);
//taskbarPanel.setBackground(Color.red);
//taskbarPanel.setPreferredSize(new Dimension(60, 10));
//
//Button button = new Button("button");
//taskbarPanel.add(button);
//taskbarPanel.add(Box.createRigidArea(new Dimension(0,5)));
//Button button1 = new Button("button1");
//taskbarPanel.add(button1);
