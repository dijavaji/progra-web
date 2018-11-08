package ec.com.technoloqie.productoWeb.controlador.action; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ec.com.technoloqie.productoWeb.controlador.form.CategoriaForm;
import ec.com.technoloqie.productoWeb.controlador.form.CategoriaProductoForm;
import ec.com.technoloqie.productoWeb.modelo.CategoriaGestor;
import ec.com.technoloqie.productoWeb.modelo.ProductoGestor;

public class CategoriaAction extends Action{
	
//	@Override
//	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws  Exception{
//	    String driver = this.getServlet().getServletContext().getInitParameter("driver");
//	    String cadenaConexion = this.getServlet().getServletContext().getInitParameter("cadenaConexion");
//	    
//	    CategoriaForm cb = (CategoriaForm) form;
//	    CategoriaGestor catGestor = new CategoriaGestor(driver, cadenaConexion);
//	    cb.setCodigoCategoria(catGestor.consultaCategoria());
//	    return mapping.findForward("categoriajsp");
//	}
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws  Exception{
	    String driver = this.getServlet().getServletContext().getInitParameter("driver");
	    String cadenaConexion = this.getServlet().getServletContext().getInitParameter("cadenaConexion");
	    
	    CategoriaProductoForm cb = (CategoriaProductoForm) form;
	    CategoriaGestor catGestor = new CategoriaGestor(driver, cadenaConexion);
	    cb.setCategoriaProducto(catGestor.consultaCategoriaProducto());
	    return mapping.findForward("categoriaProductojsp");
	}

}
