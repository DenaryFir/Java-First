package homeTest;

import java.awt.Color;
import java.util.HashMap;

public class Format {
	
	HashMap<String, Color> formatColours = new HashMap<String, Color>();
	
	public HashMap<String, Color> returnFormatColours () {
		
		formatColours.put("Navy", new Color (32,42,68) );
		formatColours.put("Orange", new Color (255, 153, 0) );
		formatColours.put("Lime", new Color (255, 255, 158) );
		formatColours.put("White", new Color (255, 255, 255) );
		formatColours.put("Red", new Color (255, 0, 0) );
		
		return(formatColours);
	}

}
