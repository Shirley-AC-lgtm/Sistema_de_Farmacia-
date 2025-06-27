package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
 Connection conexion = null;

    String nombreDb = "sgSistemafarmacia";
    String url = "jdbc:mysql://localhost:3306/" + nombreDb;
    String usuario = "root";
    String clave = "Shirley1017.";
    
    public Connection obtenerConexion(){
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection(url, usuario, clave);
    } catch (SQLException e) {
        System.out.println("Error al conectar Base de Datos: ");
        System.err.println(e);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
    }
        

    return conexion;
    
    }
}