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
public enum Categoria {
    ENTRADA("Entrada"),
    PLATOPRINCIPAL("Plato Principal"),
    POSTRE("Postre");
    
   private String valor;
   
   private Categoria(String valor){
       this.valor = valor;
   }
   
   @Override
   public String toString(){
       return valor;
   }
}
