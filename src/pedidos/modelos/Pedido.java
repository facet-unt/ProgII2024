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
 * @author luis
 */
public class Pedido {
    private int numero;
    private Cliente unCliente;
    private LocalDateTime fechaYHora;
    private Estado estado;
    
    private ArrayList<ProductoDelPedido> productosDelPedido = new ArrayList<>();
    
    public Pedido(Estado estado, int numero, LocalDateTime fechaYHora, Cliente unCliente) {
        this.estado = estado;
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unCliente = unCliente;
    }
    
    public void agregarProducto(Producto unProducto, int cantidad) {
        ProductoDelPedido pdp = new ProductoDelPedido(cantidad, unProducto);
        this.productosDelPedido.add(pdp);
    }
    
    public void mostrar() {
        System.out.println("Numero del pedido" + numero);
        System.out.println("Fecha" + numero);
        
        
        
        
        
//        System.out.println(this.numero);
//        for(ProductoDelPedido pdp : this.productosDelPedido) {
//            pdp.mostrar();
//        }
    }
    
    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }
    
    public Cliente verCliente() {
        return unCliente;
    }

    public void asignarCliente(Cliente cliente) {
        this.unCliente = cliente;
    }
    
    public LocalDateTime verFechaHora() {
        LocalDateTime fechaHora = fechaYHora;
        return fechaHora;
    }

    public void asignarFechaHora(LocalDateTime fechaHora) {
        this.fechaYHora = fechaHora;
    }
    public LocalDate verFecha(LocalDateTime fechaHora){
        LocalDate localDate = fechaHora.toLocalDate();
        return localDate;
    
            }
    public LocalTime verHora(LocalDateTime fechaHora){
        LocalTime localTime = fechaHora.toLocalTime();
        return localTime;
            }
    private String fechaACadena(LocalDate fechaHora){
        String patron = "dd/mm/yyyy";
        String fechaEnCadena = fechaHora.format(DateTimeFormatter.ofPattern(patron));
        return fechaEnCadena;
    }
    private String horaACadena(LocalTime fechaHora){
        String patron = "dd:mm";
        String horaEnCadena = fechaHora.format(DateTimeFormatter.ofPattern(patron));
        return horaEnCadena;
    }
}
