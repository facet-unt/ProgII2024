package pedidos.modelos;

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
    
    
}