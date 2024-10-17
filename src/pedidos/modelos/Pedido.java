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
import java.util.List;
import usuarios.modelos.Cliente;

/**
 *
 * @author 
 */
public class Pedido implements Comparable<Pedido>{
    public static int contadorPedidos = 0;
    int numero=0;
    LocalDateTime fechaYhora;
    Cliente cliente;
    Estado estado;
   private List<ProductoDelPedido>listaDeProductos= new ArrayList();

    public Pedido(int numero, LocalDateTime fechaYhora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente) {
    this.numero = numero;  // Asignas el número directamente
    this.fechaYhora = fechaYhora;  // Asignas fecha y hora en un solo paso
    this.cliente = cliente;  // Asignas el cliente
    this.estado = Estado.CREADO;  // El estado inicial es CREADO
    this.listaDeProductos = productosDelPedido;  // Asignas la lista de productos
}

    
//    public Pedido(int numero, LocalDateTime fechaYhora,ArrayList<ProductoDelPedido> pdp) {
//        this.numero = numero;
//        this.fechaYhora = fechaYhora;
//        this.estado = estado.CREANDO;
//        this.listaDeProductos = pdp;
//    }
    
    public Pedido(LocalDate fecha, LocalTime hora, List<ProductoDelPedido> productosDelPedido, Cliente cliente){
        this.fechaYhora=  LocalDateTime.of(fecha, hora);
        this.cliente= cliente;
        this.listaDeProductos = productosDelPedido;
        this.estado = Estado.CREADO;
        this.numero = ++contadorPedidos;
    }
    
    public void mostrar(){
        System.out.println("Nro: " + this.numero);
        System.out.println("Fecha: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.VerFecha()) + "\t" + "Hora: " + DateTimeFormatter.ofPattern("HH:mm").format(this.VerHora()));
        System.out.println("Cliente: " + this.cliente.verNombre() + ", " + this.cliente.verApellido());
        System.out.println("Estado: " + this.estado.toString());
        System.out.println("\t Producto \t cantidad" );
        System.out.println("\t ========================");
        for(ProductoDelPedido p : listaDeProductos){
            System.out.println("\t" + p.verProducto().toString() + "\t" + p.verCantidad());
            
        }
    }

    public List<ProductoDelPedido> verListaDeProductos() {
        return listaDeProductos;
    }

    public void asignarListaDeProductos(ProductoDelPedido producto) {
        this.listaDeProductos.add(producto);
    }

    public int VerNumero() {
        return numero;
    }

    public void AsignarNumero(int numero) {
        this.numero = numero;
    }

    public Cliente VerCliente() {
        return cliente;
    }

    public void AsignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estado VerEstado() {
        return estado;
    }

    public void AsignarEstado(Estado estado) {
        this.estado = estado;
    }
    
    public LocalDate VerFecha(){
        return this.fechaYhora.toLocalDate();
    }
    
    public LocalTime VerHora(){
        return this.fechaYhora.toLocalTime();
    }   
    
    public void AsignarFecha(LocalDate fecha){
        this.fechaYhora = this.fechaYhora.withYear(fecha.getYear()).withMonth(fecha.getMonthValue()).withDayOfMonth(fecha.getDayOfMonth());
    }
    
    public void AsignarHora(LocalTime hora){
        this.fechaYhora = this.fechaYhora.withHour(hora.getHour()).withMinute(hora.getMinute());
    }
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public static int getContador() {
        return contadorPedidos;
    }

    public static void setContador(int contador) {
        Pedido.contadorPedidos = contador;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.numero;
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

    @Override
    public int compareTo(Pedido o) {
        return this.numero - o.numero;
    }
    
}

