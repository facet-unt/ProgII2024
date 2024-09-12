
package usuarios.modelos;

public class Encargado {
    
    String correo;
    String clave;
    String apellido;
    String nombre;
    
    public void mostrar(){
    
        System.out.println("Nombre:" + nombre +", apellido:" + apellido +", correo:" + correo);
    }
    
}
