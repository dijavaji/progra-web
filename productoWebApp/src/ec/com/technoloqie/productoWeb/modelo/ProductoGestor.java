package ec.com.technoloqie.productoWeb.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import ec.com.technoloqie.productoWeb.controlador.beans.ProductoBean;
import ec.com.technoloqie.productoWeb.persistencia.ConexionDB;

/**
 * 
 * @author thc
 *
 */
public class ProductoGestor {
	
	 private ConexionDB con;
	    
	    public ProductoGestor(String driver, String cadenaConexion){
	        con = new ConexionDB(driver, cadenaConexion);
	    }
	    
	    
	    public ArrayList<ProductoBean> consultaProducto(String categoriaCod){
	    	ArrayList<ProductoBean>	conjuntoProducto = new ArrayList<ProductoBean>();
	    	try{
	    		Connection cn = con.getConexion();
	    		Statement st = cn.createStatement();
	    		String cadenaSql = "SELECT * FROM PRODUCTO WHERE CATEGORIA_ID =" + categoriaCod;
	    		ResultSet rs = st.executeQuery(cadenaSql);
	    		while (rs.next()){
	    			ProductoBean prod = new ProductoBean();
	    			prod.setIdCategoria(rs.getString("CATEGORIA_ID"));
	    			prod.setIdProducto(rs.getString("PRODUCTO_ID"));
	    			prod.setNombreProducto(rs.getString("NOMBRE"));
	    			prod.setPrecioProducto(rs.getInt("PRECIO"));
	    			prod.setStockProducto(rs.getInt("STOCK"));
	    			conjuntoProducto.add(prod);
	    		}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    	return conjuntoProducto;
	    }

}
