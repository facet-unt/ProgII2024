/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;

/**
 *
 * @author Mariana
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private ArrayList<ProductoDelPedido> productosDelPedido = new ArrayList<>();
    private Cliente cliente;
    private Estado estado;

    public Pedido(int numero, LocalDateTime fechaYHora,ArrayList<ProductoDelPedido> productosDelPedido,Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.estado = Estado.CREADO;
        this.productosDelPedido=productosDelPedido;
        this.cliente= cliente;
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime verFechaYHora() {
        return fechaYHora;
    }

    public void asignarFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
    public LocalDate verFecha() {
        return this.fechaYHora.toLocalDate();
    }

     public LocalTime verHora() {
        return this.fechaYHora.toLocalTime();
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

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public ArrayList<ProductoDelPedido> verProductosDelPedido() {
        return productosDelPedido;
    }

    public void asignarProductosDelPedido(ArrayList<ProductoDelPedido> productosDelPedido) {
        this.productosDelPedido = productosDelPedido;
    }
    
    public void mostrar(){
        String patron = "hh:mm";
        String horaACadena = this.verHora().format(DateTimeFormatter.ofPattern(patron));
        
        System.out.println("\n\nNro: " + this.numero);
        System.out.print("Fecha: " + this.fechaACadena(this.verFecha()));
        System.out.println("\t\tHora: " + horaACadena);
        System.out.println("Cliente: " + this.cliente.verApellido() + ", " + this.cliente.verNombre());
        System.out.println("Estado: " + this.estado );
        System.out.println("\tProducto \tCantidad");
        System.out.println("\t==========================");
        for(ProductoDelPedido pp : this.productosDelPedido) {
            Producto producto = pp.verProducto();
            int cantidad = pp.verCantidad();
            System.out.println("\t" + producto + "\t" + cantidad);
        }
               
        }
    
    //métodos auxiliares para mostrar
    private String fechaACadena(LocalDate fecha) {
        String patron = "dd/MM/yyyy";
        String fechaEnCadena = fecha.format(DateTimeFormatter.ofPattern(patron));
        return fechaEnCadena;
    }

   
   
      
      
    
}
