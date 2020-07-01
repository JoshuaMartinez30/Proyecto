package proyecto;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.Icon;

public class Registro implements Serializable {

    private String Email, contraseña;
    private Icon fotografia;
    private ArrayList<Proyecto> proyecto = new ArrayList();

    private static final long SerialVersionUID = 777L;

    public Registro() {
    }

    public Registro(String Email, String contraseña, Icon fotografia) {
        this.Email = Email;
        this.contraseña = contraseña;
        this.fotografia = fotografia;
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

    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografia) {
        this.fotografia = fotografia;
    }

    public ArrayList<Proyecto> getProyecto() {
        return proyecto;
    }

    public void setProyecto(ArrayList<Proyecto> proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return Email;
    }

    

}
