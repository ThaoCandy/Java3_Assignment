/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.comnectDB;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
/**
 *
 * @author user
 */
public final class Connect {
    private final String user = "sa";
    private final String pass = "12345678";
    private final String host = "ThaoToshiba\\SQLEXPRESS";
    private final String database = "QUANLY_SINHVIEN_JAVA3";
    private final int port = 1433;

    private Connection conn;
   
    public  Connection connectDB(){
        try {
            SQLServerDataSource sd = new SQLServerDataSource();
            sd.setUser(user);
            sd.setPassword(pass);
            sd.setDatabaseName(database);
            sd.setPortNumber(port);
            sd.setServerName(host);
            
            conn = sd.getConnection();
//            System.out.println("Kết nối thành công: " + conn.getCatalog());
            return conn;
        } catch (SQLException e) {
            System.out.println("KẾT NỐI THẤT BẠI");
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
            return null;
        }
    }
    
    public static void main(String[] args) {
        new Connect().connectDB();
    }
//    
}
