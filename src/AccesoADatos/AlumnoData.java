/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class AlumnoData {
    
private Connection con=null;
    
    
    public AlumnoData(){
        
       con=Conexion.getConexion();
        
    }
    
   public void guardarAlumno (Alumno alumno){
       
     String sql ="insert into alumno (dni,apellido, nombre, fechaNacimiento,estado)"+"VALUES(?,?,?,?,?)" ;
     
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechanacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                
            alumno.setIdAlumno(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Alumno agregado");
            
            
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
        }
       
   }
    
  public void modificarAlumno(Alumno alumno){
      
      String sql= "UPDATE alumno SET dni= ?, apellido= ?, nombre= ?, fechaNacimiento= ? "+"WHERE idAlumno= ?";
    try {
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechanacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
           int exito= ps.executeUpdate();
           if(exito==1){
               JOptionPane.showMessageDialog(null, "Alumno modificado");
           }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
    }
      
  }
   
   public void eliminarAlumno (int id){
       
       String sql= "UPDATE alumno set estado= 0 WHERE idAlumno= ?";
    try {
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        int exito = ps.executeUpdate();
        
        if (exito==1){
          JOptionPane.showMessageDialog(null, "Alumno eliminado");  
            
            
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
    }
       
       
       
   }
           
   
    
   public Alumno buscarAlumno (int id){
       
       String sql ="SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno= ? AND estado = 1";
       Alumno alumno= null;
    try {
        PreparedStatement ps= con.prepareStatement(sql);
        
        ps.setInt(1, id);
        ResultSet rs= ps.executeQuery();
         if(rs.next())  {
            alumno = new Alumno();
            alumno.setIdAlumno(id);
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getNString("apellido"));
            alumno.setNombre(rs.getNString("nombre"));
            alumno.setFechanacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setActivo(true);
            
         }else {
             JOptionPane.showMessageDialog(null, "No existe el alumno");
         }
           ps.close();
                
    } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
    }
    return alumno;
   }
   
     
   public Alumno buscarAlumnoPorDni (int dni){
       
       String sql ="SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni= ? AND estado = 1";
       Alumno alumno= null;
    try {
        PreparedStatement ps= con.prepareStatement(sql);
        
        ps.setInt(1, dni);
        ResultSet rs= ps.executeQuery();
         if(rs.next())  {
            alumno = new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getNString("apellido"));
            alumno.setNombre(rs.getNString("nombre"));
            alumno.setFechanacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setActivo(true);
            
         }else {
             JOptionPane.showMessageDialog(null, "No existe el alumno");
         }
           ps.close();
                
    } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
    }
    return alumno;
   }
   
    
   public List<Alumno> listarAlumnos (){
       
       String sql ="SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1";
       
      ArrayList<Alumno> alumnoss= new ArrayList<>();
    try {
        PreparedStatement ps= con.prepareStatement(sql);
        ResultSet rs= ps.executeQuery();
        
        while(rs.next())  {
            Alumno alumno = new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getNString("apellido"));
            alumno.setNombre(rs.getNString("nombre"));
            alumno.setFechanacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setActivo(true);
            
            alumnoss.add(alumno);
            
         }
           ps.close();
                
    } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
    }
    return alumnoss;
   }
   
   
}

