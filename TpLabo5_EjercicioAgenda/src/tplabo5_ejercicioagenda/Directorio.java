/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplabo5_ejercicioagenda;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Esquina del Vidrio
 */
public class Directorio {
    private TreeMap<Long, Contactos> contactos;

    public Directorio(TreeMap<Long, Contactos> contactos) {
        this.contactos = contactos;
    }
    
    public void agregarContacto(long telefono, Contactos contacto){
        contactos.put(telefono, contacto);
    }
    
    public Contactos buscarContacto(long telefono){
        return contactos.get(telefono);
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contactos> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equals(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public ArrayList<Contactos> buscarContactos(String ciudad) {
        ArrayList<Contactos> listaContactos = new ArrayList<>();
        for (Contactos contacto : contactos.values()) {
            if (contacto.getCiudad().equals(ciudad)) {
                listaContactos.add(contacto);
            }
        }
        return listaContactos;
    }

    public boolean borrarContacto(Long telefono) {
        return contactos.remove(telefono) != null;
    }
}
