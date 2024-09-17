
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
    
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    public void mostrar() {
        System.out.println("Datos del cliente");
        System.out.println("Correo: " + correo);
        System.out.println("Clave: " + clave);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
    }

    public Cliente(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }
        
    public Cliente(String c, String a, String n) {
        this(c, "123466", a, n);   
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
