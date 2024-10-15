/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author joaquincoro
 */
public enum Estado{
    CREADO("Creado"),
    SOLICITADO("Solicitado"),
    PROCESANDO("Procesando"),
    ENTREGADO("Entregado");
    
    private String estado;
    
    Estado(String estado){
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return this.estado;
    }
    
}
