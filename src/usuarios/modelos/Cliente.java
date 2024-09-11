
package usuarios.modelos;

public class Cliente {
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;

    void mostrar() {        
        System.out.println(correo);
        System.out.println(clave);
        System.out.println(apellido);
        System.out.println(nombre);        
    }
    @Override
    public String toString(){
        return "Apellido y nombre: " + apellido + nombre  + "\n" + "correo: " + correo + "\n";
    }
    
}
