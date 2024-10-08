/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.util.ArrayList;
import productos.modelos.Producto;

/**
 *
 * @author Ahmed Chaben
 */
public class ProductoDelPedido {
    
    private int cantidad;
    private Producto producto;
    
    public ProductoDelPedido(int cantidad, Producto producto){
        this.cantidad=cantidad;
        this.producto=producto;
    }
    
    public Producto verProducto(){
        return this.producto;
    }
    
    public void asignarProducto(Producto producto){
        this.producto=producto;
    }
    
    public int verCantidad(){
        return this.cantidad;
    }
    
    public void asignarCantidad(int cantidad){
        this.cantidad=cantidad;
    }
}
