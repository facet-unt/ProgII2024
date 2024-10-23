/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 *
 * @author Mi buen PC
 */
public class GestorUsuarios {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    private static GestorUsuarios gestor;
    public static final String EXITO = "Usuario creado/modificado con éxito";
    public static final String ERROR_CORREO = "El correo del usuario es incorrecto";
    public static final String ERROR_APELLIDO = "El apellido del usuario es incorrecto";
    public static final String ERROR_NOMBRE = "El nombre del usuario es incorrecto";
    public static final String ERROR_CLAVES = "Las claves especificadas no coinciden o son incorrectas";
    public static final String ERROR_PERFIL = "El perfil del usuario es incorrecto";
    public static final String USUARIOS_DUPLICADOS = "Ya existe un usuario con ese correo";
    public static final String VALIDACION_EXITO = "Los datos del usuario son correctos";
    

    
    
    
    private GestorUsuarios() {
    }
    
    
    public static GestorUsuarios instanciar(){
        if(gestor==null){
            gestor = new GestorUsuarios();
        }
        return gestor;
    }
    
    private boolean validador(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida){
        if(correo == null || !correo.contains("@")){
            return false;
        }
        if(apellido == null || apellido.isBlank()){
            return false;
        }
        if(nombre == null || nombre.isBlank()){
            return false;
        }
        if(clave == null || clave.isBlank()){
            return false;
        }
        if(claveRepetida == null || claveRepetida.isBlank() || !clave.equals(claveRepetida)){
            return false;
        }
        
        return true;
    }
    
    
    
}
