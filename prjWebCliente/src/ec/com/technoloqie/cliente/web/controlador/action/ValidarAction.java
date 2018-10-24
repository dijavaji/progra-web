package ec.com.technoloqie.cliente.web.controlador.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ec.com.technoloqie.cliente.web.controlador.form.ValidacionForm;
import ec.com.technoloqie.cliente.web.modelo.gestor.ClienteGestor;

public class ValidarAction extends Action{
	 public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception {
		 
		 String driver = this.getServlet().getServletContext().getInitParameter("driver");
		 String cadenacon = this.getServlet().getServletContext().getInitParameter("cadenacon");
		 ClienteGestor clienteGestor = new ClienteGestor(driver,cadenacon);
		 
		 ValidacionForm vf = (ValidacionForm) form;
		 
		 if(clienteGestor.validar(vf)){
			 return mapping.findForward("bienvenida");
		 }else{
			 return mapping.findForward("error");
		 }
	 }
}
