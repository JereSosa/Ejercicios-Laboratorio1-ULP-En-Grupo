/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplabo4_ejerciciocolegio;

import java.util.HashSet;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author jeso_
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet <Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMaterias(Materia m){
        if (materias.add(m)) {
            JOptionPane.showMessageDialog(null, "Alumno agregado correctamente");
        } else 
            JOptionPane.showMessageDialog(null, "El alumno ya se encuentra inscripto");
    }
    
    public int cantidadMaterias(){
        return materias.size();
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return legajo == alumno.legajo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo);
    }
}
