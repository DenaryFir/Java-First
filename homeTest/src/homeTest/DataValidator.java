package homeTest;

public class DataValidator {
	
	public Boolean isNullChecker(String stringToCheck) {
		
		if(stringToCheck.isEmpty()) {
			return(true);
		}
		
		return(false);
	}
	
	
	public Boolean staffIDChecker(String staffID) {
		//needs to be 8 characters long and all numbers
		if( staffID.length() != 8 ) {
			return(false);
		}
		
		try {
			int staffIDInteger = Integer.parseInt(staffID);
		}
		catch (NumberFormatException e) {
			return(false);
		}
		
		return(true);
	}

}
