package homeTest;

public class SQLConnector {
	
	String rootQuery;
	String tableName;
	
	public String rootSQLQuerySelector (int choice) {
		
		switch (choice) {
			
		//get batch jobs
			case 1:
				rootQuery = "SELECT * FROM " + tableName + " WHERE ";
			break;
		//get userIDs
			case 2:
				rootQuery = "SELECT * FROM userTable";
			break;
		//change batch job
			case 3:
				rootQuery = "UPDATE tableName SET column1 = value1, column2 = value2 WHERE condition";
			break;
		//delete user
			case 4:
				rootQuery = "DELETE * FROM userTable WHERE staffID = ?";
			break;
		//add user
			case 5:
				rootQuery = "INSERT INTO userTable VALUES (?, ?)";
			break;
		
		}
		
		
		
		return(rootQuery);
	}
	
	public String SQLqueries () {

		
		return(rootQuery);
	}

}
