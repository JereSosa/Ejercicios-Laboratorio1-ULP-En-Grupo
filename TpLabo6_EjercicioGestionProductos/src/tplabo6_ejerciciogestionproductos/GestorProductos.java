/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tplabo6_ejerciciogestionproductos;

import java.util.HashSet;

/**
 *
 * @author ariel
 */
public class GestorProductos {
    private static HashSet<Producto> productos = new HashSet<>();

    public static HashSet<Producto> getProductos() {
        return productos;
    }
    
    public static void agregarProducto(Producto producto) {
        productos.add(producto);
    } 
}
