
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Empleado extends Usuario {
   

    public Empleado(String correo, String clave, String apellido, String nombre) {
        super(correo,clave,apellido,nombre);
    }
    
     public void mostrar(){
        super.mostrar();
    }
}
