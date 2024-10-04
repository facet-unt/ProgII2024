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
    private LocalDateTime fechaYHora;
    private Estado estado;

    public Pedido(int numero, LocalDateTime fechaYHora, Cliente unCliente, Estado unEstado) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = unCliente;
        this.estado = unEstado;
    }

    

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public Cliente verUnCliente() {
        return cliente;
    }

    public void asignarUnCliente(Cliente unCliente) {
        this.cliente = unCliente;
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

    public String verFecha() {
        String patron = "dd/MM/yyyy";
        String fechaEncadena = fechaYHora.format(DateTimeFormatter.ofPattern(patron));
        return fechaEncadena;
    }

    public String verHora() {
        String hora = fechaYHora.getHour() + ":" + fechaYHora.getMinute();
        return hora;
    }
    public void mostrar(){
        System.out.println(
                "Nro: "+this.numero+"\n"
                +"Fecha: "+this.verFecha()+"            "+"Hora:"+this.verHora()+"\n"
                +"Cliente: "+this.cliente.toString()+"\n"
                +"Estado: "+this.estado.toString()+"\n");
    //la consigna dice que tiene que ser apellido, nombre. se podria separar el String nombre cuando aparece un espacio, pero hay que hacer trim al crear clientes, y no se que hacer con multiples nombres
    }
}
