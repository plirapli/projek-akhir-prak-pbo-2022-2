/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Muhammad Rafli
 */
public class Connector {

    static Connection con;
    static String dbName = "yulje_medical_centre";
    static String dbUser = "root";
    static String dbPasswd = "";

    public static Connection getConnection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName(dbName);
            data.setUser(dbUser);
            data.setPassword(dbPasswd);

            try {
                con = data.getConnection();
                System.out.println("Connected");
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return con;
    }
}
