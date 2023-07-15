package homeTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddUser implements ActionListener {
	
	JPanel addUser = new JPanel();
	JTextField userName;
	JTextField userID;
	JButton addUserButton;
	JButton clearButton;
	Boolean GoNoGo;
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public AddUser () {
		
		formatColours = colours.returnFormatColours();
		
		addUser.setBackground(formatColours.get("Navy"));
		addUser.setLayout(new BoxLayout(addUser, BoxLayout.Y_AXIS));
		addUser.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(formatColours.get("Navy"));
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		JLabel titleLabel = new JLabel();
		titleLabel.setText("This is the Add User Panel");
		titleLabel.setForeground(formatColours.get("White"));
		JLabel descriptionLabel = new JLabel();
		descriptionLabel.setText("Please select staff id of user to add then press delete");
		descriptionLabel.setForeground(formatColours.get("White"));
		titlePanel.add(titleLabel);
		titlePanel.add(descriptionLabel);
		
		JPanel userInputPanel = new JPanel();
		userInputPanel.setBackground(formatColours.get("Navy"));
		userInputPanel.setLayout(new BoxLayout(userInputPanel, BoxLayout.Y_AXIS));		
		JLabel userInputLabel = new JLabel();
		userInputLabel.setText("Select Staff ID");
		userInputLabel.setForeground(formatColours.get("White"));
		JPanel userInputFieldPanel = new JPanel();
		userInputFieldPanel.setBackground(formatColours.get("Navy"));
		userInputFieldPanel.setLayout(new BoxLayout(userInputFieldPanel, BoxLayout.X_AXIS));		
		userInputFieldPanel.add(Box.createRigidArea(new Dimension(50, 10)));
		userName = new JTextField();
		userName.setMaximumSize(new Dimension(300, 100));
		userID = new JTextField();
		userID.setMaximumSize(new Dimension(300, 100));
		userInputFieldPanel.add(userName);
		userInputFieldPanel.add(userID);
		userInputPanel.add(userInputLabel);
		userInputPanel.add(userInputFieldPanel);
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(formatColours.get("Navy"));
		buttonPanel.setLayout(new FlowLayout());		
		addUserButton = new JButton("Add User");
		addUserButton.setName("add");
		addUserButton.addActionListener(this);
		clearButton = new JButton("Clear Selection");
		clearButton.setName("clear");
		clearButton.addActionListener(this);
		buttonPanel.add(addUserButton);
		buttonPanel.add(clearButton);
		
		addUser.add(Box.createRigidArea(new Dimension(100, 10)));
		addUser.add(titlePanel);
		addUser.add(Box.createRigidArea(new Dimension(100, 10)));
		addUser.add(userInputPanel);
		addUser.add(Box.createRigidArea(new Dimension(100, 10)));
		addUser.add(buttonPanel);
		addUser.add(Box.createRigidArea(new Dimension(100, 10)));
		
	}
	
	public JPanel returnAddUserPanel() {	
		return(addUser);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addUserButton) {
			getUserInput();
		}
		else if (e.getSource() == clearButton) {
			clearUserInput();
		}
		else {
			System.out.print("How did you get here?");
		}
			
	}
	
	public void getUserInput( ) {
		String userNameValue = userName.getText();
		String userIDValue = userID.getText();
		
		DataValidator dataCheck = new DataValidator();
		
		Boolean userNameNullCheck = dataCheck.isNullChecker(userNameValue);
		Boolean userIDNullCheck = dataCheck.isNullChecker(userIDValue);
		
		if ( userIDNullCheck == true || userNameNullCheck == true ) {
			System.out.println("Fill out the boxes man");
		}
		else {
			Boolean result = dataCheck.staffIDChecker(userIDValue);
			
			if ( result == true ) {
				String source = "addUser";
				PopupFrame popup = new PopupFrame(source);
				popup.returnPopUpFrame();
			}
		}
	}
	
	public void clearUserInput () {
		userName.setText("");
		userID.setText("");
	}

}
