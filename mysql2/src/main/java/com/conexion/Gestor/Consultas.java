package com.conexion.Gestor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consultas extends Conexion {
    private static final String CONSULTA_AGREGAR = "";
    private static final String CONSULTA_EDITAR = "";
    private static final String CONSULTA_ELIMINAR = "";
    private static final String CONSULTA_MOSTRAR = "";
    private static final String CONSULTA_BUSCAR = "";
    private static final String CONSULTA_ELIMINAR_TODO = "";
    private static final String CONSULTA_TOTAL = "";

    private Statement st(){
        Statement st = null;
        try {
            conectar();
            st = getConexion().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        } catch (Exception e) {
            System.out.println("error al procesar consulta st: "+e.getMessage());
        }
        return st;
    }

    public ResultSet rs (String sql){
        ResultSet rs = null;
        try {
            Statement st = new Consultas().st();
            rs = st.executeQuery(sql);
        
        } catch (Exception e) {
            System.out.println("error al mostrar RS: "+e.getMessage());
            rs = null;
        }

        return rs;
    }

    public PreparedStatement pstm(String sql){
        PreparedStatement pstm = null;
        try {
            conectar();
            pstm = getConexion().prepareStatement(sql);

        } catch (Exception e) {
            System.out.println("error al mostrar pstm" +e.getMessage());
        }

        return pstm;
    }
    
}
