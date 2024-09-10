/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author joaquincoro
 */
public class Cliente {
    String correo = new String();
    String clave = new String();
    String apellido = new String();
    String nombre = new String();
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Clave de acceso: " + clave);
    }
}
