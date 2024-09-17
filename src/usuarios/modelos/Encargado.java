package usuarios.modelos;

public class Encargado {
    
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    public void mostrar() {
   
        System.out.println("El correo del encargados es:" + correo);
        System.out.println("La clave del encargado es: " + clave);
        System.out.println("El apellido del encargado es: " + apellido);
        System.out.println("El Nombre del encargado es: " + nombre);
    }

    public Encargado(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String verCorreo() {
        return correo;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
