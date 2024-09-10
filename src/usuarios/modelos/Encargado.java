/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

/**
 *
 * @author 54381
 */
public class Encargado {
    String correo;
    String clave;
    String apellido;
    String nombre;
    
     void mostrar() {
        System.out.println("Cliente: " + nombre + " " + apellido + ", Correo: " + correo);
    }
    
}
