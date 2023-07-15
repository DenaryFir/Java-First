package homeTest;

import java.awt.FlowLayout;
import javax.swing.JPanel;

public class HorizontalPanel {
	
	JPanel horizontalBackPanel = new JPanel();
	
	public HorizontalPanel () {
		
		horizontalBackPanel.setLayout(new FlowLayout());
		
	}
	
	public JPanel returnHorizontalBackPanel () {
		return(horizontalBackPanel);
	}


}
