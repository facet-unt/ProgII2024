package usuarios.modelos;

public class Encargado {
    
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;
    
    public void mostrar() {
        System.out.println("Datos del encargado");
        System.out.println("Correo: " + correo);
        System.out.println("Clave: " + clave);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
    }

    public Encargado(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
}
