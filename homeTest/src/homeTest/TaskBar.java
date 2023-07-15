package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TaskBar implements ActionListener {

	JPanel taskBar = new JPanel();
	TabbedPanel tabbedPanel;
	
	JButton cannedCommentsButton = new JButton("Canned Comments");
	JButton batchJobSearchButton = new JButton("Batch Job Search");
	JButton changeUserButton = new JButton("Change User");
	JButton changeBatchJobButton = new JButton("Change Batch Job");
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	
	public TaskBar (TabbedPanel tabbedPanel)  {
		
		this.tabbedPanel = tabbedPanel;
		
		formatColours = colours.returnFormatColours();
		
		
		BoxLayout taskBarLayout = new BoxLayout(taskBar, BoxLayout.Y_AXIS);
		taskBar.setLayout(taskBarLayout);
		taskBar.setBackground(formatColours.get("Orange"));
		
		
		cannedCommentsButton.setName("Canned Comments");
		cannedCommentsButton.addActionListener(this);
		
		batchJobSearchButton.setName("Batch Job Search");
		batchJobSearchButton.addActionListener(this);
		
		changeUserButton.setName("Change User");
		changeUserButton.addActionListener(this);
		
		changeBatchJobButton.setName("Change Batch Job");
		changeBatchJobButton.addActionListener(this);
		
		taskBar.add(Box.createRigidArea(new Dimension(10, 10)));
		taskBar.add(cannedCommentsButton);
		taskBar.add(Box.createRigidArea(new Dimension(10, 10)));
		taskBar.add(batchJobSearchButton);
		taskBar.add(Box.createRigidArea(new Dimension(10, 10)));
		taskBar.add(changeUserButton);
		taskBar.add(Box.createRigidArea(new Dimension(10, 10)));
		taskBar.add(changeBatchJobButton);
		taskBar.add(Box.createRigidArea(new Dimension(10, 10)));
		
		
	}
	
	public JPanel returnTaskBar() {
		taskBar.setVisible(true);
		return(taskBar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		

		if(e.getSource() == cannedCommentsButton) {
			tabbedPanel.showCannedCommentsCard();
		}
		else if(e.getSource() == batchJobSearchButton) {
			tabbedPanel.showBatchJobSearchCard();
		}
		else if(e.getSource() == changeUserButton) {
			tabbedPanel.showChangeUserCard();
		}
		else if(e.getSource() == changeBatchJobButton) {
			tabbedPanel.showChangeBatchJobCard();
		}
		else {
			System.out.println("There's an error with what you just clicked");
		}
		
	}
	
}
