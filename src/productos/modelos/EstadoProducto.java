/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author tomas
 */
public enum EstadoProducto {
    DISPONIBLE("DISPONIBLE"),NODISPONIBLE("NO DISPONIBLE");
    
    private String clasif;
    
    private EstadoProducto(String clasif){
        this.clasif=clasif;
    }
    public String toString(){
        return this.clasif;
    }
}
