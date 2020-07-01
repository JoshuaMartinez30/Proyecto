package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AdminProyectos {

    private ArrayList<Proyecto> ListaProyectos = new ArrayList();
    private File archivo = null;

    public AdminProyectos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Proyecto> getListaProyectos() {
        return ListaProyectos;
    }

    public void setListaProyectos(ArrayList<Proyecto> ListaProyectos) {
        this.ListaProyectos = ListaProyectos;
    }

    @Override
    public String toString() {
        return "listaProyectos=" + ListaProyectos;
    }

    //extra mutador
    public void setProyectos(Proyecto p) {
        this.ListaProyectos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Proyecto t : ListaProyectos) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getComentario() + ";");
                bw.flush();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ListaProyectos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ListaProyectos.add(new Proyecto(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }//FIN IF
    }
}
