/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author Mi buen PC
 */
public enum Perfil {
    
    CLIENTE("Cliente"),
    EMPLEADO("Empleado"),
    ENCARGADO("Encargado");
    
    private String valor;
    
    private Perfil(String valor){
        this.valor= valor;
    }
    
    public String toString(){
        return this.valor;
    }
    
    
}
