package ec.com.technoloqie.productoWeb.controlador.form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class CategoriaProductoForm extends ActionForm{
	
	private String bandera;
    private ArrayList<String> categoriaProducto;
	public String getBandera() {
		return bandera;
	}
	public void setBandera(String bandera) {
		this.bandera = bandera;
	}
	public ArrayList<String> getCategoriaProducto() {
		return categoriaProducto;
	}
	public void setCategoriaProducto(ArrayList<String> categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}
    
}
