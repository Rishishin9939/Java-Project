package Frame2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBuild {
    Connection conn;
    ConnectionBuild(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/connecttoframe", "root","Rishi1387009");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
