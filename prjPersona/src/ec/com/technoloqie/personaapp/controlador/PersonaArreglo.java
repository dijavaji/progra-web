package ec.com.technoloqie.personaapp.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class PersonaArreglo {
	
	private String[] arreglo;
	private Connection conexion;
	private Statement stmt;

	public void setArreglo(String [] nuevoArreglo){
		this.arreglo = new String[nuevoArreglo.length];
		System.arraycopy(nuevoArreglo, 0, arreglo, 0, nuevoArreglo.length);
	}
	
	public void procedimientoConexion(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.100:3306/db_prueba","usrprueba","usrprueba");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void procedimientoIngreso(){
		try {
			stmt = (Statement) conexion.createStatement();
			String query = "INSERT INTO PERSONA (CEDULA, NOMBRE, APELLIDO, SEXO) "
					+ "VALUES ('"+this.arreglo[0]+"', '"+this.arreglo[1]+"', '"+this.arreglo[2]+"', '"+this.arreglo[3]+"');";
			stmt.executeUpdate(query);
			stmt.close();
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
