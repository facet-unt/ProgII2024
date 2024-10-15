/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;



public enum EstadoPedido {
    creado("Creado"),
    solicitado("Solicitado"),
    procesando("Procesando"),
    entregado("Entregado");
    
    private String clasif;
    
    //constructor
    private EstadoPedido(String clasif){
        this.clasif=clasif;
    }
    
    public String toString(){
        return this.clasif;
    }
}
