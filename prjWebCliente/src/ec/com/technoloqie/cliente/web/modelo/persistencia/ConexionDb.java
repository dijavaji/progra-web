package ec.com.technoloqie.cliente.web.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDb {
	
	private String driver;
	private String cadenacon;
	
	public ConexionDb(String driver, String cadena){
		this.driver = driver;
		this.cadenacon = cadena;
	}
	
	public Connection getConexion(){
		Connection cn = null;
		try{
			Class.forName(driver).newInstance();
			cn = DriverManager.getConnection(cadenacon, "root", "labcom,2015");
		}catch(Exception e){
			e.printStackTrace();
		}
		return cn;
	}
	
	public void cierraConexion(Connection cn){
		try {
			if(cn!=null && !cn.isClosed()){
				cn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getCadenacon() {
		return cadenacon;
	}
	public void setCadenacon(String cadenacon) {
		this.cadenacon = cadenacon;
	}
	
	

}
