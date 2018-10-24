package ec.com.technoloqie.cliente.web.controlador.form;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class RegistroForm extends ActionForm{
	
	private String nombre;
	private String apellidos;
	private String usuario;
	private String password;
	private String email;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
