package proyecto;
import java.util.ArrayList;
public class Registro {
    private String Email, contraseña;
    private ArrayList<Proyecto> proyecto = new ArrayList();

    public Registro() {
    }

    public Registro(String Email, String contraseña) {
        this.Email = Email;
        this.contraseña = contraseña;
    }
    
    public Registro(ArrayList proyecto){
    setProyecto(proyecto);
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Proyecto> getProyecto() {
        return proyecto;
    }

    public void setProyecto(ArrayList<Proyecto> proyecto) {
        this.proyecto = proyecto;
    }
    
    public void setProyecto(Proyecto p) {
        this.proyecto.add(p);
    }
        
    @Override
    public String toString() {
        return Email;
    }
    
    
}
