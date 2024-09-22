package usuarios.modelos;

public class Empleado {
    private String Correo;
    private String Clave;
    private String Apellido;
    private String Nombre="Leonel";
        
    public void mostrar(){
       System.out.println(Nombre);
    }
    @Override
    public String toString() {
        return "Empleado " + "Nombre: " + Nombre;
    }
    
    public Empleado(String Correo, String Clave, String Apellido, String Nombre) {
        this.Correo = Correo;
        this.Clave = Clave;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }
        public String verCorreo() {
        return Correo;
    }

    public void asignarCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String verClave() {
        return Clave;
    }

    public void asignarClave(String Clave) {
        this.Clave = Clave;
    }

    public String verApellido() {
        return Apellido;
    }

    public void asignarApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String verNombre() {
        return Nombre;
    }

    public void asignarNombre(String nombre) {
        this.Nombre = nombre;
    }






}

