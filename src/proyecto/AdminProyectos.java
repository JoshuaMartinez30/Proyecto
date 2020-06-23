package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminProyectos {

    private ArrayList<Proyecto> listaProyectos = new ArrayList();
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
        return listaProyectos;
    }

    public void setListaProyectos(ArrayList<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    @Override
    public String toString() {
        return "listaProyectos=" + listaProyectos;
    }

    //extra mutador
    public void setProyecto(Proyecto r) {
        this.listaProyectos.add(r);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Proyecto t : listaProyectos) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getComentario() + "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        Scanner sc = null;
        listaProyectos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaProyectos.add(new Proyecto(sc.next(), sc.next(), s.parse(sc.next()), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
