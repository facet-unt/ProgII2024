package usuarios.modelos;

public class Encargado {
   
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;
    
    public void mostrar() {
        
        System.out.println("El correo del encargados es:" + correo);
        System.out.println("La clave del encargado es: " + clave);
        System.out.println("El apellido del encargado es: " + apellido);
        System.out.println("El Nombre del encargado es: " + nombre);

    }
}
