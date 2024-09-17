
package usuarios.modelos;

public class Cliente {
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;
    
    public void mostrar(){
        System.out.println("correo: "+correo);
        System.out.println("clave: "+clave);
        System.out.println("apellido: "+apellido);
        System.out.println("nombre: "+nombre);
   }
}
