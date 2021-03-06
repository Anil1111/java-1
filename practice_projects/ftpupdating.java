//example code 

import org.apache.commons.net.ftp.FTPClient;
import java.io.IOException;
 
public class FtpConnection {
	
    public static void main(String[] args) {
    	
  FTPClient client = new FTPClient();
 
  try {

client.connect("sftp.pjwstk.edu.pl");
 
// Try to login and return the respective boolean value
boolean login = client.login("s19363", "69qBBZThToAw4mzUTh7L");
 
// If login is true notify user

if (login) {

    System.out.println("Connection established...");
 
    // Try to logout and return the respective boolean value
    boolean logout = client.logout();

    // If logout is true notify user
    if (logout) {

  System.out.println("Connection close...");

    }
//  Notify user for failure  
} else {
    System.out.println("Connection fail...");
}
 
  } catch (IOException e) {

e.printStackTrace();

  } finally {

try {
	// close connection

    client.disconnect();

} catch (IOException e) {

    e.printStackTrace();

}

  }
    }
}