package homeTest;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class TabbedPanel {
	
	JPanel tabbedPanel = new JPanel();
	JPanel cannedComments = new JPanel();
	JPanel batchJobSearch = new JPanel();
	JPanel changeUser = new JPanel();
	JPanel changeBatchJob = new JPanel();
	
	
	public TabbedPanel () {
		
		CardLayout tabbedPanelLayout = new CardLayout();
		tabbedPanel.setLayout(tabbedPanelLayout);

		cannedComments.setBackground(Color.black);
		
		tabbedPanel.add(cannedComments, "Canned Comments");
		
		
		batchJobSearch.setLayout(new BoxLayout(batchJobSearch, BoxLayout.Y_AXIS));
		
		
		TitlePanel bjSearchTitlePanel = new TitlePanel();
		JPanel bjTitlePanel = bjSearchTitlePanel.returnTitlePanel();
		
		InputPanel bjSearchInputPanel = new InputPanel();
		JPanel bjInputPanel = bjSearchInputPanel.returnInputPanel();
		
		OutputPanel bjSearchTOutputPanel = new OutputPanel(this);
		JPanel bjOutputPanel = bjSearchTOutputPanel.returnOutputPanel();

		batchJobSearch.add(bjTitlePanel);
		batchJobSearch.add(bjInputPanel);
		batchJobSearch.add(bjOutputPanel);

		tabbedPanel.add(batchJobSearch, "Batch Job Search");
		
		changeUser.setLayout(new BoxLayout(changeUser, BoxLayout.X_AXIS));
		
		AddUser addUser = new AddUser();		
		JPanel appAddUser = addUser.returnAddUserPanel();
		
		DeleteUser deleteUser = new DeleteUser();		
		JPanel appDeleteUser = deleteUser.returnDeleteUserPanel();
		
		changeUser.add(appAddUser);
		changeUser.add(appDeleteUser);
		
		tabbedPanel.add( changeUser, "Change User" );
		
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

}
