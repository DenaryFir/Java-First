package homeTest;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class TabbedPanel {
	
	JPanel tabbedPanel = new JPanel();
	JPanel cannedComments = new JPanel();
	JPanel batchJobSearch = new JPanel();
	JPanel changeUser = new JPanel();
	JPanel changeBatchJob = new JPanel();
	
	ArrayListDetails forGettingPanelNameStrings = new ArrayListDetails();
	ArrayList<String> panelsToGetStringsFor = new ArrayList<String>();

	
	public TabbedPanel () {
		
		panelsToGetStringsFor = forGettingPanelNameStrings.panelNames();
		
		CardLayout tabbedPanelLayout = new CardLayout();
		tabbedPanel.setLayout(tabbedPanelLayout);

		//cannedcomments section
		cannedComments.setBackground(Color.black);
		tabbedPanel.add(cannedComments, "Canned Comments");
		
		//batch job search section
	
		JPanel bjTitlePanel =  tabMaker(panelsToGetStringsFor.get(0));
		JPanel bjInputPanel =  tabMaker(panelsToGetStringsFor.get(1));
		JPanel bjOutputPanel =  tabMaker(panelsToGetStringsFor.get(2));

		batchJobSearch.add(bjTitlePanel);
		batchJobSearch.add(bjInputPanel);
		batchJobSearch.add(bjOutputPanel);
		
		batchJobSearch.setLayout(new BoxLayout(batchJobSearch, BoxLayout.Y_AXIS));

		tabbedPanel.add(batchJobSearch, "Batch Job Search");
		
		//change user section
		
		JPanel addUserPanel =  tabMaker(panelsToGetStringsFor.get(3));
		JPanel deleteUserPanel =  tabMaker(panelsToGetStringsFor.get(4));

		changeUser.add(addUserPanel);
		changeUser.add(deleteUserPanel);
		
		changeUser.setLayout(new BoxLayout(changeUser, BoxLayout.X_AXIS));
		
		tabbedPanel.add( changeUser, "Change User" );
		
		//change batch job section
		changeBatchJob.setBackground(Color.pink);
		tabbedPanel.add( changeBatchJob, "Change Batch Job" );
		
	}
	
	public JPanel returnTabbedPanel () {
		
		CardLayout cardLayout = (CardLayout) tabbedPanel.getLayout();
		cardLayout.show(tabbedPanel, "Canned Comments");
		return(tabbedPanel);
	}
	
	public void showCannedCommentsCard () {
		CardLayout cardLayout = (CardLayout) tabbedPanel.getLayout();
		cardLayout.show(tabbedPanel, "Canned Comments");
		
	}
	
	public void showBatchJobSearchCard () {
		CardLayout cardLayout = (CardLayout) tabbedPanel.getLayout();
		cardLayout.show(tabbedPanel, "Batch Job Search");
		
	}
	
	public void showChangeUserCard () {
		CardLayout cardLayout = (CardLayout) tabbedPanel.getLayout();
		cardLayout.show(tabbedPanel, "Change User");
		
	}
	
	public void showChangeBatchJobCard () {
		CardLayout cardLayout = (CardLayout) tabbedPanel.getLayout();
		cardLayout.show(tabbedPanel, "Change Batch Job");
		
	}
	
	public void lambdaclear() {

//		panelDetail.forEach( (n) -> {n.clear();} );

	}

	public JPanel tabMaker (String panelToMake) {
		
		ArrayList<ArrayList<String>> panelDetail = new ArrayList<ArrayList<String>>();
		
		try {
			ArrayListDetails details = new ArrayListDetails();
			Class getDetails = details.getClass();
			Method getPanelDetail = getDetails.getDeclaredMethod(panelToMake);
			panelDetail = (ArrayList<ArrayList<String>>) getPanelDetail.invoke(details);
		
		}
		catch(Exception e) {
			System.out.println("Bruh...");
		}
		
		System.out.println(panelDetail);
		
		PanelMaker panelMaker = new PanelMaker(panelDetail, this);
		JPanel returnPanelMaker = panelMaker.returnPanel();
		//lambdaclear();
		
		return(returnPanelMaker);
	}
}
