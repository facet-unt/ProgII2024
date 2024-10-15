/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import productos.modelos.Producto;

/**
 *
 * @author joaquincoro
 */
public class ProductoDelPedido {
    private int cantidad;
    private Producto unProducto;

    public ProductoDelPedido(int cantidad, Producto unProducto) {
        this.cantidad = cantidad;
        this.unProducto = unProducto;
    }

    public int verCantidad() {
        return cantidad;
    }

    public void AsignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String verUnProducto() {
        return unProducto.verDescripcion();
    }

//    public void AsignarUnProducto(Producto unProducto) {
//        this.unProducto = unProducto;
//    }
    
    
    
    
}
