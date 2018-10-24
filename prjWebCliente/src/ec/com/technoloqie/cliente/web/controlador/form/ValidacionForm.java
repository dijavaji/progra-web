package ec.com.technoloqie.cliente.web.controlador.form;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class ValidacionForm extends ActionForm{
	
	private String usuario;
	private String password;
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
	
	

}
