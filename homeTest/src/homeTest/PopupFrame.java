package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopupFrame extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	JFrame popUp = new JFrame();
	JPanel popUpPanel = new JPanel();
	JPanel popUpMessagePanel = new JPanel();
	JPanel popUpButtonPanel = new JPanel();
	JLabel popUpMessage = new JLabel();
	JButton popUpAcceptButton = new JButton("Accept");
	JButton popUpDeclineButton = new JButton("Decline");
	String source;
	String labelText;
	Boolean goNoGo;
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public PopupFrame (String source) {
		

		this.source = source;
		
		formatColours = colours.returnFormatColours();
		
		popUp.setUndecorated(true);
		popUp.setMinimumSize(new Dimension(600, 200));
		popUp.setMaximumSize(new Dimension(600, 200));
		popUp.setLocationRelativeTo(null);
		textSetter();
		
		popUpMessage.setText(labelText);
		popUpMessagePanel.add(popUpMessage);
		
		popUpAcceptButton.addActionListener(this);
		popUpDeclineButton.addActionListener(this);
		
		popUpButtonPanel.add(popUpAcceptButton);
		popUpButtonPanel.add(popUpDeclineButton);
		
		
		popUpPanel.setLayout(new BoxLayout(popUpPanel, BoxLayout.Y_AXIS));
		popUpPanel.add(popUpMessagePanel);
		popUpPanel.add(popUpButtonPanel);
		popUpPanel.setAlignmentX(popUpMessagePanel.CENTER_ALIGNMENT);
		popUpPanel.setAlignmentX(popUpButtonPanel.CENTER_ALIGNMENT);
		popUpPanel.setBorder(BorderFactory.createLineBorder(formatColours.get("Red"), 10));
		
		popUp.add(popUpPanel);
		
	}
	
	public void returnPopUpFrame () {
		popUp.setVisible(true);
		//return(popUp);
	}
	
	public void textSetter() {
		
		if (source.equals("removeBatchJob")) {
			labelText = "You are about to remove a batch job. please confirm if this is what you want to do.";
		}
		else if (source.equals("addBatchJob")) {
			labelText = "You are about to add a batch job. please confirm if this is what you want to do.";
		}
		else if (source.equals("removeUser")) {
			labelText = "You are about to remove a user. please confirm if this is what you want to do.";
		}
		else if (source.equals("addUser")) {
			labelText = "You are about to add a user. please confirm if this is what you want to do.";
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == popUpAcceptButton) {
			//run sql script
			goNoGo = true;
			popUp.dispose();
		}
		else if(e.getSource() == popUpDeclineButton) {
			//stop sql script
			goNoGo = false;
			popUp.dispose();
		}
		else {
			System.out.println("What are you up to?");
		}
		
	}

}
