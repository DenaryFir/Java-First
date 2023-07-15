package homeTest;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class VerticalBackPanel {
	
	JPanel verticalBackPanel = new JPanel();
	
	public VerticalBackPanel () {
		
		verticalBackPanel.setLayout(new BoxLayout(verticalBackPanel, BoxLayout.Y_AXIS));
		
	}
	
	public JPanel returnVerticalBackPanel () {
		return(verticalBackPanel);
	}

}
