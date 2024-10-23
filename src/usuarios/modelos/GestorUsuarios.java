/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class GestorUsuarios {

    private static GestorUsuarios gestor;
    private ArrayList<Usuario> usuarios;
    public static final String EXITO = "Usuario creado/modificado con éxito";
    public static final String ERROR_CORREO = "El correo del usuario es incorrecto";
    public static final String ERROR_APELLIDO = "El apellido del usuario es incorrecto";
    public static final String ERROR_NOMBRE = "El nombre del usuario es incorrecto";
    public static final String ERROR_CLAVES = "Las claves especificadas no coinciden o son incorrectas";
    public static final String ERROR_PERFIL = "El perfil del usuario es incorrecto";
    public static final String USUARIOS_DUPLICADOS = "Ya existe un usuario con ese correo";
    public static final String VALIDACION_EXITO = "Los datos del usuario son correctos";
    public static final String USUARIO_INEXISTENTE = "No existe el usuario especificado";

    private GestorUsuarios() {
        usuarios = new ArrayList<>();  // Initialize the user list
    }

    public static GestorUsuarios crear() {
        if (gestor == null) {
            gestor = new GestorUsuarios();
        }
        return gestor;
    }

    public String crearUsuario(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida) {
        String usuarioValido = this.ValidarUsuarios(correo, apellido, nombre, perfil, clave, claveRepetida);
        if (!usuarioValido.equals(VALIDACION_EXITO)) {
            return usuarioValido;
        }
        if (existeEsteUsuario(correo)) {
            return USUARIOS_DUPLICADOS;
        }
        Usuario nuevoUsuario = new UsuariosConcretos(correo, clave, apellido, nombre, perfil);
        usuarios.add(nuevoUsuario);
        return EXITO;

    }
public String modificarUsuario(Usuario UsuarioAModificar,String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida) {
       String usuarioValido = this.ValidarUsuarios(correo, apellido, nombre, perfil, clave, claveRepetida);
        if (!usuarioValido.equals(VALIDACION_EXITO)) {
            return usuarioValido;
       
       } else {
            if (this.usuarios.contains(UsuarioAModificar)) {
                UsuarioAModificar.asignarApellido(apellido);
                UsuarioAModificar.asignarClave(clave);
                UsuarioAModificar.asignarClave(claveRepetida);
                UsuarioAModificar.asignarNombre(nombre);
                UsuarioAModificar.asignarCorreo(correo);
                return EXITO;

            } else {
                return USUARIO_INEXISTENTE;
            }
        }
    }
    
    public String ValidarUsuarios(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida) {
        if (correo == null || !correo.contains("@")) {
            return ERROR_CORREO;
        }
        if (apellido == null || apellido.isEmpty()) {
            return ERROR_APELLIDO;
        }
        if (nombre == null || nombre.isEmpty()) {
            return ERROR_NOMBRE;
        }
        if (clave == null || clave.isEmpty() || !clave.equals(claveRepetida)) {
            return ERROR_CLAVES;
        }

        return VALIDACION_EXITO;
    }

    public ArrayList<Usuario> verUsuarios() {
        return this.usuarios; // Retorna una copia de la lista de usuarios
    }

    public ArrayList<Usuario> buscarUsuarios(String apellido) {
        ArrayList<Usuario> usuariosEncontrados = new ArrayList<>();
        for (Usuario u : usuarios) {
            if (u.verApellido().toLowerCase().contains(apellido.toLowerCase())) {
                usuariosEncontrados.add(u);
            }
        }
        return usuariosEncontrados;
    }

    public boolean existeEsteUsuario(String correo) {
        for (Usuario u : usuarios) {
            if (u.verCorreo().equals(correo)) {
                return true;
            }
        }
        return false;
    }

    public Usuario obtenerUsuario(String correo) {
        for (Usuario u : usuarios) {
            if (u.verCorreo().equals(correo)) {
                return u; // Retorna el usuario encontrado
            }
        }
        return null; // Retorna null si no se encuentra
    }
}
