package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminUsuarios {

    private ArrayList<Registro> listaPersonas = new ArrayList();
    private File archivo = null;


    public AdminUsuarios(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Registro> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Registro> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra mutador
    public void setRegistro(Registro r) {
        this.listaPersonas.add(r);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Registro t : listaPersonas) {
                bw.write(t.getEmail()+";");
                bw.write(t.getContraseña()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new Registro(sc.next(), sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
        
    }
}
