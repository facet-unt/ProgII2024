/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author Mi buen PC
 */
public enum Estado {
    
    CREADO("Creado"),
    SOLICITADO("Solicitado"),
    PROCESANDO("Procesado"),
    ENTREGADO("Entregado");
    
    private String valor;
    
    private Estado(String valor){
    this.valor=valor;
    }
    
    public String toString(){
    return this.valor;
    }
    
}
