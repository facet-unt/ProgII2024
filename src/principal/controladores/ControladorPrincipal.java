/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import pedidos.modelos.*;
import usuarios.modelos.*;
import productos.modelos.*;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios=new ArrayList<>();
        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        ArrayList<Producto> listaProductos= new ArrayList<>();

        Cliente unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
        Cliente unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
        Cliente unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");

        usuarios.add(unCliente1);
        usuarios.add(unCliente2);
        usuarios.add(unCliente3);

        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : usuarios) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();        

        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");

        usuarios.add(unEmpleado1);
        usuarios.add(unEmpleado2);
        usuarios.add(unEmpleado3);

        System.out.println("Empleados");
        System.out.println("=========");
        for(Empleado e : usuarios) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();

        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Encargado unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Encargado unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");

        usuarios.add(unEncargado1);
        usuarios.add(unEncargado2);
        usuarios.add(unEncargado3);

        System.out.println("Encargados");
        System.out.println("==========");
        for(Encargado e : encargados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();

        Producto unProducto1 = new Producto(1, "Producto1", 1.0f, Estado.DISPONIBLE, Categoria.ENTRADA);        
        Producto unProducto2 = new Producto(2, "Producto2", 2.0f, Estado.NO_DISPONIBLE, Categoria.PLATOPRINCIPAL);
        Producto unProducto3 = new Producto(3, "Producto3", 3.0f, Estado.DISPONIBLE, Categoria.POSTRE);

        if (!listaProductos.contains(unProducto1)){
            listaProductos.add(unProducto1);
        }
        if (!listaProductos.contains(unProducto2)){
            listaProductos.add(unProducto2);
        }
        if (!listaProductos.contains(unProducto3)){
            listaProductos.add(unProducto3);
        }
        if (!listaProductos.contains(unProducto3)){
            listaProductos.add(unProducto3);
        }
        

        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : listaProductos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();


        unCliente1.asignarCorreo("cliente10@bar.com");
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();

        System.out.println(unProducto1);
        
        ProductoDelPedido unProdPedido1 = new ProductoDelPedido(1, unProducto1);
        ProductoDelPedido unProdPedido2 = new ProductoDelPedido(1, unProducto2);
        ProductoDelPedido unProdPedido3 = new ProductoDelPedido(1, unProducto3);
        
        Pedido unPedido1 = new Pedido(unCliente1, Estado.CREADO);
        Pedido unPedido2 = new Pedido(unCliente2, Estado.CREADO);
        Pedido unPedido3 = new Pedido(unCliente3, Estado.CREADO);
        
        unPedido1.agregarProductos(unProdPedido1);
        unPedido2.agregarProductos(unProdPedido2);
        unPedido3.agregarProductos(unProdPedido3);
        unPedido1.agregarProductos(unProdPedido1);

        
        if (!listaPedidos.contains(unPedido1)){
            listaPedidos.add(unPedido1);
        }
        if (!listaPedidos.contains(unPedido2)){
            listaPedidos.add(unPedido2);
        }if (!listaPedidos.contains(unPedido2)){
            listaPedidos.add(unPedido2);
        }
        if (!listaPedidos.contains(unPedido3)){
            listaPedidos.add(unPedido3);
        }
        
        
        System.out.println("Pedidos");
        System.out.println("=========");
        
        for(Pedido p : listaPedidos){
            p.mostrar();
        }
        
        
        unPedido1.agregarProductos(unProdPedido1);
        unPedido1.agregarProductos(unProdPedido1);
        unPedido1.agregarProductos(unProdPedido1);
    }
}