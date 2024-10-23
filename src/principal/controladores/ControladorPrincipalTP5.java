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
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuario;

/**
 *
 * @author Mariana
 */
public class ControladorPrincipalTP5 {
    public static void main(String[] args) {
        GestorProductos gp = GestorProductos.instanciarGestorProductos();
       // GestorUsuarios gu=GestorUsuarios.instanciar();
        
        System.out.println("#####PRODUCTOS#####");
        /*CREAR PRODUCTO*/
        System.out.println(gp.crearProducto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f));
        System.out.println(gp.crearProducto(2, "Producto2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE, 2.0f));
        System.out.println(gp.crearProducto(3, "Plato3", Categoria.POSTRE, Estado.DISPONIBLE,3.0f));
        System.out.println(gp.crearProducto(3, "Producto4", Categoria.POSTRE, Estado.DISPONIBLE, 4.0f));
        //producto repetido, mismo codigo
        System.out.println(gp.crearProducto(0, "Producto4", Categoria.POSTRE, Estado.DISPONIBLE, 4.0f));
        //código inválido vale 0
        System.out.println(gp.crearProducto(4, null, Categoria.POSTRE, Estado.DISPONIBLE, 4.0f));
        //sin descripción -- nula
        System.out.println(gp.crearProducto(4, "", Categoria.POSTRE, Estado.DISPONIBLE, 4.0f));
        //descripción inválida  -- cadena vacia
        System.out.println(gp.crearProducto(4, "Producto4", Categoria.POSTRE, Estado.DISPONIBLE, 0.0f));
        //precio inválido  -- precio en 0
        System.out.println(gp.crearProducto(4, "Producto4", null, Estado.DISPONIBLE,4.0f));
        //sin categoría 
        System.out.println(gp.crearProducto(4, "Producto4", Categoria.POSTRE, null, 4.0f));
        //sin estado

        /*RECUPERAR LOS PRODUCTOS CON EL METODO MENU*/
        System.out.println("######## PRODUCTOS CON MENU ########");
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : gp.menu()) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
        System.out.println("######## PRODUCTOS POR CODIGO ########");
        /*OBTENER UN PRODUCTO MEDIANTE EL CODIGO*/
        Producto unProducto1 = gp.obtenerProducto(1);
        Producto unProducto2 = gp.obtenerProducto(2);
        
        System.out.println("######## PRODUCTOS DE UNA CATEGORIA ########");
        /*SUBCONJUNTO DE PRODUCTOS DE UNA CATEGORIA*/
        ArrayList<Producto> productosBuscados = gp.verProductosPorCategoria(Categoria.POSTRE);
        System.out.println("Productos filtrados por categoría");
        System.out.println("===================");
        for(Producto p : productosBuscados) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();

        System.out.println("######## PRODUCTOS POR DESCRIPCION ########");
        /*BUSCAR PRODUCTO POR DESCRIPCION*/
        productosBuscados = gp.buscarProductos("Prod");
        System.out.println("Productos buscados por descripcion");
        System.out.println("==================");
        for(Producto p : productosBuscados) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
      
        System.out.println(gp.modificarProducto(unProducto1, 100, "Producto11", 10.0f, Categoria.PLATO_PRINCIPAL, Estado.NO_DISPONIBLE));
        //se le cambia la descripción, precio, categoría y estado
        //el código, por más que se lo pasa, no se modifica
        productosBuscados = gp.buscarProductos("Producto11");
        System.out.println("Productos buscados");
        System.out.println("==================");
        for(Producto p : productosBuscados) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
        System.out.println(gp.modificarProducto(unProducto1, 100, "", 10.0f, Categoria.PLATO_PRINCIPAL, Estado.NO_DISPONIBLE));

    }
}
