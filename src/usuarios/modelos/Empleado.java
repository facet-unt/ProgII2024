

package usuarios.modelos;



    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 54381
 */
public class Empleado {

    String correo;
    String clave;
    String apellido;
    String nombre;
    
    

    public void mostrarEmpleado() {
        System.out.println("Cliente: " + nombre + " " + apellido + ", Correo: " + correo);
    }

}
