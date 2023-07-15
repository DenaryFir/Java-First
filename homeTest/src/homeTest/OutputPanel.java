package homeTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OutputPanel implements ActionListener {
	
	TabbedPanel tabbedPanel;
	JPanel outputPanel = new JPanel();
	JPanel outputEditBJPanel = new JPanel();

	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public OutputPanel (TabbedPanel tabbedPanel) {
		
		this.tabbedPanel = tabbedPanel;
		
		formatColours = colours.returnFormatColours();
		outputPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
		outputPanel.setBackground(formatColours.get("Lime"));
		
		ArrayList<String> bjResultSet = new ArrayList<String>();
		
		bjResultSet.add("testOne");
		bjResultSet.add("testTwo");
		bjResultSet.add("testThree");
		bjResultSet.add("testFour");
		bjResultSet.add("testFive");
		
		addDisplayPanelsToOutputPanel(bjResultSet);
		
	}
	
	public JPanel returnOutputPanel () {
		outputPanel.setVisible(true);	
		return(outputPanel);
	}
	
	public void addDisplayPanelsToOutputPanel (ArrayList<String> bjResultSet) {
		
		for (int i = 0 ; i < bjResultSet.size() ; i ++ ) {
			
			JButton editBatchJob;
			JButton deleteBatchJob;
			
			JPanel outputDisplayBJPanel = new JPanel();
			outputDisplayBJPanel.setLayout(new FlowLayout());
			outputDisplayBJPanel.setBackground(formatColours.get("Lime"));
			
			JPanel outputDisplayTextJPanel = new JPanel();
			outputDisplayTextJPanel.setBackground(formatColours.get("Lime"));
			JLabel outputText = new JLabel();
			outputText.setText(bjResultSet.get(i));
			outputDisplayTextJPanel.add(outputText);
			
			JPanel outputDisplayButtonJPanel = new JPanel();
			
			editBatchJob = new JButton("Edit");
			editBatchJob.setName("edit");
			editBatchJob.addActionListener(this);
			deleteBatchJob = new JButton("Delete");
			deleteBatchJob.setName("delete");
			deleteBatchJob.addActionListener(this);
			
			outputDisplayButtonJPanel.setBackground(formatColours.get("Lime"));
			outputDisplayButtonJPanel.add(editBatchJob);
			outputDisplayButtonJPanel.add(deleteBatchJob);
			
			outputDisplayBJPanel.add(outputDisplayTextJPanel);
			outputDisplayBJPanel.add(outputDisplayButtonJPanel);
			
			outputPanel.add(outputDisplayBJPanel);
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton sourceButton = (JButton) e.getSource();
		String sourceName = sourceButton.getName();
		
		if(sourceName.equals("edit")) {
			tabbedPanel.showChangeBatchJobCard();
		}
		else if(sourceName.equals("delete")) {
			//delete batch job code
			//need to pass identifying (batch job id) info to this too so correct batch job is deleted
			String source = "removeBatchJob";
			PopupFrame popUp = new PopupFrame(source);
			popUp.returnPopUpFrame();
			
		}
		else {
			System.out.println("You are out of bounds dude");
		}
	}

}
