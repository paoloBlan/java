package com.conexion.Gestor;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   private String url = "";
   private String user = "";
   private String pass = "";
   private Connection conexion = null;
   
   public void conectar(){
        try {
             conexion = DriverManager.getConnection(url, user, pass);
             if(conexion!=null){
                System.out.println("Conexion okay");
             }
        } catch (Exception e) {
            System.out.println("error al conectar: "+e.getMessage());
        }
    
   }

   public void desconectar(){
        try {
            conexion.close();
            System.out.println("conexion cerrada");
        } catch (Exception e) {
           System.out.println("Error al cerrar la conexion: "+e.getMessage());
        }
   }
   
   public Connection getConexion(){
        return this.conexion;
   }
}
