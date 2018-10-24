package ec.com.technoloqie.productoWeb.controlador.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ec.com.technoloqie.productoWeb.controlador.form.CategoriaForm;
import ec.com.technoloqie.productoWeb.controlador.form.SeleccionForm;
import ec.com.technoloqie.productoWeb.modelo.ProductoGestor;

public class ProductoAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws  Exception{
	    String driver = this.getServlet().getServletContext().getInitParameter("driver");
	    String cadenaConexion = this.getServlet().getServletContext().getInitParameter("cadenaConexion");
	    
	    SeleccionForm pb = (SeleccionForm)form;
	    ProductoGestor productoGestor = new ProductoGestor(driver, cadenaConexion);
	    
	    request.setAttribute("productos", productoGestor.consultaProducto(pb.getCodigoCategoria()));
	    return mapping.findForward("productojsp");
	}
}
