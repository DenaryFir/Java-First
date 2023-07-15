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

public class DeleteUser implements ActionListener {
	
	JPanel deleteUser = new JPanel();
	JButton deleteUserButton;
	JButton clearButton;
	JComboBox userList;
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();
	
	public DeleteUser () {
		
		formatColours = colours.returnFormatColours();
		
		deleteUser.setBackground(formatColours.get("Lime"));
		deleteUser.setLayout(new BoxLayout(deleteUser, BoxLayout.Y_AXIS));
		deleteUser.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	
		JPanel titlePanel = new JPanel();
		
		titlePanel.setBackground(formatColours.get("Lime"));
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		JLabel titleLabel = new JLabel();
		titleLabel.setText("This is the Delete User Panel");
		JLabel descriptionLabel = new JLabel();
		descriptionLabel.setText("Please select staff id of user to delete then press delete");
		titlePanel.add(titleLabel);
		titlePanel.add(descriptionLabel);
		JPanel userInputPanel = new JPanel();
		userInputPanel.setBackground(formatColours.get("Lime"));
		userInputPanel.setLayout(new BoxLayout(userInputPanel, BoxLayout.Y_AXIS));		
		JLabel userInputLabel = new JLabel();
		userInputLabel.setText("Select Staff ID");
		userList = new JComboBox();
		userList.setMaximumSize(new Dimension(300, 100));
		userInputPanel.add(userInputLabel);
		userInputPanel.add(userList);
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(formatColours.get("Lime"));
		buttonPanel.setLayout(new FlowLayout());		
		deleteUserButton = new JButton("Delete User");
		deleteUserButton.setName("delete");
		deleteUserButton.addActionListener(this);
		clearButton = new JButton("Clear Selection");
		clearButton.setName("clear");
		clearButton.addActionListener(this);
		buttonPanel.add(deleteUserButton);
		buttonPanel.add(clearButton);
		
		deleteUser.add(Box.createRigidArea(new Dimension(100, 10)));
		deleteUser.add(titlePanel);
		deleteUser.add(Box.createRigidArea(new Dimension(100, 10)));
		deleteUser.add(userInputPanel);
		deleteUser.add(Box.createRigidArea(new Dimension(100, 10)));
		deleteUser.add(buttonPanel);
		deleteUser.add(Box.createRigidArea(new Dimension(100, 10)));
		
	}
	
	public JPanel returnDeleteUserPanel() {	
		return(deleteUser);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == deleteUserButton) {
			
			String userListValue = (String) userList.getSelectedItem();
			
			if( userListValue != null ) { 
				
				String source = "removeUser";
				PopupFrame popup = new PopupFrame(source);
				popup.returnPopUpFrame();
			}
		}
		else if (e.getSource() == clearButton) {
			userList.setSelectedItem(null);
		}
		else {
			System.out.print("How did you get here?");
		}
			
	}

}
