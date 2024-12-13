/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juan Condori
 */
public class Conexion {

    public static Connection connection = null;

    public static Connection Conexion() throws Exception {
        if (connection != null) {
            return connection;
        }
        try {
            String Hostname = "crud-hakaton.cvwvcnumwoh6.us-east-1.rds.amazonaws.com";
            String user = "admin";
            String password = "HolamundoCruel1";
            String jdbcURL="jdbc:mysql://" + Hostname + ":3306/CODESOLUTIONS" ;
          
            connection = DriverManager.getConnection(jdbcURL, user, password);
        } catch (SQLException e) {
            System.out.println("Error en la Conexion " + e.getMessage());
        }
        return connection;
    }

    public static void CerrarConexion() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
    
    public static void main(String[] args) throws Exception {
        Conexion();
        if (connection != null) {
            System.out.println("CONEXIÓN CON EXITO");
        } else {
            System.out.println("SIN CONEXIÓN, REVISA...!!!");
        }
    }

}
