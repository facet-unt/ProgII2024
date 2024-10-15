package pedidos.modelos;

import java.util.Objects;
import productos.modelos.Producto;

public class ProductoDelPedido {
    private int cantidad;
    private Producto producto;

    public ProductoDelPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.println(producto.verDescripcion() + "\t\t" + cantidad);
    }

    public int verCantidad() {
        return cantidad;
    }

    public void asignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto verProducto() {
        return producto;
    }

    public void asignarProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.producto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDelPedido other = (ProductoDelPedido) obj;
        return Objects.equals(this.producto, other.producto);
    }   
}