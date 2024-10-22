package pedidos.modelos;

import productos.modelos.Producto;

public class ProductoDelPedido {
    private int cantidad;
    private Producto producto;
    
    // Definicion del Constructor
    
    public ProductoDelPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    // Metodo mostrar
    
    public void mostrar(){
        System.out.println(producto.verDescripcion() + "\t\t" + cantidad);
    }
    
    // Definición de los metodos Ver/Asignar

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
    
}
