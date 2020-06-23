package proyecto;

import java.util.Date;

public class Tarea {
    private String usuario;
    private String namep;
    private String nombre;
    private Date Fecha;
    private String comentario;
    public Tarea() {
    }


    public Tarea(String usuario, String namep, String nombre, Date Fecha, String comentario) {
        this.usuario = usuario;
        this.namep = namep;
        this.nombre = nombre;
        this.Fecha = Fecha;
        this.comentario = comentario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }

    
    
    @Override
    public String toString() {
        return "Tareas{" + "nombre=" + nombre + ", Fecha=" + Fecha + ", comentario=" + comentario + '}';
    }
}
