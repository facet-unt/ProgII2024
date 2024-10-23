/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.GestorProductos;
import productos.modelos.Producto;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.Perfil;
import usuarios.modelos.Usuario;

/**
 *
 * @author Mariana
 */
public class ControladorPrincipalTP5 {
    public static void main(String[] args) {
//        GestorProductos gp = GestorProductos.crear();
        GestorUsuarios gu=GestorUsuarios.crear();
        
//        System.out.println("#####PRODUCTOS#####");
//        /*CREAR PRODUCTO*/
//        System.out.println(gp.crearProducto(1, "Producto1", 1.0f, Categoria.ENTRADA, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(2, "Producto2", 2.0f, Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(3, "Plato3", 3.0f, Categoria.POSTRE, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(3, "Producto4", 4.0f, Categoria.POSTRE, Estado.DISPONIBLE));
//        //producto repetido, mismo codigo
//        System.out.println(gp.crearProducto(0, "Producto4", 4.0f, Categoria.POSTRE, Estado.DISPONIBLE));
//        //código inválido vale 0
//        System.out.println(gp.crearProducto(4, null, 4.0f, Categoria.POSTRE, Estado.DISPONIBLE));
//        //sin descripción -- nula
//        System.out.println(gp.crearProducto(4, "", 4.0f, Categoria.POSTRE, Estado.DISPONIBLE));
//        //descripción inválida  -- cadena vacia
//        System.out.println(gp.crearProducto(4, "Producto4", 0.0f, Categoria.POSTRE, Estado.DISPONIBLE));
//        //precio inválido  -- precio en 0
//        System.out.println(gp.crearProducto(4, "Producto4", 4.0f, null, Estado.DISPONIBLE));
//        //sin categoría 
//        System.out.println(gp.crearProducto(4, "Producto4", 4.0f, Categoria.POSTRE, null));
//        //sin estado
//
//        /*RECUPERAR LOS PRODUCTOS CON EL METODO MENU*/
//        System.out.println("######## PRODUCTOS CON MENU ########");
//        System.out.println("Productos");
//        System.out.println("=========");
//        for(Producto p : gp.menu()) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//        
//        System.out.println("######## PRODUCTOS POR CODIGO ########");
//        /*OBTENER UN PRODUCTO MEDIANTE EL CODIGO*/
//        Producto unProducto1 = gp.obtenerProducto(1);
//        Producto unProducto2 = gp.obtenerProducto(2);
//        if (unProducto1 != null) {
//        System.out.println("Detalles de Producto 1: ");
//        unProducto1.mostrar();
//    } else {
//        System.out.println("Producto con codigo 1 no encontrado.");
//    }
//
//    if (unProducto2 != null) {
//        System.out.println("Detalles de Producto 2: ");
//        unProducto2.mostrar();
//    } else {
//        System.out.println("Producto con codigo no encontrado.");
//    }
//
//        
//        System.out.println("######## PRODUCTOS DE UNA CATEGORIA ########");
//        /*SUBCONJUNTO DE PRODUCTOS DE UNA CATEGORIA*/
//        ArrayList<Producto> productosBuscados = gp.verProductosPorCategoria(Categoria.POSTRE);
//        System.out.println("Productos filtrados por categoría");
//        System.out.println("===================");
//        for(Producto p : productosBuscados) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//
//        System.out.println("######## PRODUCTOS POR DESCRIPCION ########");
//        /*BUSCAR PRODUCTO POR DESCRIPCION*/
//        productosBuscados = gp.buscarProductos("Prod");
//        System.out.println("Productos buscados por descripcion");
//        System.out.println("==================");
//        for(Producto p : productosBuscados) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//      
//        System.out.println(gp.modificarProducto(unProducto1, 100, "Producto11", 10.0f, Categoria.PLATO_PRINCIPAL, Estado.NO_DISPONIBLE));
//        //se le cambia la descripción, precio, categoría y estado
//        //el código, por más que se lo pasa, no se modifica
//        productosBuscados = gp.buscarProductos("Producto11");
//        System.out.println("Productos buscados");
//        System.out.println("==================");
//        for(Producto p : productosBuscados) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//        
//        System.out.println(gp.modificarProducto(unProducto1, 100, "", 10.0f, Categoria.PLATO_PRINCIPAL, Estado.NO_DISPONIBLE));
    
       System.out.println("#####USUARIOS#####");
        /*CREAR USUARIO*/
        System.out.println(gu.crearUsuario("usuario1@gmail.com", "ApellidoUsuario1", "NombreUsuario1", Perfil.CLIENTE, "ClaveUsuario1","ClaveUsuario1"));
        System.out.println(gu.crearUsuario("usuario2@gmail.com", "ApellidoUsuario2", "NombreUsuario2", Perfil.ENCARGADO, "ClaveUsuario2","ClaveUsuario2"));
        System.out.println(gu.crearUsuario("usuario3@gmail.com", "ApellidoCliente3", "NombreUsuario3", Perfil.EMPLEADO, "ClaveUsuario3","ClaveUsuario3"));
        System.out.println(gu.crearUsuario("usuario1@gmail.com", "ApellidoUsuario4", "NombreUsuario4", Perfil.CLIENTE, "ClaveUsuario4","ClaveUsuario4"));
        //producto repetido, mismo codigo
        System.out.println(gu.crearUsuario("usuario5@gmail.com", "ApellidoUsuario1", "", Perfil.CLIENTE, "ClaveUsuario1","ClaveUsuario1"));
        //sin nombre -- nulo
        System.out.println(gu.crearUsuario("usuario6@gmail.com", "", "NombreUsuario1", Perfil.CLIENTE, "ClaveUsuario1","ClaveUsuario1"));
        //sin apellido -- nula
        System.out.println(gu.crearUsuario("usuario7@gmail.com", "ApellidoUsuario1", "NombreUsuario1", Perfil.CLIENTE, "ClaveUsuario1","ClaveUsuario2"));
        //clave inválida  -- claves distintas
        System.out.println(gu.crearUsuario("usuario8gmail.com", "ApellidoUsuario1", "NombreUsuario1", Perfil.CLIENTE, "ClaveUsuario1","ClaveUsuario1"));
        //correo inválido  -- correo sin "@"
        System.out.println(gu.crearUsuario("usuario1@gmail.com", "ApellidoUsuario1", "NombreUsuario1", Perfil.CLIENTE, "","ClaveUsuario1"));
        //sin clave - vacia
       System.out.println(gu.crearUsuario("usuario1@gmail.com", "ApellidoUsuario1", "NombreUsuario1", Perfil.CLIENTE, null,"ClaveUsuario1"));
       //sin clave - null
        /*RECUPERAR LOS PRODUCTOS CON EL METODO MENU*/
        System.out.println("######## LISTA DE USUARIOS ########");
        System.out.println("Usuarios");
        System.out.println("=========");
        for(Usuario u : gu.verUsuarios()) {
            u.mostrar();
            System.out.println();
        }
        System.out.println();
        
        System.out.println("######## USUARIOS POR CORREO ########");
        /*OBTENER UN PRODUCTO MEDIANTE EL CODIGO*/
        Usuario unUsuario1 = gu.obtenerUsuario("usuario1@gmail.com");
        Usuario unUsuario2 = gu.obtenerUsuario("usuario3@gmail.com");
        if (unUsuario1 != null) {
        System.out.println("Detalles del usuario 1: ");
        unUsuario1.mostrar();
    } else {
        System.out.println("Producto con correo no encontrado.");
    }

    if (unUsuario2 != null) {
        System.out.println("Detalles del usuario 2: ");
        unUsuario2.mostrar();
    } else {
        System.out.println("Producto con codigo no encontrado.");
    }

        
        System.out.println("######## USUARIOS POR APELLIDO ########");
        /*SUBCONJUNTO DE PRODUCTOS DE UNA CATEGORIA*/
        ArrayList<Usuario> usuariosBuscados = gu.buscarUsuarios("ApellidoUsuario1");
        System.out.println("Usuarios");
        System.out.println("===================");
        for(Usuario u : usuariosBuscados) {
            u.mostrar();
            System.out.println();
        }
        System.out.println();     
      
        System.out.println(gu.modificarUsuario(unUsuario1, "gonzalonasul34@gmail.com", "Nasul","Gonzalo Adrian", Perfil.EMPLEADO,"gonzalonasul","gonzalonasul"));
        //se le cambia la descripción, precio, categoría y estado
        //el código, por más que se lo pasa, no se modifica
        usuariosBuscados = gu.buscarUsuarios("Nasul");
        System.out.println("Usuarios buscados");
        System.out.println("==================");
        for(Usuario u : usuariosBuscados) {
            u.mostrar();
            System.out.println();
        }
        System.out.println();
        
        System.out.println(gu.modificarUsuario(unUsuario1, "gonzalonasul34@gmail.com", "","Gonzalo Adrian", Perfil.EMPLEADO,"gonzalonasul","gonzalonasul"));
    }
}

