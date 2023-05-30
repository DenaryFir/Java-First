package homeTest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class uiTaskBar {
	
	public uiTaskBar() {
	
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
	
	}

}
