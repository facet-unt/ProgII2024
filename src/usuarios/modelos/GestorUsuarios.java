/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import static usuarios.modelos.Perfil.CLIENTE;
import static usuarios.modelos.Perfil.EMPLEADO;
import static usuarios.modelos.Perfil.ENCARGADO;

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
    
    private String validador(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida){
        if(correo == null || !correo.contains("@")){
            return ERROR_CORREO;
        }
        if(apellido == null || apellido.isBlank()){
            return ERROR_APELLIDO;
        }
        if(nombre == null || nombre.isBlank()){
            return ERROR_NOMBRE;
        }
        if(clave == null || clave.isBlank()){
            return ERROR_CLAVES;
        }
        if(claveRepetida == null || claveRepetida.isBlank() || !clave.equals(claveRepetida)){
            return ERROR_CLAVES;
        }
        
        if(perfil == null){
            return ERROR_PERFIL;
        }
        
        return VALIDACION_EXITO;
    }
   
    public String crearUsuario(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida){
        
        String validacion = validador(correo, apellido, nombre, perfil, clave, claveRepetida);
        
        if(!validacion.equals(VALIDACION_EXITO)){
            return validacion;
        }
        
        
        
        if(perfil.equals(CLIENTE)){
            Usuario cliente = new Cliente(correo, clave, apellido, nombre, perfil);
            if(usuarios.contains(cliente)){
                return USUARIOS_DUPLICADOS;
            }
            
            usuarios.add(cliente);
            
        }
        
        if(perfil.equals(EMPLEADO)){
            Usuario empleado = new Empleado(correo, clave, apellido, nombre, perfil);
            if(usuarios.contains(empleado)){
                return USUARIOS_DUPLICADOS;
            }
            
            usuarios.add(empleado);
        }
        
        if(perfil.equals(ENCARGADO)){
            Usuario encargado = new Encargado(correo, clave, apellido, nombre, perfil);
            if(usuarios.contains(encargado)){
                return USUARIOS_DUPLICADOS;
            }
            
            usuarios.add(encargado);
            
        }
        
        return EXITO;
            
        
        
        
    }
    
    
    public ArrayList<Usuario> verUsuarios(){
        return usuarios;
    }
    
    
}
