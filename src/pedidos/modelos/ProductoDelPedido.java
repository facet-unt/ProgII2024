/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import productos.modelos.Producto;

/**
 *
 * @author fabri
 */
public class ProductoDelPedido {
    
    private int cantidad;
    private Producto producto;

    public int verCantidad() {
        return cantidad;
    }

    public void asignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Producto verProducto(){
        return producto;
    }
    
    public void asignarProducto(Producto producto){
        this.producto = producto;
    }
    
    public ProductoDelPedido(int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    
    }
    
}
