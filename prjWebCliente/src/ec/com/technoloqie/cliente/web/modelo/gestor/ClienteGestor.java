package ec.com.technoloqie.cliente.web.modelo.gestor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import ec.com.technoloqie.cliente.web.controlador.form.RegistroForm;
import ec.com.technoloqie.cliente.web.controlador.form.ValidacionForm;
import ec.com.technoloqie.cliente.web.modelo.persistencia.ConexionDb;

public class ClienteGestor {
	
	private ConexionDb dt;
	
	public ClienteGestor(String driver, String cadenacon){
		dt = new ConexionDb(driver, cadenacon);
	}
	
	public boolean validar(ValidacionForm vf){
		boolean estado = false;
		try {
			Connection cn = dt.getConexion();
			String query = "SELECT NOMBRE, PASS FROM USUARIO ";
			query += "WHERE NOMBRE ='" + vf.getUsuario();
			query += "' AND PASS = '" + vf.getPassword() + "'";
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			estado = rs.next();
			dt.cierraConexion(cn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return estado;
	}

	public void registrar(RegistroForm rf) {
		String query = "INSERT INTO USUARIO(NOMBRE, APELLIDO, PASS, TIPO_USUARIO_ID, E_MAIL)";
		query += "VALUES ('"+ rf.getNombre()+"','"+rf.getApellidos()+"','"+rf.getPassword()+"'"+", 3,'"+rf.getEmail()+"')";
		System.out.print(query);
		try {
			int i;
			Connection cn = dt.getConexion();
			Statement st = cn.createStatement();
			i = st.executeUpdate(query);
			st.close();
			dt.cierraConexion(cn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
