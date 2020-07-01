package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Bitacora extends Thread {

    private String nameU, namep;
    private Date fecha = new Date();
    private int num, num2;

    public Bitacora(String nameU, String namep, int num) {
        this.nameU = nameU;
        this.namep = namep;
        this.num = num;
    }

    public Bitacora(String nameU, int num, int num2) {
        this.nameU = nameU;
        this.num = num;
        this.num2 = num2;
    }

    public Bitacora(String nameU, int num) {
        this.nameU = nameU;
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getNameU() {
        return nameU;
    }

    public void setNameU(String nameU) {
        this.nameU = nameU;
    }

    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        boolean v = true;
        while (v) {
            try {
                File f = new File("./Bitacora.txt");
                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                if (getNum() == 0) {
                    bw.write("Dia: " + getFecha() + "\n Se Registro: " + getNameU() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum() == 1) {
                    bw.write("----------------------------------\n");
                    bw.write("Dia: " + getFecha() + "\nInicio Sesion: " + getNameU() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum() == 2) {
                    bw.write("Dia: " + getFecha() + "\nCreo Nuevo Proyecto:" + getNamep() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum() == 3) {
                    bw.write("Dia: " + getFecha() + "\nCreo Nueva Tarea:" + getNamep() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum() == 4) {
                    bw.write("Dia: " + getFecha() + "\nSe Modifico usuario:" + getNameU() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum() == 5) {
                    bw.write("Dia: " + getFecha() + "\nSe elimino usuario: " + getNameU() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum()==6) {
                    bw.write("Dia: " + getFecha() + "\nSe Modifico Tarea: " + getNamep() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum()==7) {
                    bw.write("Dia: " + getFecha() + "\nSe elimino Tarea: " + getNamep() + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum()==8) {
                    bw.write("Dia: " + getFecha() + "\nSe Modifico Proyecto" + "\n");
                    bw.newLine();
                    v = false;
                }
                if (getNum()==9) {
                    bw.write("Dia: " + getFecha() + "\nSe elimino Proyecto"+"\n");
                    bw.newLine();
                    v = false;
                }
                bw.flush();
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
            }
        }
    }
}
