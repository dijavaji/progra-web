package ec.com.technoloqie.productoWeb.controlador.form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class CategoriaForm extends ActionForm{
    
    private String bandera;
    private ArrayList<String> codigoCategoria;

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public void setCodigoCategoria(ArrayList<String> codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getBandera() {
        return bandera;
    }

    public ArrayList<String> getCodigoCategoria() {
        return codigoCategoria;
    }
    
}
