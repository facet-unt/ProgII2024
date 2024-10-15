/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.Objects;

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
    
    public  String verCorreo(){
        return this.correo;
    }

    public void asignarCorreo(String correo){
        this.correo=correo;
    }

    public String verClave(){
        return this.clave;
    }

    public void asignarClave(String clave){
        this.clave=clave;
    }

    public String verApellido(){
        return this.apellido;
    }

    public void asignarApellido(String apellido){
        this.apellido=apellido;
    }

    public String verNombre(){
        return this.nombre;
    }
    
    public void asignarNombre(String nombre){
        this.nombre=nombre;
    }
    
    public Usuario(String correo, String nombre, String apellido, String clave){
        this.correo=correo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.clave=clave;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return correo == other.verCorreo();
    }
    
}
