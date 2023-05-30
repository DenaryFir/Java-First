package homeTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

// add data to action log

public class testsqlcon {
	
	public void sqlCon(int sqlRequestCoice, ArrayList<String> userInputDetail) {
		
		 String host = "j";	 
		 
		 try {
		     Connection SQLConnectionUrl = DriverManager.getConnection(host);
		     
		     System.out.println("Connection Established");
	
		     //insert switch case to choose method
		     switch (sqlRequestCoice) {
			     case 1:
			    	 logWriter(SQLConnectionUrl, userInputDetail);
		     break;
			     case 2:
			    	 logReader(SQLConnectionUrl, userInputDetail);
		     break;
			     case 3:
			    	 deleter(SQLConnectionUrl, userInputDetail);
		     break;
			     default:
			    	 System.out.print("You've forgotten to chose your action");
			    	 System.exit(0);
			    	 
	     }
	     
	     	SQLConnectionUrl.close();
	     	
	     	System.out.println("All done, sunshine");
	     
	     }
	     catch(SQLException e) {
	    	 e.printStackTrace();
	     }
	     
	}
	
	private void logWriter(Connection SQLConnectionUrl, ArrayList<String> userInputDetail) {
	
		 try {
			     PreparedStatement insertValues = SQLConnectionUrl.prepareStatement("INSERT INTO ActionLog (UserOne, Action, Stage, TodayDateTime) values (?,?,? ,GETDATE())");
			     
			     	insertValues.setString(1, userInputDetail.get(0));
			     	insertValues.setString(2, userInputDetail.get(1));
			     	insertValues.setString(3, userInputDetail.get(2));
			     	
			     	insertValues.executeUpdate();
     	
		 	}
	    catch(SQLException e) {
	   	 e.printStackTrace();
	    }
	     
	}
	
	private void logReader(Connection SQLConnectionUrl, ArrayList<String> userInputDetail) {
	
		 try {	     
			 	PreparedStatement insertValues = SQLConnectionUrl.prepareStatement("SELECT * FROM ActionLog where TodayDateTime >= ?");
			 	
			 	insertValues.setString(1, userInputDetail.get(0));
	     
			 	ResultSet rs = insertValues.executeQuery();
			 	
			 	ArrayList<String> results = new ArrayList<String>();
			 	
			 	ResultSetMetaData metadata = rs.getMetaData();
			 	
			 	int columnVol = metadata.getColumnCount();
			 				 	
			 	while(rs.next()) {
			 		for (int i =1; i<= columnVol; i++) {
			 		results.add(rs.getString(i));
			 		}
			 	}
	     	
			 	System.out.println(results);
			 	
	     }
	     catch(SQLException e) {
	    	 e.printStackTrace();
	     }
	     
	}

	private void deleter(Connection SQLConnectionUrl, ArrayList<String> userInputDetail) {
		
		try {
			PreparedStatement removeValues = SQLConnectionUrl.prepareStatement("DELETE FROM ActionLog where UserOne=?");
			
			removeValues.setString(1, userInputDetail.get(0));
			
			removeValues.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
