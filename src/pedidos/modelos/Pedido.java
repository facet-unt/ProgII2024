/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

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
    private Cliente cliente;
    private LocalDateTime fechaYHora;
    private Estado estado;
    private ArrayList<ProductoDelPedido> pdps;

    public Pedido(int numero, LocalDateTime fechaYHora,ArrayList<ProductoDelPedido> pdps ,Cliente unCliente ) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.cliente = unCliente;
        this.estado = estado.CREADO;
        this.pdps = pdps;
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

    public void mostrar() {
        System.out.println(
                "Nro: " + this.numero + "\n"
                + "Fecha: " + this.verFecha() + "            " + "Hora:" + this.verHora() + "\n"
                + "Cliente: " + this.cliente.verApellido()+ ", " + this.cliente.verNombre()+ "\n"
                + "Estado: " + this.estado.toString() + "\n"
                + "\t"+"Producto"+"\t"+"Cantidad"+"\n"
                +"\t"+"========================");
                for (ProductoDelPedido pdp : pdps){
                System.out.println("\t" + pdp.verProducto().verDescripcion()+ "\t  " +pdp.verCantidad());
        }
    }

    public ArrayList<ProductoDelPedido> verProductosDelPedido() {
        return pdps;
    }

    public void agregarProductoDelPedido(ProductoDelPedido pdp) {
        if (!this.pdps.isEmpty()) {
            if (!this.pdps.contains(pdp)) {
                this.pdps.add(pdp);
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }

}
