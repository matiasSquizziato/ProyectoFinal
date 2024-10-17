
package Vistas;

import AccesoADatos.ConexionData;
import AccesoADatos.MesaData;
import AccesoADatos.MozoData;
import AccesoADatos.MozoData1;
import AccesoADatos.ReservaData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Reserva;
import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author matiSqui
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Mesa m1 = new Mesa(01,01,4,true);
//        Mesa m2 = new Mesa(02,02,2,true);
//        
//        Reserva r1 = new Reserva(01,m1.getIdMesa(),"Juan Jose",1234,LocalDate.of(1999, 11, 9),LocalTime.of(22, 00),true);
//        Reserva r2 = new Reserva(02,m1.getIdMesa(),"Matias Jesus",12222,LocalDate.of(1999, 11, 3),LocalTime.of(23, 00),true);
//        
//        
//        MesaData meData = new MesaData();
//        ReservaData reData = new ReservaData();
//        
//        
//        
//        //Cargo una mesa
//        meData.cargarMesa(m1);
//        meData.cargarMesa(m2);
//        
//        
//        //Hago la reserva
//        reData.hacerReserva(r1, m1.getIdMesa());
//        reData.hacerReserva(r2, m2.getIdMesa());
//        




        Mesero mozo1 = new Mesero(01,"Squizziato", "Matias", 42278369, LocalDate.of(1999, Month.MARCH, 3));
        
        MozoData mozoData  = new MozoData();
        
        mozoData.guardarMozo(mozo1);
        
        
        
        
        
        
        
    }
    
}
