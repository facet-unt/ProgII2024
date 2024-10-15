/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos.modelos;

import java.util.ArrayList;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.unProducto);
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
        final ProductodePedido other = (ProductodePedido) obj;
        if (!Objects.equals(this.unProducto, other.unProducto)) {
            return false;
        }
        return true;
    }
    
    public void mostrar2(){
      System.out.println("Producto: " +this.unProducto.verDescripcion());  
      System.out.println("Cantidad: " +cantidad); 
    }
    
    public int vercantidad(){
        return cantidad;
    }
    
    public void asignarcantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public void verProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }
}

