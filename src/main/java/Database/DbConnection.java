package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static String url = "jdbc:postgresql://localhost:5432/gestion";
    private static String userName="postgres";
    private static String password="admin";
    private static Connection conn=null;

    public static Connection connect(){

        try{
            conn= DriverManager.getConnection(url,userName,password);
            System.out.println("connection has been established");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void closeConnection() throws SQLException {
        conn.close();
    }
}
