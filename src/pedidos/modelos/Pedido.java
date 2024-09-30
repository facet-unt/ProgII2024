/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.util.ArrayList;
import productos.modelos.Producto;

/**
 *
 * @author luis
 */
public class Pedido {
    private int numero;
    private ArrayList<ProductoDelPedido> productosDelPedido = new ArrayList<>();

    public Pedido(int numero) {
        this.numero = numero;
    }
    
    public void agregarProducto(Producto unProducto, int cantidad) {
        ProductoDelPedido pdp = new ProductoDelPedido(cantidad, unProducto);
        this.productosDelPedido.add(pdp);
    }
    
    public void mostrar() {
        System.out.println(this.numero);
        for(ProductoDelPedido pdp : this.productosDelPedido) {
            pdp.mostrar();
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
