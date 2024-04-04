/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.util;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class JdbcUtil {

    private final String host = "ThaoToshiba\\THUHAOSQL";
    private final String username = "sa";
    private final String password = "12345678";
    private final String database = "su22b2_sof203";
    private final int port = 1433;

    protected Connection conn;

    private boolean connectSQL() {
        try {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser(username);
            ds.setServerName(host);
            ds.setPassword(password);
            ds.setDatabaseName(database);
            ds.setPortNumber(port);

            conn = ds.getConnection();

            return true;
        } catch (SQLServerException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
    }

    public JdbcUtil() {
        if (connectSQL()) {
            System.out.println("Kết nối thành công: ");
            try {
                System.out.println(conn.getCatalog());
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        } else {
            System.out.println("Lỗi kết nối");
        }
    }

}
