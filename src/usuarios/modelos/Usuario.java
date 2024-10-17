package usuarios.modelos;

import java.util.ArrayList;
import java.util.Objects;
import pedidos.modelos.Pedido;

/**
 *
 * @author rodrigoAndres
 */
public abstract class Usuario {
    
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
 public Usuario(String correo,String clave,String apellido,String nombre){
     
     this.correo = correo;
     this.clave = clave;
     this.apellido = apellido;
     this.nombre = nombre;
     
 }
 
 public void mostrar(){
    System.out.println("Correo: "+ correo + "\nClave: " + clave + "\nApellido: "+ apellido + "\nNombre: "+ nombre);
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
    

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.correo);
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

     public abstract ArrayList<Pedido> verPedidos();
    
    
    
}
    
