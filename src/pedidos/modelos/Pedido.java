/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import usuarios.modelos.Cliente;

/**
 *
 * @author Mariana
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Cliente cliente;
    private Estado estado;

    public Pedido(int numero, LocalDateTime fechaYHora,Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.estado = Estado.CREANDO;
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
    
    public void mostrar(){
        String patron = "hh:mm";
        String horaACadena = this.verHora().format(DateTimeFormatter.ofPattern(patron));
        
        System.out.println("\n\nNro: " + this.numero);
        System.out.print("Fecha: " + this.fechaACadena(this.verFecha()));
        System.out.println("\t\tHora: " + horaACadena);
        System.out.println("Cliente: " + this.cliente.verApellido() + ", " + this.cliente.verNombre());
        System.out.println("Estado: " + this.estado );
               
        }
    
    //métodos auxiliares para mostrar
    private String fechaACadena(LocalDate fecha) {
        String patron = "dd/MM/yyyy";
        String fechaEnCadena = fecha.format(DateTimeFormatter.ofPattern(patron));
        return fechaEnCadena;
    }
   
      
      
    
}
