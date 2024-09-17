/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Empleado {
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    public void mostrar(){
        System.out.println(correo+"\n"+apellido+"\n"+nombre);
    }
    //Métodos get/set
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
    //Constructor de la clase
    public Empleado(String correo, String clave, String apellido, String nombre ){
        this.apellido=apellido;
        this.clave=clave;
        this.correo=correo;
        this.nombre=nombre;
    }
}
