/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public abstract class Usuario {
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    public void mostrar(){
         System.out.println(correo+"\n"+apellido+"\n"+nombre);
    }
    
    public abstract String verCorreo();

    public abstract void asignarCorreo(String correo);

    public abstract String verClave();

    public abstract void asignarClave(String clave);

    public abstract String verApellido();

    public abstract void asignarApellido(String apellido);

    public abstract String verNombre();
    
    public abstract void asignarNombre(String nombre);
    
    public Usuario(String correo, String nombre, String apellido, String clave){
        this.correo=correo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.clave=clave;
    }
    
}
