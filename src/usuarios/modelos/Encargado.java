
package usuarios.modelos;

public class Encargado {
    public String Correo;
    public String Clave;
    public String Apellido="Palomino";
    public String Nombre;
        
    void mostrar(){
        System.out.println(Apellido);
    }
    @Override
    public String toString() {
        return "Encargado {" + "Apellido=" + Apellido + '}';
    }
}
