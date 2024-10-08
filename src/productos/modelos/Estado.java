/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.modelos;
/**
 *
 * @author Gisela
 */
public enum Estado {
    DISPONIBLE("Disponible"),
    NODISPONIBLE("No Disponible");
   private String valor;
   
   private Estado(String valor){
       this.valor = valor;
   }
   
    @Override
   public String toString(){
       return this.valor;
   }
}
