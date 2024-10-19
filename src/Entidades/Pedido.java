package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Mesa mesa; // Cambiado a tipo Mesa en lugar de int
    private Mesero mesero; // Cambiado a tipo Mesero
    private String estado; // Puede ser 'pendiente' o 'pagado'
    private LocalDate fechaPedido;
    private List<DetallePedido> detalles; // Detalles del pedido

    // Constructor
    public Pedido(int idPedido, Mesa mesa, Mesero mesero, String estado, LocalDate fechaPedido) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = estado;
        this.fechaPedido = fechaPedido;
        this.detalles = new ArrayList<>(); // Inicializa la lista de detalles
    }
    
    // Constructor sin IdPedido
    public Pedido(Mesa mesa, Mesero mesero, String estado, LocalDate fechaPedido) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = estado;
        this.fechaPedido = fechaPedido;
        this.detalles = new ArrayList<>(); // Inicializa la lista de detalles
    }
    
    // Constructor sin IdPedido
    public Pedido(){
    }

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void addDetalle(DetallePedido detalle) {
        this.detalles.add(detalle);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", mesa=" + mesa.getIdMesa() + // Muestra solo el ID de la mesa
                ", mesero=" + mesero.getIdMesero() + // Muestra solo el ID del mesero
                ", estado='" + estado + '\'' +
                ", fechaPedido=" + fechaPedido +
                ", detalles=" + detalles.size() + // Muestra la cantidad de detalles
                '}';
    }
}
