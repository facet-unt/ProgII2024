
package usuarios.modelos;

public class Cliente {
    
    String correo;
    String clave;
    String apellido;
    String nombre;
    
    public void mostrar() {
        System.out.println("Correo: " + correo);
        System.out.println("Clave: " + clave);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
    }
}
