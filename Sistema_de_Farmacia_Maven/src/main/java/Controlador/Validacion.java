package Controlador;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validacion {

    public boolean validarLogin(String correo, String contrasena, String rol) {
        boolean acceso = false;
        try {
            
            String query = "SELECT * FROM Usuario WHERE correo = ? AND contrasena = ? AND rol = ?";
            Conexion con = new Conexion();
            Connection conexion = con.obtenerConexion();
            PreparedStatement ps = null;

            ps.setString(1, correo);
            ps.setString(2, contrasena);
            ps.setString(3, rol);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                acceso = true;
            }

            ps.close(); 
            conexion.close();
            
        } catch (Exception e) {
            System.out.println("Error en validación: " + e);
        }
        return acceso;
    }
}

