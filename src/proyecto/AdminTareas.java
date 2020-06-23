package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminTareas {
    private ArrayList<Tarea> listaTareas = new ArrayList();
    private File archivo = null;

    public AdminTareas(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    @Override
    public String toString() {
        return "listaTareas=" + listaTareas;
    }

    //extra mutador
    public void setTarea(Tarea r) {
        this.listaTareas.add(r);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Tarea t : listaTareas) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getNamep()+ ";");
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
        listaTareas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaTareas.add(new Tarea(sc.next(), sc.next(), sc.next(), s.parse(sc.next()), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
