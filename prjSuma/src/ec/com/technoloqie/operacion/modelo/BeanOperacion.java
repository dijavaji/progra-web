package ec.com.technoloqie.operacion.modelo;

/**
*
* @author fing.labcom
*/
public class BeanOperacion {
	private Integer numero1;
    private Integer numero2;
    
    public BeanOperacion(){
        this.numero1 =0;
        this.numero2 = 0;
    }
    
    public Integer suma(){
        return (numero1 + numero2);
    }
    
    //getters and setters
    public synchronized void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public synchronized void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }
}
