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
import usuarios.modelos.Cliente;

/**
 *
 * @author luis
 */
public class Pedido {
    private int numero;
    private Cliente unCliente;
    private LocalDateTime fechaYHora;
    private String fechaacadena;
    private String horaacadena;
    private Estado estado;
    
    private ArrayList<Pedido> ProductosDelPedido = new ArrayList<>();

    public Pedido(int numero, LocalDateTime fechaYHora, Cliente unCliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unCliente = unCliente;
    }
    
//    public void agregarProducto(Producto unProducto, int cantidad) {
//        ProductoDelPedido pdp = new ProductoDelPedido(cantidad, unProducto);
//        this.productosDelPedido.add(pdp);
//    }
    
    public void mostrar() {
        System.out.println("Nro: " + this.numero);
        System.out.println("Fecha: " + this.fechaacadena + "   Hora: " + this.horaacadena);
        System.out.println("Cliente: " + unCliente);
        System.out.println("Estado: " + Estado.CREADO);
        for(Pedido pdp : this.ProductosDelPedido) {
            pdp.mostrar();
        }
    }
    
    private String fechaacadena(LocalDate fecha){
        String patron = "dd/mm/yyyy";
        String fechaencadena = fecha.format(DateTimeFormatter.ofPattern(patron));
        return fechaencadena;
    
    }
    
    private String horaacadena(LocalTime hora){
        String patron = "hh:mm";
        String horaencadena = hora.format(DateTimeFormatter.ofPattern(patron));
        return horaencadena;
    
    }
    
    public Estado verEstado(){
        return estado;
    }
    
    public void asignarEstado(){
        this.estado = estado;
    }
    
    public Cliente verCliente(){
        return unCliente;
    }
    
    public void asignarCliente(Cliente unCliente){
        this.unCliente = unCliente;
    }
    
    public int verNumero() {
        return numero;
    }
    
    public String verHora(){
        return horaacadena;
    }
    
    public String verFecha(){
        return fechaacadena;
    }
    
    public void asignarFechayHora(LocalDateTime fechaYHora){
        this.fechaYHora = fechaYHora;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
