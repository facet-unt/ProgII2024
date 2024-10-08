/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import usuarios.modelos.Cliente;

/**
 *
 * @author Ahmed Chaben
 */
public class Pedido {
    
    private static int numPedido=1;
    private int numero;
    private LocalDate fecha=LocalDate.now();
    private LocalTime hora=LocalTime.now();
    private Cliente cliente;
    private Estado estado;
    
    public Pedido(Cliente cliente, Estado estado){
        this.numero=numPedido++;
        this.cliente=cliente;
        this.estado=estado;
    }
    
    public String verHora(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("HH:mm");
        return hora.format(formato);
    }
    
    public void verFecha(){
        System.out.println(this.fecha);
    }
    
    public void verNumero(){
        System.out.println(this.numero);
    }
    
    public void verCliente(){
        this.cliente.mostrar();
    }
    
    public void mostrar(){
        System.out.println("Nro: "+this.numero+"\n"+
                           "Fecha: "+this.fecha+"\t"+"Hora: "+this.verHora()+"\n"+
                           "Cliente: "+this.cliente.verApellido()+" "+this.cliente.verNombre()+"\n"+
                           "Estado: "+this.estado);
    }
    
    
}
