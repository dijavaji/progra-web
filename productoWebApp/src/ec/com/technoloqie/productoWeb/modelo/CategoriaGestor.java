package ec.com.technoloqie.productoWeb.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ec.com.technoloqie.productoWeb.persistencia.ConexionDB;

public class CategoriaGestor {
	
	private ConexionDB con;
    
    public CategoriaGestor(String driver, String cadenaConexion){
        con = new ConexionDB(driver, cadenaConexion);
    }
    
	public ArrayList<String> consultaCategoria(){
        ArrayList <String> conjuntoCategoria = new ArrayList<String>();
        try {
            Connection cn = con.getConexion();
            Statement st = cn.createStatement();
            String cadenaSql = "SELECT CATEGORIA_ID FROM CATEGORIA";
            ResultSet rs = st.executeQuery(cadenaSql);
            
            while (rs.next()){
                conjuntoCategoria.add(rs.getString("CATEGORIA_ID"));
            }
            
        } catch (Exception e) {
           e.printStackTrace();
        }
        return conjuntoCategoria;
    }

	public ConexionDB getCon() {
		return con;
	}

	public void setCon(ConexionDB con) {
		this.con = con;
	}

}
