package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel {
	
	JPanel titlePanel = new JPanel();
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public TitlePanel () {
		
		formatColours = colours.returnFormatColours();
		titlePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		titlePanel.setBackground(formatColours.get("Navy"));
		
		JLabel titleLabel = new JLabel();
		JLabel descriptionLabel = new JLabel();
		JPanel titleTextPanel = new JPanel();
		JPanel titleDescriptionPanel = new JPanel();
		
		titleLabel.setText("Batch Job Search Screen");
		titleLabel.setForeground(formatColours.get("White"));
		descriptionLabel.setText("Use the drop downs to search for Batch Jobs");
		descriptionLabel.setForeground(formatColours.get("White"));
		
		titleTextPanel.add(titleLabel);
		titleTextPanel.setBackground(formatColours.get("Navy"));
		titleDescriptionPanel.add(descriptionLabel);
		titleDescriptionPanel.setBackground(formatColours.get("Navy"));
		
		titleTextPanel.setAlignmentX(titleLabel.CENTER_ALIGNMENT);
		titleDescriptionPanel.setAlignmentX(descriptionLabel.CENTER_ALIGNMENT);
		
		titlePanel.add(Box.createRigidArea(new Dimension(10, 10)));
		titlePanel.add(titleTextPanel);
		titlePanel.add(Box.createRigidArea(new Dimension(10, 10)));
		titlePanel.add(titleDescriptionPanel);
		titlePanel.add(Box.createRigidArea(new Dimension(20, 20)));
		
	}
	
	public JPanel returnTitlePanel () {
		titlePanel.setVisible(true);
		return(titlePanel);
	}
}
