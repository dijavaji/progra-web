package ec.com.technoloqie.personaapp.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Persona implements HttpSessionBindingListener{
	
	private String numCedula;
	private Connection conexion = null;
	private Statement stmt = null;
	private ResultSet rset = null;
	private StringBuffer tablaResultado;
	
	public Persona(){
		
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		try {
			if(conexion != null)
				conexion = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	public void procedimientoConsultar(){
		try {
			stmt = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM PERSONA WHERE CEDULA LIKE '"+ numCedula + "%'";
			rset = stmt.executeQuery(query);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public String procedimientoMostrarConsulta(){
		StringBuffer tablaResultados = new StringBuffer();
		try {
			tablaResultados.append("<table border=1 cellPadding=1 cellPadding=1");
			tablaResultados.append("<tr> <td> cedula </td>");
			tablaResultados.append("     <td> nombre </td>");
			tablaResultados.append("     <td> apellido </td>");
			tablaResultados.append("     <td> sexo </td>");
			tablaResultados.append(" </tr>");
			while(rset.next()){
				tablaResultados.append("<tr>");
				tablaResultados.append("<td>" + rset.getString(1) + "</td>");
				tablaResultados.append("<td>" + rset.getString(2) + "</td>");
				tablaResultados.append("<td>" + rset.getString(3) + "</td>");
				tablaResultados.append("<td>" + rset.getString(4) + "</td>");
				tablaResultados.append(" </tr>");
			}
			tablaResultados.append("</table>");
		} catch (Exception e) {
			System.out.println(e);
		}
		return tablaResultados.toString();
	}

	public String getNumCedula() {
		return numCedula;
	}

	public void setNumCedula(String numCedula) {
		this.numCedula = numCedula;
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getRset() {
		return rset;
	}

	public void setRset(ResultSet rset) {
		this.rset = rset;
	}

	public StringBuffer getTablaResultado() {
		return tablaResultado;
	}

	public void setTablaResultado(StringBuffer tablaResultado) {
		this.tablaResultado = tablaResultado;
	}

}
