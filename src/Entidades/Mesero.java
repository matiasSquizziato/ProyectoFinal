package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaRegistro;
    private List<Pedido> pedidos;
    

    // Constructor
    public Mesero(int idMesero, String nombre, String apellido, String dni, Date fechaRegistro) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
        this.pedidos = new ArrayList<>(); // Inicializa la lista de pedidos
    }

    //Vacio
    
    public Mesero() {
    }
    
    
    

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

     
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fechaRegistro=" + fechaRegistro + ", pedidos=" + pedidos + '}';
    }

    
    

}

