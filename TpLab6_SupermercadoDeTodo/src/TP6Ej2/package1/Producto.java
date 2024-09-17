package TP6Ej2.package1;

import java.util.Objects;
import java.util.TreeSet;

public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;  // Comestible, Limpieza, Perfumería
     private static TreeSet<Producto> listaProductos = new TreeSet();
    
    
    
    public Producto(int codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public static TreeSet<Producto> getProductos() {
        return listaProductos;
    }

    public static void setProductos(TreeSet<Producto> productos) {
        Producto.listaProductos = productos;
    }

  
 
    

    // Getters y Setters
   

    // Método para ordenar por código
    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.codigo, o.codigo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

