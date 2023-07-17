package homeTest;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMaker extends JPanel implements ActionListener {
	
	/*
	 * layout
	 * colour
	 * title
	 * description
	 * labels and userinput (these should always be the same
	 * buttons
	 */
	
	String backgroundLayout;
	String backgroundColour;
	String foregroundColour;
	String titleText;
	String descriptionText;
	TabbedPanel tabbedPanel;
	Boolean goNoGo;
	ArrayList<String> titleNamesArray = new ArrayList<String>();
	ArrayList<String> labelNamesArray = new ArrayList<String>();
	ArrayList<String> buttonNamesArray = new ArrayList<String>();
	ArrayList<String> comboboxNamesArray = new ArrayList<String>();
	ArrayList<String> userInput = new ArrayList<String>();
	ArrayList<JLabel> labelArray = new ArrayList<JLabel>();
	ArrayList<JComboBox> comboboxArray = new ArrayList<JComboBox>();
	ArrayList<JButton> buttonArray = new ArrayList<JButton>();
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	Format colours = new Format();

	JPanel madePanel = new JPanel();
	
	public PanelMaker(ArrayList<ArrayList<String>> panelDetail, TabbedPanel tabbedPanel) {
			
		this.tabbedPanel = tabbedPanel;
		
		/*
		 * panelDetail must always come in this order
		 * 0 - layout code 
		 * 1 - colour code (0 = background, 1 = foreground)
		 * 2 - title/description text (0 = titleText, 1 = descriptionText)
		 * 3 - label/user input
		 * 4 - button names
		 * 
		 * steps must be:
		 * 1 set layout and background colour
		 * 2 create labels from description and title and add to panels
		 * add title and description panels to main panel
		 * create labels and user input
		 * create panels with labels and user input
		 * add panels to main panel
		 * create buttons from button array
		 * add buttons to main panel
		 * fin
		 */
		
		madePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		backgroundLayout = panelDetail.get(0).get(0);
		backgroundColour = panelDetail.get(0).get(1);
		foregroundColour = panelDetail.get(0).get(2);
		titleNamesArray = panelDetail.get(1);
		labelNamesArray = panelDetail.get(2);
		comboboxNamesArray = panelDetail.get(3);
		buttonNamesArray = panelDetail.get(4);

		layoutPicker();
		colourPicker();
		
		DetailMaker detailMaker = new DetailMaker();
		
		labelArray = detailMaker.labelGenerator(labelNamesArray);
		comboboxArray = detailMaker.comboBoxGenerator(comboboxNamesArray);
		buttonArray = detailMaker.buttonGenerator(buttonNamesArray);
		
		titleDescriptionMaker();
		labelAndUserInputMaker();
		buttonMaker();
		
		
	}
	
	public JPanel returnPanel() {
		return(madePanel);
	}
	
	public void layoutPicker() {
		
		if(backgroundLayout.equals("boxX")) {
			
			madePanel.setLayout(new BoxLayout(madePanel, BoxLayout.X_AXIS));
		}
		if(backgroundLayout.equals("boxY")) {
			madePanel.setLayout(new BoxLayout(madePanel, BoxLayout.Y_AXIS));
		}
		if(backgroundLayout.equals("grid")) {
			madePanel.setLayout(new GridLayout( 0, 5 ));
		}
		if(backgroundLayout.equals("flow")) {
			madePanel.setLayout(new FlowLayout());
		}
		
	}
	
	public void colourPicker() {
		formatColours = colours.returnFormatColours();
		madePanel.setBackground(formatColours.get(backgroundColour));
	}

	public void titleDescriptionMaker() {
		
		if ( titleNamesArray.size() > 0 ) {
		madePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabel title = new JLabel();
		madePanel.add(Box.createHorizontalGlue());
		title.setName(titleNamesArray.get(0));
		title.setText(titleNamesArray.get(0));

		title.setForeground(formatColours.get(foregroundColour));
		
		madePanel.add(title);
		
		//madePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		JLabel description = new JLabel();
		description.setName(titleNamesArray.get(1));
		description.setText(titleNamesArray.get(1));
		description.setForeground(formatColours.get(foregroundColour));
		madePanel.add(description);
		
		}
	}
	
	public void labelAndUserInputMaker() {
		
		for ( int i = 0 ; i < labelArray.size() ; i ++ ) {
			
			JPanel panelToAddJPanel = new JPanel();
			
			panelToAddJPanel.setName(labelArray.get(i).getName());
			panelToAddJPanel.setLayout(new BoxLayout(panelToAddJPanel, BoxLayout.Y_AXIS));
			panelToAddJPanel.setBackground(formatColours.get(backgroundColour));
			labelArray.get(i).setForeground(formatColours.get(foregroundColour));
			panelToAddJPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
			panelToAddJPanel.setBorder(BorderFactory.createEmptyBorder(50,25,50,25));
			panelToAddJPanel.add(labelArray.get(i));
			
			if ( comboboxArray.size() > 0 ) {
				comboboxArray.get(i).setMaximumSize(new Dimension (200, 100));
				panelToAddJPanel.add(comboboxArray.get(i));
			}

			
			madePanel.add(panelToAddJPanel);
					
		}
		
	}
	
	public void buttonMaker() {
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(formatColours.get(backgroundColour));
		
		for ( int i = 0 ; i < buttonArray.size() ; i ++ ) {
			
			buttonPanel.add(buttonArray.get(i));
			buttonArray.get(i).addActionListener(this);
			buttonPanel.add(buttonArray.get(i));
			
		}	
		
		madePanel.add(buttonPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed.getName().equals("Search")) {

			userInput = getUserInputValues();
					
		}
		else if (buttonPressed.getName().equals("Clear")) {
			//got one in finally
			comboboxArray.forEach( (n) -> {n.setSelectedItem(null);} );

		}
		else if (buttonPressed.getName().equals("Edit")) {
			tabbedPanel.showChangeBatchJobCard();
			System.out.println("Edit");

					
		}
		else if (buttonPressed.getName().equals("Add")) {
			String source = "addUser";
			DataValidator dataValidator = new DataValidator();
			userInput = getUserInputValues();
			Boolean nullValidated = dataValidator.isNullChecker(userInput.get(0));
			Boolean staffIDValidated = dataValidator.staffIDChecker(userInput.get(0));
	
			if ( nullValidated == true && staffIDValidated == true ) {
				PopupFrame popUp = new PopupFrame(source, this);
				popUp.returnPopUpFrame();			
			}
			else {
				System.out.println("oops");
			}
			

					
		}
		else if (buttonPressed.getName().equals("Delete")) {
			String source = "removeUser";
			System.out.println("Delete");
			PopupFrame popUp = new PopupFrame(source, this);
			popUp.returnPopUpFrame();
					
		}
					
		else if (buttonPressed.getName().equals("Canned Comments")) {
			String source = "removeBatchJob";
			System.out.println("Canned Comments");
					
		}
		else if (buttonPressed.getName().equals("Batch Job Search")) {
			String source = "removeBatchJob";
			System.out.println("Batch Job Search");
					
		}
		else if (buttonPressed.getName().equals("Change User")) {
			String source = "removeBatchJob";
			System.out.println("Change User");
					
		}
		else if (buttonPressed.getName().equals("Change Batch Jobs")) {
			String source = "removeBatchJob";
			System.out.println("Change Batch Jobs");
					
		}

		else {
			System.out.println("How have you done this?");
		}
	}

	public ArrayList<String> getUserInputValues () {
		comboboxArray.forEach( (n) -> {userInput.add( (String) n.getSelectedItem()) ; } );
		return(userInput);
	}
}
