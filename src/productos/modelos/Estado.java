/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author Ahmed Chaben
 */
public enum Estado {
    DISPONIBLE("Disponible"),
    NO_DISPONIBLE("No Disponible");
    
    private String estado;
    
    private Estado(String estado){
        this.estado=estado;
    }
    
    @Override
    public String toString(){
        return this.estado;
    }
}
