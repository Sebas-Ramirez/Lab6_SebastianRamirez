package lab.pkg6_sebastianramirez;

import java.util.Date;

public class usuario {
    String nombre,usuario,contraseña;
    Date fecha;

    public usuario(String nombre, String usuario, String contraseña, Date fecha) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return nombre;
    }
           
}
