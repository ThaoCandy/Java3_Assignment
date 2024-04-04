/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

/**
 *
 * @author user
 */
public class Connect {

    private final String user = "sa";
    private final String pass = "12345678";
    private final String host = "ThaoToshiba\\THUHAOSQL";
    private final String database = "BookDBI";
    private final int port = 1433;

    public Connection conn;

    public Connect() {
        ketNoiDB();
    }

    private boolean ketNoiDB() {
        try {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser(user);
            ds.setPassword(pass);
            ds.setServerName(host);
            ds.setDatabaseName(database);
            ds.setPortNumber(port);

            conn = ds.getConnection();
            System.out.println("Kết nối thành công: ");
            System.out.println(conn.getCatalog());
            return true;
        } catch (Exception e) {
            System.out.println("Kết nối thất bại: ");
            e.printStackTrace(System.out);
            return false;
        }
    }

//    public static void main(String[] args) {
//        new Connect();
//    }
    
}
