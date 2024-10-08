/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos.modelos;

/**
 *
 * @author Gisela
 */
public enum Estado {
    CREADO("Creado"),
    SOLICITADO("Solicitado"),
    PROCESANDO("Procesando"),
    ENTREGANDO("Entregado");
    
   private String valor;
   
   private Estado(String valor){
       this.valor = valor;
   }
   
   public String toString(){
       return this.valor;
   }
}
