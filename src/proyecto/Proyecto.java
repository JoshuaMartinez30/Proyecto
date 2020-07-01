package proyecto;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
   private String usuario;
   private String nombre;
   private String Fecha;
   private String comentario;
   private ArrayList<Tarea> tarea = new ArrayList(); 

    public Proyecto() {
    }

    public Proyecto(String usuario, String nombre, String Fecha, String comentario) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.Fecha = Fecha;
        this.comentario = comentario;
    }
    
    public Proyecto(ArrayList tarea){
        setTarea(tarea);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public ArrayList getTarea() {
        return tarea;
    }

    public void setTarea(ArrayList tarea) {
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
