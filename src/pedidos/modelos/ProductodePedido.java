/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos.modelos;

import java.util.ArrayList;
import productos.modelos.Producto;
import pedidos.modelos.Pedido;
/**
 *
 * @author Gisela
 */
public class ProductodePedido {
    
    private int cantidad;
    private Producto unProducto;
    
    
    public ProductodePedido(int cantidad, Producto unProducto){
        this.cantidad = cantidad;
        this.unProducto = unProducto;
    }
    
    public void mostrar2(){
      System.out.println("Producto: " +this.unProducto.verDescripcion());  
      System.out.println("Cantidad: " +cantidad); 
    }
    
    public int vercantidad(){
        return cantidad;
    }
    
    public void asgnarcantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public void verProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }
}

