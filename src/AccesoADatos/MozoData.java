/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class MozoData {
    
    
    private Connection con = null;
    
    
    
    public MozoData(){
        
        con = (Connection) Conexion.getConexion();
        
    }
    
    
    
    public void cargarMozo(Mesero mozo){
        
        System.out.println(con);
        
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
