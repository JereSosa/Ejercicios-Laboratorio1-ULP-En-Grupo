/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tplabo4_ejerciciocolegio;

/**
 *
 * @author jeso_
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando las 3 materias
        Materia ingles = new Materia(1,"Ingles", 1);
        Materia matematicas = new Materia(2,"Matematica", 1);
        Materia laboratorio = new Materia(3, "Laboratorio", 1);
        
        //Creando los 2 alumnos
        Alumno alumA = new Alumno(1001, "Lopez", "Martin");
        Alumno alumB = new Alumno(1002, "Martinez", "Brenda");
        
        //Inscribo a Lopez en 3 materias
        alumA.agregarMaterias(ingles);
        alumA.agregarMaterias(matematicas);
        alumA.agregarMaterias(laboratorio);
        
        //Inscribo a martinez en 3 materias y repito laboratorio
        alumB.agregarMaterias(ingles);
        alumB.agregarMaterias(matematicas);
        alumB.agregarMaterias(laboratorio);
        alumB.agregarMaterias(laboratorio);
        
        //Visualizo la cantidad de materias del alumno 1 y 2
        System.out.println("El alumno " + alumA.getNombre() + " esta inscripto en: " + alumA.cantidadMaterias() + " materias");
        System.out.println("El alumno " + alumB.getNombre() + " esta inscripto en: " + alumB.cantidadMaterias() + " materias");
        
        
    }
    
}
