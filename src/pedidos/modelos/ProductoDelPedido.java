/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.util.Objects;
import productos.modelos.Producto;

/**
 *
 * @author Mi buen PC
 */
public class ProductoDelPedido {
    
    private int cantidad;
    private Producto producto;

    public ProductoDelPedido(Producto producto, int cantidad) {
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
    
    public String VerDescripcionProducto(){
    return producto.verDescripcion();
    }

    public void AsignarProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.producto);
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
