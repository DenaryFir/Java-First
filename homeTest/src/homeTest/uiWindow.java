package homeTest;

import javax.swing.JFrame;

public class uiWindow {
	
	private JFrame window;
	
	public uiWindow() {
	
		window  = new JFrame();
		window.setTitle("JFrame title");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(600, 250);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		
	}
	
	public void addDataPanel(uiWindow window) {
		
		uiDataPanel dataPanel = new uiDataPanel();
		
		uiWindow windowTwo = new uiWindow();
		
		windowTwo.add(dataPanel);
		
		
	}
	
}
