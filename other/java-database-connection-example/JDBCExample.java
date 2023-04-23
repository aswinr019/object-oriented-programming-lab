/*
 Connecting to mysql database using JDBC. 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class JDBCExample {

  public static void main(String args[]) throws SQLException {

    String url = "jdbc:mysql://localhost:PORT/db";
    String username = "";
    String password = "";
    String query = "";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    }
    catch (ClassNotFoundException e){
      e.printStackTrace();
    }
    

    try {

      Connection connection = DriverManager.getConnection(url,uname,password);
      Statement statement = connection.createStatement();
      ResultSet result = statement.executeQuery(query);

      while(result.next()) {
        
      }
    }
    catch(SQLException e) {
      e.printStackTrace();
    }
  }
}
