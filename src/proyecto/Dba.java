package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dba {
    private String proyecto;
    private Connection dbcon;
    public Statement query;
    
    public Dba(String proyecto){
        this.proyecto=proyecto;
    }

    public void setBase_datos(String proyecto) {
        this.proyecto = proyecto;
    }        
    
   public void conectar(){
        try {
            String driver = "jdbc:ucanaccess://";
            dbcon = DriverManager.getConnection(driver+proyecto,"","");
            query = dbcon.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
   public void desconectar() {
        try {
            query.close();
            dbcon.close();
        } catch (Exception e) {
        }
    }
   
   public void commit(){
       try{
           dbcon.commit();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
    
    
}

