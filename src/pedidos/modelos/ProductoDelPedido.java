/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.util.Objects;
import productos.modelos.Producto;

/**
 *
 * @author diego
 */
public class ProductoDelPedido {
    private int cantidad;
    private Producto producto;
    
    // Definicion del constructor
    
    public ProductoDelPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    // Metodo mostrar
    
    public void mostrar(){
        System.out.println(producto.verDescripcion() + "\t\t" + cantidad);
    }
    
    // Metodo equals y hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.producto);
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
    
    
    
    // Definicion de los metodos get/set

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
