/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author Mi buen PC
 */
public class Pedido {
    
    private int numero;
    private LocalDateTime fechaYHora;
    private Cliente cliente;
    private Estado estado;
    private ArrayList<ProductoDelPedido> productoDelPedido = new ArrayList<>();

 

    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList<ProductoDelPedido> productoDelPedido, Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        
        this.productoDelPedido = productoDelPedido;
    }
    
    public Pedido(int numero, LocalDateTime fechaYHora, Cliente cliente, Estado estado, ArrayList<ProductoDelPedido> productoDelPedido){
        this(numero,  fechaYHora, productoDelPedido, cliente);
        this.estado = estado;
    
    }
    
 

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public Cliente verCliente() {
        return cliente;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDateTime verFechaYHora() {
        return fechaYHora;
    }

    public void asignarFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
    public LocalTime verHora(){
    return fechaYHora.toLocalTime();
    }
    
    public LocalDate verFecha(){
        return fechaYHora.toLocalDate();
    }

    public ArrayList<ProductoDelPedido> getProductoDelPedido() {
        return productoDelPedido;
    }

    public void setProductoDelPedido(ArrayList<ProductoDelPedido> productoDelPedido) {
        this.productoDelPedido = productoDelPedido;
    }
    
    private void mostrarProductosDelPedido(){
    for(ProductoDelPedido productoPedidos: productoDelPedido){
    System.out.println(productoPedidos.VerDescripcionProducto() +"\t"+ productoPedidos.VerCantidad());
    }
    }
    
    
    public void mostrar(){
        
        
        System.out.println("Nro: "+ numero);
        System.out.println("Fecha: " + fechaYHora.toLocalDate() + "\tHora: "+ fechaYHora.getHour() + ":" + fechaYHora.getMinute());
        System.out.println("Cliente: " + cliente.verApellido() + "\t " + cliente.verNombre());
        System.out.println("Estado: " + estado);
        System.out.println("Producto    Cantidad");
        System.out.println("============================");
        mostrarProductosDelPedido();
    
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.numero;
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
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }
    
    
    
    
    
    
    
    
}
