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
    private Estado estado;
    
    
    public Pedido(int numero, LocalDateTime fechaYHora, Cliente unCliente, Estado unEstado) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unCliente = unCliente;
        this.estado=  unEstado;
    }
    
   
    
    
    public void mostrar() {
        System.out.println("Numero: " + this.numero);
        unCliente.mostrar();
        System.out.println(fechaYHora.toString());
        System.out.println(estado.toString());
        
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public Cliente verUnCliente() {
        return unCliente;
    }

    public void asignarUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public void asignarFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
   
    private String fechaAcadena(LocalDateTime fecha){
        String patron = "dd/MM/yyyy";
        String fechaEncadena = fecha.format(DateTimeFormatter.ofPattern(patron));
        return fechaEncadena;
    }
}