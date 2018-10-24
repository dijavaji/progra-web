package ec.com.technoloqie.productoWeb.controlador.beans;

import java.io.Serializable;

/**
 * Clase es un sevlet serializable captura todos los productos
 * @author fing.labcom
 */
@SuppressWarnings("serial")
public class ProductoBean implements Serializable{
    
    private String idProducto;
    private String idCategoria;
    private String nombreCategoria;
    private String nombreProducto;
    private Integer stockProducto;
    private Integer precioProducto;

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setStockProducto(Integer stockProducto) {
        this.stockProducto = stockProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Integer getStockProducto() {
        return stockProducto;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }    
}

