/*
* Verifies teh database is operational and has correct tables, not full database only test database
*/
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


/**
 *
 * @author Daniel
 */
public class VerifyDB {
    
    public static void VerifyTables(){
        
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\EmployeeLogin.db");
            
            stmt = c.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS EMPLOYEELOGIN " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " USERNAME       TEXT    NOT NULL, " +
                    " PASSWORD       TEXT    NOT NULL) ";
            
            stmt.executeUpdate(sql);
            
            sql = "INSERT OR IGNORE INTO EMPLOYEELOGIN (ID,USERNAME, PASSWORD) " +
                    "VALUES (1, 'admin', 'password');";

            stmt.executeUpdate(sql);
            
//            ResultSet rs = stmt.executeQuery( "SELECT * FROM EMPLOYEELOGIN;" );
//            while ( rs.next() ) {
//                int id = rs.getInt("id");
//                String  userName = rs.getString("USERNAME");
//                String  passWord = rs.getString("PASSWORD");
//                System.out.println( "ID = " + id );
//                System.out.println( "USERNAME = " + userName );
//                System.out.println( "PASSWORD = " + passWord );
//            }
//            rs.close();
            stmt.close();
            c.close();
            
            
            
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        
        
        
        
    }
    
    
    
    
}
