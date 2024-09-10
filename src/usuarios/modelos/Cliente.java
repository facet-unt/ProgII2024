
package usuarios.modelos;

public class Cliente {
    String correo;
    String clave;
    String apellido;
    String nombre;   
    void mostrar() {
        System.out.println("Cliente: " + nombre + " " + apellido + ", Correo: " + correo);
    }
}
