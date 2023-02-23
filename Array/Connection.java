
import  java.sql.SQLException;
import  java.sql.*;


public class Connect {

    public static Connection Connect1() throws ClassNotFoundException, SQLException {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String conUrl = "jdbc:sqlserver://Aashi\\SQLEXPRESS:1434; databaseName=CDM; Trusted_Connection=True";
        String user= "user1";
        String pass = "admin";
                Connection connection=DriverManager.getConnection(conUrl,user,pass);
	           System.out.println("Connected to SQL SERVER");
                   
    //     1001_anand      Anand@1234 
        if(connection!=null)
        {
            System.out.println("Connect");
        }
        else
        {
            System.out.println("not Connect");
        }
        return connection;
        } 
    

}