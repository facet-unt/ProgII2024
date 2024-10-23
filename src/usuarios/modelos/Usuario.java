
package usuarios.modelos;

import java.util.ArrayList;
import java.util.Objects;
import pedidos.modelos.Pedido;

public abstract class Usuario {
    
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    private Perfil perfil;

    public Usuario(String correo, String clave, String apellido, String nombre, Perfil perfil) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
        this.perfil = perfil;
    }
    
    public abstract ArrayList<Pedido> verPedidos();
    

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

    public Perfil verPerfil() {
        return perfil;
    }

    public void asignarPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    
    
    public void mostrar(){
    System.out.println("Correo: "+ correo + "\nClave: "+ clave + "\nApellido: "+ apellido + "\nNombre: "+ nombre);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.correo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.correo, other.correo);
    }
    
    
    
    
    
}
