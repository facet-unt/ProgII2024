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

    public Pedido(int numero, LocalDateTime fechaYHora, Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = cliente;
        Fecha = this.StringFecha();
        Hora = this.StringHora();
    }
    
    public void mostrar() {
        System.out.println("Nro: " + numero + "\nFecha: " + Fecha + "\tHora: " + Hora + "\nCliente: " + cliente + "\nEstado: " + estado);
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
    
    public int getNumero() {
        return numero;
    }

//    public void setNumero(int numero) {
//        this.numero = numero;
//    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

//    public void setFechaYHora(LocalDateTime fechaYHora) {
//        this.fechaYHora = fechaYHora;
//    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }

    public String getFecha() {
        return Fecha;
    }

    public String getHora() {
        return Hora;
    }
}
