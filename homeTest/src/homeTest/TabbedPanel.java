package homeTest;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

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

		tabbedPanel.setBackground(Color.black);
		
		tabbedPanel.add(cannedComments, "Canned Comments");
		
		
		batchJobSearch.setLayout(new BoxLayout(batchJobSearch, BoxLayout.Y_AXIS));
		
		
		TitlePanel bjSearchTitlePanel = new TitlePanel();
		JPanel bjTitlePanel = bjSearchTitlePanel.returnTitlePanel();
		
		InputPanel bjSearchInputPanel = new InputPanel();
		JPanel bjInputPanel = bjSearchInputPanel.returnInputPanel();
		
		OutputPanel bjSearchTOutputPanel = new OutputPanel(this);
		JPanel bjOutputPanel = bjSearchTOutputPanel.returnOutputPanel();
		
//		VerticalBackPanel vertbackPanel = new VerticalBackPanel();
//		JPanel vBackPanel = vertbackPanel.returnVerticalBackPanel();
		
		batchJobSearch.add(bjTitlePanel);
		batchJobSearch.add(bjInputPanel);
		batchJobSearch.add(bjOutputPanel);
		
//		vBackPanel.setBackground(Color.black);
//
//		batchJobSearch.add(vBackPanel);
		tabbedPanel.add(batchJobSearch, "Batch Job Search");
		
		
		
		TitlePanel changeUserTitlePanel = new TitlePanel();
		JPanel cuTitlePanel = changeUserTitlePanel.returnTitlePanel();
		
		InputPanel changeUserInputPanel = new InputPanel();
		JPanel cuInputPanel = changeUserInputPanel.returnInputPanel();
		
		OutputPanel changeUserOutputPanel = new OutputPanel(this);
		JPanel cuOutputPanel = changeUserOutputPanel.returnOutputPanel();
		
		HorizontalPanel horBackPanel = new HorizontalPanel();
		JPanel hBackPanel = horBackPanel.returnHorizontalBackPanel();
		
		hBackPanel.add(cuTitlePanel);
		hBackPanel.add(cuInputPanel);
		hBackPanel.add(cuOutputPanel);
		
		changeUser.add(hBackPanel);
		tabbedPanel.add( changeUser, "Change User" );
		
		
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
