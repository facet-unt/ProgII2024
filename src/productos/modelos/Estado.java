/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author Mi buen PC
 */
public enum Estado {
    
    DISPONIBLE("Disponible"),
    NODISPONIBLE("No Disponible");
    
    private String valor;
    
    private Estado(String valor){
    this.valor=valor;
    }
    
    public String toString(){
    return this.valor;
    }
    
}
