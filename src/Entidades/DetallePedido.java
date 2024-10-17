
package Entidades;

public class DetallePedido {
    private int idDetalle;
    private int idPedido;
    private int idProducto;
    private int cantidadProducto;
    private double subtotal;

    // Constructor
    public DetallePedido(int idDetalle, int idPedido, int idProducto, int cantidadProducto, double subtotal) {
        this.idDetalle = idDetalle;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidadProducto = cantidadProducto;
        this.subtotal = subtotal;
    }

    // Constructor sin IdDetalle
    public DetallePedido(int idPedido, int idProducto, int cantidadProducto, double subtotal) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidadProducto = cantidadProducto;
        this.subtotal = subtotal;
    }
    
    // Constructor vacío
    public DetallePedido(){
    }
    
    
    // Getters y Setters
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "idDetalle=" + idDetalle + ", idPedido=" + idPedido + ", idProducto=" + idProducto + ", cantidadProducto=" + cantidadProducto + ", subtotal=" + subtotal + '}';
    }


    

}
