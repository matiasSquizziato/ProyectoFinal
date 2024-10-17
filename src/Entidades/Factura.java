
package Entidades;
import Entidades.Pedido;
import java.util.Date;

public class Factura {
    private int idFactura;
    private Pedido pedido; // Cambiado a Pedido en lugar de int
    private double total;
    private Date fechaFactura;

    // Constructor completo
    public Factura(int idFactura, Pedido pedido, double total, Date fechaFactura) {
        this.idFactura = idFactura;
        this.pedido = pedido; // Asigna el objeto Pedido
        this.total = total;
        this.fechaFactura = fechaFactura;
    }
    
     // Constructor sin IdFactura
    public Factura(Pedido pedido, double total, Date fechaFactura) {
        this.pedido = pedido; // Asigna el objeto Pedido
        this.total = total;
        this.fechaFactura = fechaFactura;
    }
    
     // Constructor vacío
    public Factura() {
    }

    // Getters y Setters
    public int getIdFactura() {
        return idFactura;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public double getTotal() {
        return total;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", pedido=" + pedido + ", total=" + total + ", fechaFactura=" + fechaFactura + '}';
    }
    
    
    
}
