package homeTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame {
	
	JFrame window = new JFrame();
	
	public Frame () {
		window.setBackground(Color.black);
		window.setName("window");
		window.setLayout(new BorderLayout());
		window.setSize(new Dimension(1200, 600));
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);

		
		TabbedPanel tabbedPanel = new TabbedPanel();
		JPanel appTabbedPanel = tabbedPanel.returnTabbedPanel();
		
		TaskBar taskBar = new TaskBar(tabbedPanel);
		JPanel appTaskBar = taskBar.returnTaskBar();
		
		window.add(appTaskBar, BorderLayout.WEST);
		window.add(appTabbedPanel, BorderLayout.CENTER);
		
	}
	
	public JFrame returnFrame () {
		window.setVisible(true);
		return(window);
	}

}
