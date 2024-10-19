/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testGonzalo;

import AccesoADatos.MozoData;
import AccesoADatos.PedidoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Pc
 */
public class PruebaGonzalo {

    public static void main(String[] args) {
        Mesa m1 = new Mesa(01,01,4,true);
        Mesero mozo1 = new Mesero();
        MozoData mozoData  = new MozoData();
        //mozoData.guardarMozo(mozo1);
        Pedido pedido1 = new Pedido(m1, mozo1, "Pendiente", LocalDate.of(1999, Month.MARCH, 3));
        PedidoData pedidoData= new PedidoData();
        pedidoData.hacerPedido(pedido1, 1, 1);
    }   
    
}
