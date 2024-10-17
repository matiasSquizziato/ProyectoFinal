package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private int idReserva;
    private int idMesa;
    private String nombreCliente;
    private int dniCliente;
    private LocalDate fechaReserva;
    private LocalTime horaReserva; 
    private boolean estado; 

    // Constructor
    public Reserva(int idReserva, int idMesa, String nombreCliente, int dniCliente, LocalDate fechaReserva, LocalTime horaReserva, boolean estado) {
        this.idReserva = idReserva;
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.estado = estado;
    }

        // Constructor sin IdReserva
    public Reserva(int idMesa, String nombreCliente, int dniCliente, LocalDate fechaReserva, LocalTime horaReserva, boolean estado) {
        this.idMesa = idMesa;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.estado = estado;
    }

        // Constructor vacío
    public Reserva() {
    }

   

  
   
  
   

    // Getters y Setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalTime getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(LocalTime horaReserva) {
        this.horaReserva = horaReserva;
    }

 



    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  

 
}
