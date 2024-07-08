/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;

/**
 *
 * @author thaitv
 */
public class DBContext {

    private static final String DB_SERVER = "localhost";
    private static final String DB_HOST = "1433";
    private static final String DB_NAME = "SOF203";
    private static final String DB_USERNAME = "sa";
    private static final String DB_PASSWORD = "12345678";

    private static Connection conn;

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String strConn = String.format("jdbc:sqlserver://%s:%s;DatabaseName=%s;encrypt=true;"
                    + "trustServerCertificate=true;", DB_SERVER, DB_HOST, DB_NAME);
            conn = DriverManager.getConnection(strConn,DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
