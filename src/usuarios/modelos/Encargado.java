/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Encargado {
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;

    void mostrar() {        
        System.out.println(correo);
        System.out.println(clave);
        System.out.println(apellido);
        System.out.println(nombre);
    }    
    @Override
     public String toString(){
        return "Apellido y nombre: " + apellido + nombre  + "\n" + "correo: " + correo + "\n";
    }
     
}
