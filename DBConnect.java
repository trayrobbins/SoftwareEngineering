/*
 * Checks connection to database, also downloads appropriate files to get sqlite running 
 */
package hms;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnect {
    
    public static void Connection() throws IOException{
        //check if sqlite directory exists create directory if false
        
        File sqliteDir = new File("C:\\sqlite");
        
        
        if((sqliteDir.exists()&&sqliteDir.isDirectory())==false){
            new File("C:\\sqlite").mkdir();
        }
        
        
        //Check is sqlite3 exists download file if false
        
        File sqlite3 = new File("C:\\sqlite\\sqlite-shell-win32-x86-3080700.zip\\sqlite3.zip");
        
        if(sqlite3.exists()==false){
            
            String fileName = "C:\\sqlite\\sqlite-shell-win32-x86-3080700.zip"; 
            URL link = new URL("http://www.sqlite.org/2014/sqlite-shell-win32-x86-3080700.zip");  
            
            //Code to download
            InputStream in = new BufferedInputStream(link.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1!=(n=in.read(buf)))
            {
                out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();
            
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(response);
            fos.close();
            //End download code
            
        }

        
        //check if .jar files exists, download if doesnt
        File sqliteJar = new File("C:\\sqlite\\sqlite-jdbc-3.8.7.jar");
        
        if(sqliteJar.exists()==false){
            
            String fileName = "C:\\sqlite\\sqlite-jdbc-3.8.7.jar"; 
            URL link = new URL("https://bitbucket.org/xerial/sqlite-jdbc/downloads/sqlite-jdbc-3.8.7.jar");  
            
            //Code to download
            InputStream in = new BufferedInputStream(link.openStream());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n = 0;
            while (-1!=(n=in.read(buf)))
            {
                out.write(buf, 0, n);
            }
            out.close();
            in.close();
            byte[] response = out.toByteArray();
            
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(response);
            fos.close();
            //End download code
            
        }
        
        //connect to database, if database does not exists it creates file automatically
        
        boolean test = true; 
        while(test == true) {
            
            
            Connection c = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\EmployeeLogin.db");
            } catch ( Exception e ) {

                JOptionPane.showMessageDialog(null, "Thank you for using the Hotel Management System, because it is your first time using the system, we needed to "
                        + "add some files. Please restart the program to continue.", "First Run Installation", JOptionPane.ERROR_MESSAGE);

                System.exit(0);
            }
            test = false;
        }
    }
    
}
