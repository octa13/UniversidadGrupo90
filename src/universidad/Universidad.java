/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;

import java.sql.Connection;
import java.time.LocalDate;

/**
 *
 * @author Fernando
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  Connection con= Conexion.getConexion();
  
  
   //Materia Matema= new Materia ("matematica",2024,true); 
MateriaData mate=new MateriaData();
   //mate.guardarMateria(Matema);
  // Materia materiaEncontrado = mate.buscarMateria(3);
   //if(materiaEncontrado!=null){
 
       // System.out.println("nombre: " +materiaEncontrado.getNombre());
       // System.out.println("año: "+ materiaEncontrado.getAnioMateria());
  // }
   
  // mate.modificarMateria(Matema); //coloco el id de lo que deseo modificar
   
  //mate.eliminarMateria(1);
  
  
 
 for(Materia materia : mate.listarMateria()){
     
     System.out.println(materia.getNombre());
     System.out.println(materia.getAnioMateria());
     
     
 }
  
  
  
  
  
  
  
  
  
  
  
  
  
 // Alumno Juan= new Alumno(8,40861,"Martinez","Maria", LocalDate.of(1994, 8, 8),true);
 // AlumnoData alu= new AlumnoData();
  
  //alu.guardarAlumno(Juan);
  
  
  
 // alu.modificarAlumno(Juan);
   
 // alu.eliminarAlumno(8);
// Alumno alumnoEncontrado = alu.buscarAlumno(7);
 //Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(14567);
 //if(alumnoEncontrado!=null){
 
       //System.out.println("dni: " +alumnoEncontrado.getDni());
      //System.out.println("apellido: "+alumnoEncontrado.getApellido());
  
//}
 
 //AlumnoData alu =new AlumnoData ();
 
 /*for(Alumno alumno : alu.listarAlumnos()){
     
     System.out.println(alumno.getDni());
     System.out.println(alumno.getApellido());
     System.out.println(alumno.getNombre());
     System.out.println(alumno.getFechanacimiento());
     
     
 }*/
 
 
 
 
 
 
 
   /* AlumnoData ad= new AlumnoData();
    MateriaData md= new MateriaData();
    InscripcionData id= new InscripcionData();
    
    Alumno Ricardo=ad.buscarAlumno(7);
    
    Materia mate=md.buscarMateria(2);
    
    Inscripcion insc=new Inscripcion(Ricardo, mate, 9);
    
   //id.guardarInscripcion(insc);
   // id.actualizarNota(7, 2, 7);
   // id.borrarInscripcionMateriaAlumno(7, 2);
    
    /*for(Inscripcion inscripcion: id.obtenerInscripciones()){
        
        System.out.println("id "+inscripcion.getIdInscripcion()); 
        System.out.println("Apellido "+inscripcion.getAlumno().getApellido()); 
        System.out.println("Materia "+inscripcion.getMateria().getNombre()); 
    }*/
    
    
   // for (Materia materia:id.obtenerMateriasNoCursadas(7)){
        
       // System.out.println("nombre " +materia.getNombre());  
        
   // }
    
    
    
    
    
    
    }
    
    
    
    
    
     
   
 
 }
    

