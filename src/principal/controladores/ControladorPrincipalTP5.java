///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package principal.controladores;
//
//import java.util.ArrayList;
//import productos.modelos.Categoria;
//import productos.modelos.Estado;
//import productos.modelos.GestorProductos;
//import productos.modelos.Producto;
//import usuarios.modelos.Cliente;
//import usuarios.modelos.Empleado;
//import usuarios.modelos.Encargado;
//import usuarios.modelos.Usuario;
//
///**
// *
// * @author Mariana
// */
//public class ControladorPrincipalTP5 {
//    public static void main(String[] args) {
//        GestorProductos gp = GestorProductos.instanciar();
//       // GestorUsuarios gu=GestorUsuarios.instanciar();
//        
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
//
//    }
//}
