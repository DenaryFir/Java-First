package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public InputPanel () {
		
		formatColours = colours.returnFormatColours();
		inputPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		inputPanel.setLayout(new GridLayout( 0, 5 ));
		inputPanel.setBackground(formatColours.get("Navy"));
		//inputPanel.setPreferredSize(new Dimension(1000, 150));
		
		JPanel startDatePanel = new JPanel();
		startDatePanel.setName("StartDatePanel");
		startDatePanel.setLayout(new BoxLayout(startDatePanel, BoxLayout.Y_AXIS));
		startDatePanel.setBackground(formatColours.get("Navy"));
		startDatePanel.setAlignmentY(startDatePanel.CENTER_ALIGNMENT);
		JLabel startDateLabel = new JLabel("Start Date");
		startDateLabel.setForeground(formatColours.get("White"));
		JComboBox startDateCombo = new JComboBox();
		startDatePanel.add(startDateLabel);
		startDatePanel.add(startDateCombo);
		inputPanel.add(startDatePanel);
		
		JPanel endDatePanel = new JPanel();
		endDatePanel.setName("endDate");
		endDatePanel.setLayout(new BoxLayout(endDatePanel, BoxLayout.Y_AXIS));
		endDatePanel.setBackground(formatColours.get("Navy"));
		endDatePanel.setAlignmentY(endDatePanel.CENTER_ALIGNMENT);
		JLabel endDateLabel = new JLabel("End Date");
		endDateLabel.setForeground(formatColours.get("White"));
		JComboBox endDateCombo = new JComboBox();
		endDatePanel.add(endDateLabel);
		endDatePanel.add(endDateCombo);
		inputPanel.add(endDatePanel);
		
		JPanel startTimePanel = new JPanel();
		startTimePanel.setName("startTime");
		startTimePanel.setLayout(new BoxLayout(startTimePanel, BoxLayout.Y_AXIS));
		startTimePanel.setBackground(formatColours.get("Navy"));
		startTimePanel.setAlignmentY(startTimePanel.CENTER_ALIGNMENT);
		JLabel startTimeLabel = new JLabel("Start Time");
		startTimeLabel.setForeground(formatColours.get("White"));
		JComboBox startTimeCombo = new JComboBox();
		startTimePanel.add(startTimeLabel);
		startTimePanel.add(startTimeCombo);
		inputPanel.add(startTimePanel);
		
		JPanel endTimePanel = new JPanel();
		endTimePanel.setName("endTime");
		endTimePanel.setLayout(new BoxLayout(endTimePanel, BoxLayout.Y_AXIS));
		endTimePanel.setBackground(formatColours.get("Navy"));
		endTimePanel.setAlignmentY(endTimePanel.CENTER_ALIGNMENT);
		JLabel endTimeLabel = new JLabel("End Time");
		endTimeLabel.setForeground(formatColours.get("White"));
		JComboBox endTimeCombo = new JComboBox();
		endTimePanel.add(endTimeLabel);
		endTimePanel.add(endTimeCombo);
		inputPanel.add(endTimePanel);
		
		JPanel frequencyPanel = new JPanel();
		frequencyPanel.setName("frequency");
		frequencyPanel.setLayout(new BoxLayout(frequencyPanel, BoxLayout.Y_AXIS));
		frequencyPanel.setBackground(formatColours.get("Navy"));
		frequencyPanel.setAlignmentY(frequencyPanel.CENTER_ALIGNMENT);
		JLabel frequecyLabel = new JLabel("Frequency");
		frequecyLabel.setForeground(formatColours.get("White"));
		JComboBox frequencyCombo = new JComboBox();
		frequencyPanel.add(frequecyLabel);
		frequencyPanel.add(frequencyCombo);
		inputPanel.add(frequencyPanel);
		
		JPanel bjNamePanel = new JPanel();
		bjNamePanel.setName("bjName");
		bjNamePanel.setLayout(new BoxLayout(bjNamePanel, BoxLayout.Y_AXIS));
		bjNamePanel.setBackground(formatColours.get("Navy"));
		bjNamePanel.setAlignmentY(bjNamePanel.CENTER_ALIGNMENT);
		JLabel bjNameLabel = new JLabel("Batch Job Name");
		bjNameLabel.setForeground(formatColours.get("White"));
		JComboBox bjNameCombo = new JComboBox();
		bjNamePanel.add(bjNameLabel);
		bjNamePanel.add(bjNameCombo);
		inputPanel.add(bjNamePanel);
		
		JPanel applicationPanel = new JPanel();
		applicationPanel.setName("application");
		applicationPanel.setLayout(new BoxLayout(applicationPanel, BoxLayout.Y_AXIS));
		applicationPanel.setBackground(formatColours.get("Navy"));
		applicationPanel.setAlignmentY(applicationPanel.CENTER_ALIGNMENT);
		JLabel applicationLabel = new JLabel("Application");
		applicationLabel.setForeground(formatColours.get("White"));
		JComboBox applicationCombo = new JComboBox();
		applicationPanel.add(applicationLabel);
		applicationPanel.add(applicationCombo);
		inputPanel.add(applicationPanel);
		
		JPanel bjIDPanel = new JPanel();
		bjIDPanel.setName("bjID");
		bjIDPanel.setLayout(new BoxLayout(bjIDPanel, BoxLayout.Y_AXIS));
		bjIDPanel.setBackground(formatColours.get("Navy"));
		bjIDPanel.setAlignmentY(bjIDPanel.CENTER_ALIGNMENT);
		JLabel bjIDLabel = new JLabel("Batch Job ID");
		bjIDLabel.setForeground(formatColours.get("White"));
		JComboBox bjIDCombo = new JComboBox();
		bjIDPanel.add(bjIDLabel);
		bjIDPanel.add(bjIDCombo);
		inputPanel.add(bjIDPanel);
		

		searchButton.setName("searchButton");
		searchButton.setText("Search");
		searchButton.addActionListener(this);
		inputPanel.add(searchButton);

		clearButton.setName("clearButton");
		clearButton.setText("Clear");
		clearButton.addActionListener(this);
		inputPanel.add(clearButton);
		
		
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
