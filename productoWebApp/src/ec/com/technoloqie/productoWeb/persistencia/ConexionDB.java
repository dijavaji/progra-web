package ec.com.technoloqie.productoWeb.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author thc
 *
 */
public class ConexionDB {
	
	 	private String driver;
		private String cadenacon;
	 
	    public ConexionDB(String driver, String cadenaConexion){
	       this.driver = driver;
	       this.cadenacon = cadenaConexion;
	    }
	    
	    public Connection getConexion(){
	         Connection cn = null;
	        try{
	            Class.forName(driver).newInstance();
	            cn = DriverManager.getConnection(cadenacon,"desarrollo","desarrollo");
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return cn;
	    }
	    
	    public void cierraConexion(Connection cn){
	        try{
	            if(cn != null && !cn.isClosed()){
	                cn.close();
	            }
	        }catch(SQLException e){
	            e.printStackTrace();
	        }
	    }
	    
	    public String getDriver() {
	        return driver;
	    }

	    public String getCadenacon() {
	        return cadenacon;
	    }
	    
	     public void setDriver(String driver) {
	        this.driver = driver;
	    }

	    public void setCadenacon(String cadenacon) {
	        this.cadenacon = cadenacon;
	    }

}
