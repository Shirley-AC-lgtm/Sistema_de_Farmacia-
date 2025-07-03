package Modelo;
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String contrasena;
    private String rol;
    private int idRol;
    private int sucursalAsignada;

    public Usuario() {
    }
    
    public Usuario(int idUsuario, String nombre, String correo, String contrasena, String rol, int idRol, int sucursalAsignada) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.idRol = idRol;
        this.sucursalAsignada = sucursalAsignada;
    }

    public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getCorreo() {
    return correo;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

public String getContrasena() {
    return contrasena;
}

public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
}

public String getRol() {
    return rol;
}

public void setRol(String rol) {
    this.rol = rol;
}

public int getIdRol() {
    return idRol;
}

public void setIdRol(int idRol) {
    this.idRol = idRol;
}

public int getSucursalAsignada() {
    return sucursalAsignada;
}

public void setSucursalAsignada(int sucursalAsignada) {
    this.sucursalAsignada = sucursalAsignada;
}

public int getIdUsuario() {
    return idUsuario;
}

public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
}

}
