import java.sql.*;  
class DataBaseConnection{
	
static Connection con=null;	


 static Connection getConnection(){ 
	  
try{
 
	//Class.forName("com.mysql.jdbc.Driver");
  
  String url = "jdbc:sqlite:C:/Users/dell/members.db";
  con = DriverManager.getConnection(url);
  
  //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_schema","root","");
  System.out.println("DataBase Connected"); 
  return con;
  
  }
  
  catch(Exception e){ 
	  e.printStackTrace();
	  return null; 
	  } 
  }
 

	/*
	 * public static void main(String[] args) { System.out.println("111111");
	 * System.out.println(getConnection());
	 * 
	 * }
	 */
 

}  