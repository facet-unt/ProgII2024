
package usuarios.modelos;

public class Cliente {
    String correo;
    String clave;
    String apellido;
    String nombre;

    void mostrar() {        
        System.out.println(correo);
        System.out.println(clave);
        System.out.println(apellido);
        System.out.println(nombre);        
    }
}
