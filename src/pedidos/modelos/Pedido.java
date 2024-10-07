/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private String fechaencadena;
    
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
        System.out.println(this.numero);
        for(Pedido pdp : this.ProductosDelPedido) {
            pdp.mostrar();
        }
    }
    
    private String fechaacadena(LocalDate fecha){
        String patron = "dd/mm/yyyy";
        String fechaencadena = fecha.format(DateTimeFormatter.ofPattern(patron));
        return fechaencadena;
    
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
