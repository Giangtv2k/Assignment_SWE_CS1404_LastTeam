package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    // Khai bao cac thong so cho ket noi CSDL
    private final String serverName = "127.0.0.1\\localhost";
    private final String dbName = "ProductDB";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "123456";
    
    public Connection getConnection() throws Exception{
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber +
                ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
}