package Entidades;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.time.LocalDate;


public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaRegistro;
    private List<Pedido> pedidos;
    

    // Constructor

    public Mesero(int idMesero, String nombre, String apellido, int dni, LocalDate fechaRegistro, List<Pedido> pedidos) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
        this.pedidos = pedidos;
    }

    public Mesero(int idMesero, String nombre, String apellido, int dni, LocalDate fechaRegistro) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
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

