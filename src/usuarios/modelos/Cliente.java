
package usuarios.modelos;

public class Cliente {
    public String Nombre;
    public String Apellido;
    public String Correo;
    public String Clave;
    
    public void mostrar(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: " +Apellido);
        System.out.println("Correo: " +Correo);
        
    }
}
