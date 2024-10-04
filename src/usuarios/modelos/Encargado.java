    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Encargado extends Usuarios {

    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    @Override
    public void mostrar(){
    System.out.println("Correo: "+ this.verCorreo() + "\nClave: "+ this.verClave() + "\nApellido: "+ this.verApellido() + "\nNombre: "+ this.verApellido());
 
    }
}
