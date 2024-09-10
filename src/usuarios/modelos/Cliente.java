
package usuarios.modelos;

public class Cliente {
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;
    public void mostrar(){
        System.out.println(correo+"\n"+apellido+"\n"+nombre);
    }
}
