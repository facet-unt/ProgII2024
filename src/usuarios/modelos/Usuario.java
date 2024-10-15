/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

/**
 *
 * @author Gisela
 */
public abstract class Usuario {
    
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    public Usuario(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public Usuario(String c, String a, String n) {
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
    
    public void mostrar(){
    System.out.println("Correo: "+ correo);
    System.out.println("Clave: "+ clave); 
    System.out.println("Cliente: "+ apellido +" "+nombre);
    }
}
