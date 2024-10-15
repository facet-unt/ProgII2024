
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pedidos.modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import productos.modelos.EstadoProducto;




public class Pedido {
    private int numero;
    private Cliente unCliente;
    private LocalDateTime fechaYHora;
    private EstadoProducto estado;

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }
    
    
    private ArrayList<ProductoDelPedido> productosDelPedido = new ArrayList<>();

    public Pedido(int numero, LocalDateTime fechaYHora, Cliente unCliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unCliente = unCliente;
    }
    
    public void agregarProducto(Producto unProducto, int cantidad) {
        ProductoDelPedido pdp = new ProductoDelPedido(unProducto, cantidad);
        this.productosDelPedido.add(pdp);
    }
    
    public void mostrar() {
        System.out.println("Nro: " +this.numero);
        System.out.println("fecha: " +this.fechaYHora.getDayOfMonth()+"/" +this.fechaYHora.getMonthValue()+"/"+this.fechaYHora.getYear()+"              Hora: "+this.fechaYHora.getHour()+":"+this.fechaYHora.getMinute());
        System.out.println("cliente: " +this.unCliente.getApellido()+","+this.unCliente.getNombre()); 
        System.out.println("Estado: " +this.estado);
        System.out.println("Productos       Cantidades");
        System.out.println("==========================");
        System.out.println(""+this.productosDelPedido);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.numero;
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
    

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
