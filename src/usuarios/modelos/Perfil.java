/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public enum Perfil {
    CLIENTE("Ciente"),
    EMPLEADO("Empleado"),
    ENCARGADO("Encargado");
    
    private String perfil;
    
    private Perfil(String perfil){
        this.perfil=perfil;
    }
    
    @Override
    public String toString(){
        return this.perfil;
    }
}
