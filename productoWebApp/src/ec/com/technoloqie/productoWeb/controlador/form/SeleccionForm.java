package ec.com.technoloqie.productoWeb.controlador.form;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class SeleccionForm extends ActionForm{
	
	private String codigoCategoria;

	public String getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(String codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}
	
}
