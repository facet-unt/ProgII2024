/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author joaquincoro
 */
public enum Estado{
    DISPONIBLE("Disponibe"),
    NODISPONIBLE("No Disponible");
    
    private String estado;
    private Estado(String estado){
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return this.estado;
    }
}

