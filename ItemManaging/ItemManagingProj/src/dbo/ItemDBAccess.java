/*
 * ItemDBAccess: Class for accessing DemoPRJ database
 */
package dbo;

/**
 *
 * @author thopn
 */
public class ItemDBAccess extends DBAccess{
    final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final String url = "jdbc:sqlserver://localhost:1433;"+
                       "databasename=DemoPRJ; user=sa; password=123456";
    
    public ItemDBAccess(){
        super();
        super.connectDB(driver, url);
    }
}
