package homeTest;

import java.util.ArrayList;

public class ArrayListDetails {
	/*
	 * panelDetail must always come in this order
	 * 0 - layout code 
	 * 1 - colour code (0 = background, 1 = foreground)
	 * 2 - title/description text (0 = titleText, 1 = descriptionText)
	 * 3 - label/user input
	 * 4 - button names
	 * 
	 * 
	*/
	
	
	ArrayList<ArrayList<String>> panelDetail = new ArrayList<ArrayList<String>>();
	ArrayList<String> colourArrayList = new ArrayList<String>();
	ArrayList<String> titleText = new ArrayList<String>();
	ArrayList<String> labelArrayList = new ArrayList<String>();
	ArrayList<String> userInputArrayList = new ArrayList<String>(); //pointless as if added always the same as label names
	ArrayList<String> buttonArrayList = new ArrayList<String>();
	
	
	//any panel strings outlined below must be named here.. until i get a better understanding of reflection
	public ArrayList<String> panelNames() {
		
		ArrayList<String> panelNamesArray = new ArrayList<String>();
		
		panelNamesArray.add("bjTitleStrings");
		panelNamesArray.add("bjInputStrings");
		panelNamesArray.add("bjOutputStrings");
		panelNamesArray.add("addUserStrings");
		panelNamesArray.add("deleteUserStrings");		
		
		return(panelNamesArray);
	}
	
	public ArrayList<ArrayList<String>> bjTitleStrings () {
		
		panelDetail = new ArrayList<ArrayList<String>>();
		
		colourArrayList.add("boxY");
		colourArrayList.add("Navy");
		colourArrayList.add("White");
		
		titleText.add("Welcome to the Bactch Job Search Page");
		titleText.add("Please select batch job details from the drop down boxes and search for a batch job");
		
		panelDetail.add(colourArrayList);
		panelDetail.add(titleText);
		panelDetail.add(labelArrayList);
		panelDetail.add(userInputArrayList);
		panelDetail.add(buttonArrayList);

		return(panelDetail);
	}
	
	public ArrayList<ArrayList<String>> bjInputStrings () {

		panelDetail = new ArrayList<ArrayList<String>>();
		
		colourArrayList.add("grid");
		colourArrayList.add("Navy");
		colourArrayList.add("White");
		
		labelArrayList.add("Start Date");
		labelArrayList.add("End Date");
		labelArrayList.add("Start Time");
		labelArrayList.add("End Time");
		labelArrayList.add("Frequency");
		labelArrayList.add("Batch Job Name");
		labelArrayList.add("Application Name");
		labelArrayList.add("Batch Job ID");
		
		userInputArrayList.add("Start Date");
		userInputArrayList.add("End Date");
		userInputArrayList.add("Start Time");
		userInputArrayList.add("End Time");
		userInputArrayList.add("Frequency");
		userInputArrayList.add("Batch Job Name");
		userInputArrayList.add("Application Name");
		userInputArrayList.add("Batch Job ID");
		
		buttonArrayList.add("Search");
		buttonArrayList.add("Clear");
		
		panelDetail.add(colourArrayList);
		panelDetail.add(titleText);
		panelDetail.add(labelArrayList);
		panelDetail.add(userInputArrayList);
		panelDetail.add(buttonArrayList);
		
		return(panelDetail);
	}

	public ArrayList<ArrayList<String>> bjOutputStrings () {
		
		panelDetail = new ArrayList<ArrayList<String>>();
		
		colourArrayList.add("flow");
		colourArrayList.add("Lime");
		colourArrayList.add("Black");
		
		labelArrayList.add("Batch Job Detail");
		labelArrayList.add("Additional Comments");

		buttonArrayList.add("Edit");
		buttonArrayList.add("Delete");
		
		panelDetail.add(colourArrayList);
		panelDetail.add(titleText);
		panelDetail.add(labelArrayList);
		panelDetail.add(userInputArrayList);
		panelDetail.add(buttonArrayList);

		return(panelDetail);
	}
	
	public ArrayList<ArrayList<String>> addUserStrings () {
		
		panelDetail = new ArrayList<ArrayList<String>>();
		
		colourArrayList.add("boxY");
		colourArrayList.add("Navy");
		colourArrayList.add("White");
		
		titleText.add("Welcome to the Bactch Job Search Page");
		titleText.add("Please select batch job details from the drop down boxes and search for a batch job");
		
		labelArrayList.add("Staff Name");
		labelArrayList.add("Staff ID");
		
		userInputArrayList.add("Staff Name");
		userInputArrayList.add("Staff ID");

		buttonArrayList.add("Add");
		buttonArrayList.add("Clear");
		
		panelDetail.add(colourArrayList);
		panelDetail.add(titleText);
		panelDetail.add(labelArrayList);
		panelDetail.add(userInputArrayList);
		panelDetail.add(buttonArrayList);
		
		return(panelDetail);
	}
	
	public ArrayList<ArrayList<String>> deleteUserStrings () {
		
		panelDetail = new ArrayList<ArrayList<String>>();
		
		colourArrayList.add("boxY");
		colourArrayList.add("Lime");
		colourArrayList.add("Black");
		
		
		titleText.add("Welcome to the Bactch Job Search Page");
		titleText.add("Please select batch job details from the drop down boxes and search for a batch job");

		labelArrayList.add("Staff ID");
		
		userInputArrayList.add("Staff ID");

		buttonArrayList.add("Delete");
		buttonArrayList.add("Clear");
		
		panelDetail.add(colourArrayList);
		panelDetail.add(titleText);
		panelDetail.add(labelArrayList);
		panelDetail.add(userInputArrayList);
		panelDetail.add(buttonArrayList);
		
		return(panelDetail);
	}
	
}
