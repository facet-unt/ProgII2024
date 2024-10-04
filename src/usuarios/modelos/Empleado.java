/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Empleado extends Usuarios {
    
  private int antiguedad;
   

    public Empleado(int antiguedad,String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
        this.antiguedad=antiguedad;
    }
 
  @Override
    public void mostrar(){
    System.out.println("Correo: "+ this.verCorreo() + "\nClave: "+ this.verClave() + "\nApellido: "+ this.verApellido() + "\nNombre: "+ this.verApellido());
    System.out.println("Antiguedad: "+ antiguedad);
    }
}
