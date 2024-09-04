/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tplabo5_ejercicioagenda;



/**
 *
 * @author Esquina del Vidrio
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    
        Directorio directorio = new Directorio();

        Contactos contacto1 = new Contactos("12345678", "Juan", "Perez", "Buenos Aires", "Calle Falsa 123");
        Contactos contacto2 = new Contactos("87654321", "Ana", "Garcia", "Rosario", "Av. Siempre Viva 456");
        Contactos contacto3 = new Contactos("56781234", "Luis", "Gomez", "Córdoba", "Calle Luna 789");
        Contactos contacto4 = new Contactos("43218765", "Maria", "Lopez", "Buenos Aires", "Av. Libertador 1000");

        directorio.agregarContacto(1111111111L, contacto1);
        directorio.agregarContacto(2222222222L, contacto2);
        directorio.agregarContacto(3333333333L, contacto3);
        directorio.agregarContacto(4444444444L, contacto4);

        System.out.println("Buscar contacto por teléfono 1111111111: " + directorio.buscarContacto(1111111111L));

        System.out.println("Buscar teléfonos por apellido 'Lopez': " + directorio.buscarTelefono("Lopez"));

        System.out.println("Buscar contactos por ciudad 'Buenos Aires': " + directorio.buscarContactos("Buenos Aires"));

        System.out.println("Borrar contacto con teléfono 2222222222: " + directorio.borrarContacto(2222222222L));

        System.out.println("Buscar contacto por teléfono 2222222222: " + directorio.buscarContacto(2222222222L));
    }
}  // TODO code application logic here
    
    

