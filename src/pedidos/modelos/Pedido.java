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
    private Cliente unCliente;
    private LocalDateTime fechaYHora;
    private String fechaacadena;
    private String horaacadena;
    private Estado estado;
    
    
    
    private ArrayList<ProductoDelPedido> ProductosDelPedido = new ArrayList<>();

    public Pedido(int numero, LocalDateTime fechaYHora,Cliente unCliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unCliente = unCliente;
        fechaacadena = this.fechaacadena();
        horaacadena = this.horaacadena();
         
    }
    
    public void agregarProducto(Producto unProducto, int cantidad) {
        ProductoDelPedido pdp = new ProductoDelPedido(cantidad, unProducto);
        this.ProductosDelPedido.add(pdp);
    }
    
    public void mostrar() {
        System.out.println("Nro: " + this.numero);
        System.out.println("Fecha: " + this.fechaacadena + "   Hora: " + this.horaacadena);
        System.out.println("Cliente: " + unCliente.verApellido() +" " + unCliente.verNombre());
        System.out.println("Estado: " + Estado.CREADO);
        
        System.out.println("Producto        Cantidad");
        System.out.println("=========================");
           for (ProductoDelPedido pdp : ProductosDelPedido) {
        System.out.println(pdp.verProducto().toString() + "        " + pdp.verCantidad());
    }
    }

    
    
    private String fechaacadena(){
        String patron = "dd/mm/yyyy";
        String fechaencadena = fechaYHora.format(DateTimeFormatter.ofPattern(patron));
        return fechaencadena;
    
    }
    
    private String horaacadena(){
        String patron = "hh:mm";
        String horaencadena = fechaYHora.format(DateTimeFormatter.ofPattern(patron));
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
    
    public void asignarNumero(int numero) {
        this.numero = numero;
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
    

    
    
    
    
}
