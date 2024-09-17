
package usuarios.modelos;

public class Cliente {
    
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;
    
    public void mostrar() {
        
        System.out.println("El correo del cliente es:" + correo);
        System.out.println("La clave del cliente es: " + clave);
        System.out.println("El apellido del cliente es: " + apellido);
        System.out.println("El Nombre del cliente es: " + nombre);

    }
}
