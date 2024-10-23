/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fabri
 */
public class GestorUsuarios {
        
    ArrayList<Usuario> listausuarios = new ArrayList();
    
    private static GestorUsuarios gestor;
    
    public static final String EXITO = "Usuario creado/modificado con éxito";
    public static final String ERROR_CORREO = "El correo del usuario es incorrecto";
    public static final String ERROR_APELLIDO = "El apellido del usuario es incorrecto";
    public static final String ERROR_NOMBRE = "El nombre del usuario es incorrecto";
    public static final String ERROR_CLAVES = "Las claves especificadas no coinciden o son incorrectas";
    public static final String ERROR_PERFIL = "El perfil del usuario es incorrecto";
    public static final String USUARIOS_DUPLICADOS = "Ya existe un usuario con ese correo";
    public static final String VALIDACION_EXITO = "Los datos del usuario son correctos";
    
    public static GestorUsuarios crear(){  
        if(gestor == null){
            gestor = new GestorUsuarios();
        }
        return gestor;
    }
    
    private String ControlUsuarios(Usuario usuario){
        if(usuario.verCorreo()== null || !usuario.verCorreo().contains("@")){
        return ERROR_CORREO;
        }else if(usuario.verApellido().isEmpty() ||usuario.verApellido()== null){
         return ERROR_APELLIDO;
        }else if(usuario.verNombre().isEmpty() ||usuario.verNombre()== null){
         return ERROR_NOMBRE;
        }else if(usuario.verClave().isEmpty() ||usuario.verClave()== null){
         return ERROR_CLAVES;
        }else if(usuario.verClaverepetida().isEmpty() || usuario.verClaverepetida()== null || usuario.verClaverepetida().equals(usuario.verClave())){
         return ERROR_CLAVES;
        }
        
        return VALIDACION_EXITO;    
    }
    
    
    public String crearUsuario(String correo, String clave, String apellido, String nombre, String claverepetida, Perfil perfil){
        Usuario usuario = null;
        switch (perfil) {
            case CLIENTE:
                usuario= new Cliente(correo,  clave,  apellido,  nombre,  claverepetida,  perfil);
                break;
            case EMPLEADO:
                usuario= new Empleado(correo,  clave,  apellido,  nombre,  claverepetida,  perfil);
                break;
            case ENCARGADO:
                usuario= new Encargado(correo,  clave,  apellido,  nombre,  claverepetida,  perfil);
                break;
            default:
                break;
            }
        ControlUsuarios(usuario);
          
        if(listausuarios.contains(usuario)){
            return USUARIOS_DUPLICADOS;
        }else{
            listausuarios.add(usuario);
        }
        return EXITO;    
    }
    
    
       public List<Usuario> verUsuarios(){
           Collections.sort(listausuarios);
         return listausuarios;
       }
    
       
       public ArrayList<Usuario> buscarUsuarios(String apellido){
           ArrayList<Usuario> usuariosPorApellido = new ArrayList<>();
        for(Usuario usuario : listausuarios){
            if(usuario.verApellido().contains(apellido)){
                usuariosPorApellido.add(usuario);
            }
        }
        Collections.sort(usuariosPorApellido);
        return usuariosPorApellido;
      }
    
       
       public boolean existeEsteUsuario(Usuario usuario){
       if(listausuarios.contains(usuario))
           return true;
       return false;
      }
    
       
    public Usuario obtenerUsuario(String correo){
        for(Usuario usuario : listausuarios){
          if(usuario.verCorreo().equals(correo))
            return usuario;
        }
        return null;
    }

    
//    public String borrarUsuario(Usuario usuario) {
//        for (Usuario u : listausuarios){
//            if (u.equals(usuario)){
//                if(u.verPedidos().isEmpty()){
//                    ListaUsuarios.remove(u);
//                }
//            } 
//            return EXITO;
//        }
//        
//        return USUARIO_INEXISTENTE;
//    }
    
}
