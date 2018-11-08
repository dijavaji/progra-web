package ec.com.technoloqie.prjoperacion.controlador.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ec.com.technoloqie.prjoperacion.controlador.form.ValidacionForm;
import ec.com.technoloqie.prjoperacion.modelo.OperacionesBasicas;

/**
 * Encapsula la captura de datos de la peticion request
 * @author thc
 *
 */
public class OperacionAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws  Exception{
		OperacionesBasicas op = new OperacionesBasicas();
		ValidacionForm vf = (ValidacionForm) form;
		request.setAttribute("respuesta", op.suma(vf));
		return mapping.findForward("resultado");
	}
}
