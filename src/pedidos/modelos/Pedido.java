/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import pedidos.modelos.ProductodePedido;

/**
 *
 * @author luis
 */
public class Pedido {
    private int numero;
    private Cliente unCliente;
    private LocalDateTime fechaYHora;
    private Estado estado;
    
    private ArrayList<ProductodePedido> lista = new ArrayList<>();

    public Pedido(int numero, LocalDateTime fechaYHora, Cliente unCliente,Estado estado ) {
        
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unCliente = unCliente;
        unCliente.agrgarPedido(this);
        this.estado = estado;
    }
    
     public void agregarProducto(Producto unProducto, int cantidad) {
        lista.add(new ProductodePedido(cantidad,unProducto));
     }
 
    
    public void mostrar() {
        System.out.println("Pedido Número: " + this.numero);
        System.out.println("Fecha: " +fechaYHora.toLocalDate()+"\t\tHora: " +fechaYHora.toLocalTime());
        System.out.println("Cliente: " + this.unCliente.verApellido()+"\t" +this.unCliente.verNombre());
        System.out.println("Estado: " + this.estado);
        System.out.println("\t\t\tProductos del Pedido:");
        System.out.println("\t\t\t====================");
        for (ProductodePedido pro : this.lista) {
           pro.mostrar2();
        }
    }
    
    public void verCliente(Cliente cliente) {
        this.unCliente = cliente;
    }
    
    public void verestado(Estado estado) {
        this.estado = estado;
    }
    
    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }
      
}
