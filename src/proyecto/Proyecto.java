package proyecto;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
   private String nombre;
   private Date Fecha;
   private String comentario;
   private ArrayList<Tarea> tarea = new ArrayList(); 

    public Proyecto() {
    }

    public Proyecto(ArrayList tarea){
        setTarea(tarea);
    }
    
    public Proyecto(String nombre, Date Fecha, String comentario) {
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
