package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int idMesa;
    private int numeroMesa;
    private int capacidad;
    private boolean estado;
    private List<Reserva> reservas; // Relación uno a muchos

    // Constructor
//    public Mesa(int idMesa, int numeroMesa, int capacidad, boolean estado, List<Reserva> reservas) {
//        this.idMesa = idMesa;
//        this.numeroMesa = numeroMesa;
//        this.capacidad = capacidad;
//        this.estado = estado;
//        this.reservas = reservas;
//    }

    public Mesa(int idMesa, int numeroMesa, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    
  
    
   
    
    
    
    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  
 

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }
}
