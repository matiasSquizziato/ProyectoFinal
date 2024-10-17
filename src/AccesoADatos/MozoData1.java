
package AccesoADatos;

import Entidades.Mesero;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author matiSqui
 */
public class MozoData1 {
    
    
    private Connection con = null;
    
    
    
    public MozoData1(){
        
        con = ConexionData.getConexion();
        
    }
    
    
    
    public void cargarMozo(Mesero mozo){
       
        
        String sql = "INSERT INTO mesero(nombre, apellido, dni, fechaRegistro) VALUES (?,?,?,?) ";
        

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, mozo.getNombre());
            ps.setString(2, mozo.getApellido());
            ps.setInt(3, mozo.getDni());
            ps.setDate(4, Date.valueOf(mozo.getFechaRegistro()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Mozo cargado con exito");
                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERROR AL INGRESASR A LA TABLA MESERO" + ex.getMessage());
        }         
        
    }
    
    
    
    
    
}
