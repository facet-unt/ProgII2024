/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import usuarios.modelos.Cliente;
import java.time.format.DateTimeFormatter;
import productos.modelos.Producto;
import java.util.ArrayList;


/**
 *
 * @author joaquincoro
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Estado estado;
    private String Fecha;
    private String Hora;
    private Cliente cliente;
    private ArrayList<ProductoDelPedido> Productos = new ArrayList<>(); 
    
    public Pedido(int numero, LocalDateTime fechaYHora, Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        estado = estado.CREADO;
        Fecha = this.StringFecha();
        Hora = this.StringHora();
    }
    
    public void mostrar() {
        System.out.println("Nro: " + numero + "\nFecha: " + Fecha + "\tHora: " + Hora + "\nCliente: " + cliente.verApellido() + ", " + cliente.verNombre() + "\nEstado: " + estado);
        System.out.println("Producto    Cantidad" + "\n==========================");
        for(ProductoDelPedido p: Productos){
            System.out.println(p.verUnProducto() + "\t" + p.verCantidad());
        }
    }
    
    private String StringFecha() {
        String pattern = "dd/mm/yyyy";
        String StringFecha = fechaYHora.format(DateTimeFormatter.ofPattern(pattern));
        return StringFecha;
    }

    private String StringHora() {
        String pattern = "hh:mm";
        String StringHora = fechaYHora.format(DateTimeFormatter.ofPattern(pattern));
        return StringHora;
    }
    
    public int verNumero() {
        return numero;
    }

//    public void setNumero(int numero) {
//        this.numero = numero;
//    }

    public LocalDateTime verFechaYHora() {
        return fechaYHora;
    }

//    public void setFechaYHora(LocalDateTime fechaYHora) {
//        this.fechaYHora = fechaYHora;
//    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente verCliente() {
        return cliente;
    }

//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }

    public String verFecha() {
        return Fecha;
    }

    public String verHora() {
        return Hora;
    }
    
    public void agregarProducto(Producto unProducto, int cantidad){
        ProductoDelPedido producto = new ProductoDelPedido(cantidad, unProducto);
        this.Productos.add(producto);
    }
}