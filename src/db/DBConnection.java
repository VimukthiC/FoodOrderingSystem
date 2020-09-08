
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/foodOrder", "root", "ijse");
    }

    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
       return(null==dbConnection)?(dbConnection = new DBConnection()):(dbConnection);
    }    
        
        /*if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }*/

    public Connection getConnection() {return connection;}

}
