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
 * @author Ahmed Chaben
 */
public class Pedido {
    
    //private static int numPedido=1;
    private int numero;
//    private LocalDate fecha=LocalDate.now();
//    private LocalTime hora=LocalTime.now();
    private LocalDateTime fechaYHora;
    private Cliente cliente;
    private Estado estado;
    private ArrayList <ProductoDelPedido> prodsPedido =new ArrayList<>();
    
    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList<ProductoDelPedido> productos, Cliente cliente){
        //this.numero=numPedido++;
        this.numero=numero;
        this.cliente=cliente;
        this.estado=estado;
        this.fechaYHora=fechaYHora;
        this.prodsPedido=productos;
    }
    
    public void verProductos(){
        for (ProductoDelPedido p : prodsPedido){
            p.verProducto().mostrar();
        }
    }
    
    public String verHora(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("HH:mm");
        return fechaYHora.format(formato);
    }
    
    public String verFecha(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
        return fechaYHora.format(formato);
    }
    
    public int verNumero(){
        return this.numero;
    }
    
    public void verCliente(){
        this.cliente.mostrar();
    }
    
    public void agregarProductos(ProductoDelPedido p){
        if (!prodsPedido.contains(p)){
            prodsPedido.add(p);
        }else{
            int aumento=p.verCantidad();
            int index = prodsPedido.indexOf(p);
            aumento += prodsPedido.get(index).verCantidad();
            p.asignarCantidad(aumento);
            prodsPedido.remove(index);
            prodsPedido.add(p);
        }
    }
    
    public void mostrar(){
        System.out.println("Nro: "+this.numero+"\n"+
                           "Fecha: "+this.verFecha()+"\t"+"Hora: "+this.verHora()+"\n"+
                           "Cliente: "+this.cliente.verApellido()+" "+this.cliente.verNombre()+"\n"+
                           "Estado: "+this.estado+"\n"+
                           "Producto\tCantidad"+"\n"+
                           "\t"+"========="+"\n");
        for(ProductoDelPedido p : prodsPedido){
            System.out.println(p.verProducto().verDescripcion()+"\t"+p.verCantidad());
        }
    }
    
    @Override
    
    public boolean equals(Object objeto){
        if (this == objeto){
            return true;
        }
        if (objeto == null || getClass() != objeto.getClass()){
            return false;
        }
        Pedido p  = (Pedido) objeto;
        return numero == p.verNumero();
    }
    
    
}
