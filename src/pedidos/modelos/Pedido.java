/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;

/**
 *
 * @author luis
 */
public class Pedido {

    private int numero;
    private Cliente cliente;
    private Estado estado;
    private LocalDateTime fechaYHora;

    //private ArrayList<ProductoDelPedido> productosDelPedido = new ArrayList<>();
    
    // Definicion de los constructores
    public Pedido(int numero, LocalDateTime fechaYHora, Cliente cliente, Estado estado) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        this.estado = estado;
    }
    
    public Pedido(int numero, Cliente cliente, Estado estado) {
        this(numero, LocalDateTime.now(), cliente, estado);
    }
    
    public Pedido(int numero, Cliente cliente) {
        this(numero, LocalDateTime.now(), cliente, Estado.PROCESANDO);
    }
    
    public Pedido(int numero, LocalDateTime fechaYHora, Cliente cliente) {
        this(numero, fechaYHora, cliente, Estado.PROCESANDO);
    }

    public void agregarProducto(Producto unProducto, int cantidad) {
        // ProductoDelPedido pdp = new ProductoDelPedido(cantidad, unProducto);
        // this.productosDelPedido.add(pdp);
    }

    // Definicion del metodo mostrar
    public void mostrar() {
        System.out.println("Nro: " + numero);
        System.out.println("Fecha: " + fechaYHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\tHora: " + fechaYHora.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println("Cliente: " + cliente.verApellido() + ", " + cliente.verNombre());
        System.out.println("Estado: " + estado.toString());
        //for(ProductoDelPedido pdp : this.productosDelPedido) {
        //    pdp.mostrar();
        //}
    }

    // Definicion de los metodos get/set
    
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

}
