/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import productos.modelos.Producto;

/**
 *
 * @author Mi buen PC
 */
public class ProductoDelPedido {
    
    private int cantidad;
    private Producto producto;

    public ProductoDelPedido(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }
    
    

    public int VerCantidad() {
        return cantidad;
    }

    public void AsignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto VerProducto() {
        return producto;
    }

    public void AsignarProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
}
