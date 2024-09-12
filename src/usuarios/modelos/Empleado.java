
package usuarios.modelos;


public class Empleado {
    
    String correo;
    String clave;
    String apellido;
    String nombre;
    
    public void mostrar(){
    
        System.out.println("Nombre:" + nombre +", apellido:" + apellido +", correo:" + correo);
    }
    
}
