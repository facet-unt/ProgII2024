
package usuarios.modelos;

public class Cliente {
    public String Correo;
    public String Clave;
    public String Apellido;
    public String Nombre="gaston";
    
    void mostrar(){
        System.out.println(Nombre);
    }
    
    @Override
    public String toString() {
        return "Cliente {" + "Nombre=" + Nombre + '}';
    }
}    
