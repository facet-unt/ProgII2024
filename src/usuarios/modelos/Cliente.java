
package usuarios.modelos;

public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Clave;
    
    public Cliente(String nom, String ape, String cor, String cla){
        Nombre=nom;
        Apellido=ape;
        Correo=cor;
        Clave=cla;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: " +Apellido);
        System.out.println("Correo: " +Correo);
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
}
