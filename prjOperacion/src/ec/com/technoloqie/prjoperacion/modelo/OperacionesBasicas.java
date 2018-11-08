package ec.com.technoloqie.prjoperacion.modelo;

import ec.com.technoloqie.prjoperacion.controlador.form.ValidacionForm;

public class OperacionesBasicas {

	public Integer suma(ValidacionForm vf) {
		return (Integer.parseInt(vf.getNumero1())+Integer.parseInt(vf.getNumero2()));
	}

}
