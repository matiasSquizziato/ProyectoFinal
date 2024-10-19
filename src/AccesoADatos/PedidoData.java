/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class PedidoData {
       
    private Connection con = null;
    
    public PedidoData(){
        con = ConexionData.getConexion();
    }
    
    public void hacerPedido (Pedido pedido, int idMesa, int idMozo){
        String sql = "INSERT INTO pedido(id_mesa, id_mesero, estado, fecha_pedido) VALUES (?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        
            //ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(1, 1);
            //ps.setInt(2, pedido.getMesero().getIdMesero());
            ps.setInt(2,1);
            ps.setString(3, pedido.getEstado());
            ps.setDate(4, Date.valueOf(pedido.getFechaPedido()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Pedido de la mesa...: " +pedido.getMesa().getNumeroMesa() + " fue tomado con exito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla: " + pedido + ex.getMessage());
        }
    }
}

