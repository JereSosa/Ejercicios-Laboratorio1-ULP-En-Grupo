import java.util.TreeSet;

public class Supermercado {
    private TreeSet<Producto> productos;

    public Supermercado() {
        productos = new TreeSet<>();
    }

    public boolean agregarProducto(Producto producto) {
        return productos.add(producto);
    }

    public boolean eliminarProducto(int codigo) {
        return productos.removeIf(p -> p.getCodigo() == codigo);
    }

    public Producto buscarPorCodigo(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public TreeSet<Producto> getProductos() {
        return productos;
    }
}

