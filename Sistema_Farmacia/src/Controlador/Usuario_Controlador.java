package Controlador;

import Modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo.Usuario;

public class Usuario_Controlador {

    public void registrarUsuario(Usuario u) {
        try {
            Conexion con = new Conexion();
            Connection conexion = con.obtenerConexion();
            String query = "INSERT INTO Usuario (nombre, correo, contrasena, rol, iD_Rol, sucursal_Asignada) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = null;
            

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getCorreo());
            ps.setString(3, u.getContrasena());
            ps.setString(4, u.getRol());
            ps.setInt(5, u.getIdRol());
            ps.setInt(6, u.getSucursalAsignada());

            ps.executeUpdate();
            ps.close(); 
            conexion.close();

            System.out.println("Usuario registrado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al registrar usuario: " + e);
        }
    }
}

