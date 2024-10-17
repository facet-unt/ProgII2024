/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuario;

/**
 *
 * @author luis
 */
public class ControladorPrincipal_Parte3 {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();    
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        //<editor-fold desc="USUARIOS" defaultstate="collapsed">
        /*
        USUARIOS
        */
        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
        Usuario unCliente4 = new Cliente("cliente3@bar.com", "claveCliente4", "ApellidoCliente4", "NombreCliente4"); 
        //cliente repetido
        if(!usuarios.contains(unCliente1))
            usuarios.add(unCliente1);
        if(!usuarios.contains(unCliente2))
            usuarios.add(unCliente2);
        if(!usuarios.contains(unCliente3))
            usuarios.add(unCliente3);
        if(!usuarios.contains(unCliente4))
            usuarios.add(unCliente4);

//        System.out.println("Clientes");
//        System.out.println("========");
//        for(Usuario u : usuarios) {
//            if (u instanceof Cliente) {
//                u.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();        

        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
        Usuario unEmpleado4 = new Empleado("empleado3@bar.com", "claveEmpleado4", "ApellidoEmpleado4", "NombreEmpleado4");
        //empleado repetido

        if(!usuarios.contains(unEmpleado1))
            usuarios.add(unEmpleado1);
        if(!usuarios.contains(unEmpleado2))
            usuarios.add(unEmpleado2);
        if(!usuarios.contains(unEmpleado3))
            usuarios.add(unEmpleado3);
        if(!usuarios.contains(unEmpleado4))
            usuarios.add(unEmpleado4);

//        System.out.println("Empleados");
//        System.out.println("=========");
//        for(Usuario u : usuarios) {
//            if (u instanceof Empleado) {
//                u.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();

        Usuario unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Usuario unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Usuario unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
        Usuario unEncargado4 = new Encargado("encargado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
        //encargado repetido

        if(!usuarios.contains(unEncargado1))
            usuarios.add(unEncargado1);
        if(!usuarios.contains(unEncargado2))
            usuarios.add(unEncargado2);
        if(!usuarios.contains(unEncargado3))
            usuarios.add(unEncargado3);
        if(!usuarios.contains(unEncargado4))
            usuarios.add(unEncargado4);

//        System.out.println("Encargados");
//        System.out.println("==========");
//        for(Usuario u : usuarios) {
//            if (u instanceof Encargado) {
//                u.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();

        //Repetidos
        Usuario unCliente5 = new Cliente("encargado3@bar.com", "claveCliente5", "ApellidoCliente5", "NombreCliente5");
        //cliente repetido con un encargado
        if(!usuarios.contains(unCliente5))
            usuarios.add(unCliente5);
        else
            System.out.println("No se puede agregar el cliente5");

        Usuario unEncargado5 = new Encargado("empleado2@bar.com", "claveEncargado5", "ApellidoEncargado5", "NombreEncargado5");
        //encargado repetido con un empleado

        if(!usuarios.contains(unEncargado5))
            usuarios.add(unEncargado5);
        else
            System.out.println("No se puede agregar el encargado5");

        Usuario unEmpleado5 = new Encargado("cliente2@bar.com", "claveEmpleado5", "ApellidoEmpleado5", "NombreEmpleado5");
        //empleado repetido con un cliente

         if(!usuarios.contains(unEmpleado5))
            usuarios.add(unEmpleado5);
        else
            System.out.println("No se puede agregar el unEmpleado5");
         
//        System.out.println("Lista de usuarios");
//        System.out.println("========");
//        for(Usuario u : usuarios) {
//            u.mostrar();
//            System.out.println();
//        }
//        System.out.println();
        //</editor-fold>
        
        //<editor-fold desc="PRODUCTOS" defaultstate="collapsed">
        /*
        PRODUCTOS
        */
        
        Producto unProducto1 = new Producto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);        
        Producto unProducto2 = new Producto(2, "Producto2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE, 2.0f);
        Producto unProducto3 = new Producto(3, "Producto3", Categoria.POSTRE, Estado.DISPONIBLE, 3.0f);
        Producto unProducto4 = new Producto(3, "Producto3", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE, 3.0f);
        //repetido unProducto4
        Producto unProducto5 = new Producto(5, "Producto5", Categoria.POSTRE, Estado.DISPONIBLE, 48.0f);

        if(!productos.contains(unProducto1))
            productos.add(unProducto1);
        if(!productos.contains(unProducto2))
            productos.add(unProducto2);
        if(!productos.contains(unProducto3))
            productos.add(unProducto3);
        if(!productos.contains(unProducto4))
            productos.add(unProducto4);
        if(!productos.contains(unProducto5))
            productos.add(unProducto5);

//        System.out.println("Productos");
//        System.out.println("=========");
//        for(Producto p : productos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
        //</editor-fold>
        
        //<editor-fold desc="PEDIDOS y PRODUCTOS DEL PEDIDO" defaultstate="collapsed">
        /*
        PEDIDOS y PRODUCTOS DEL PEDIDO
        */
        ArrayList<ProductoDelPedido> pdp1 = new ArrayList<>();
        ProductoDelPedido pp1 = new ProductoDelPedido(unProducto1, 1);
        if(!pdp1.contains(pp1))
            pdp1.add(pp1);
        
        ProductoDelPedido pp2 = new ProductoDelPedido(unProducto2, 1);
        if(!pdp1.contains(pp2))
            pdp1.add(pp2);
        
        ProductoDelPedido pp3 = new ProductoDelPedido(unProducto2, 4);
        if(!pdp1.contains(pp3))
            pdp1.add(pp3);
                
        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), pdp1, (Cliente)usuarios.get(0)); 
        //se agrega a la lista de pedidos
        if(!pedidos.contains(unPedido1))
            pedidos.add(unPedido1);
        
        
        ArrayList<ProductoDelPedido> pdp2 = new ArrayList<>();
        ProductoDelPedido pp4 = new ProductoDelPedido(unProducto1, 10);
        if(!pdp2.contains(pp4))
            pdp2.add(pp4);
        
        ProductoDelPedido pp5 = new ProductoDelPedido(unProducto2, 20);
        if(!pdp2.contains(pp5))
            pdp2.add(pp5);
        
        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), pdp2, (Cliente)usuarios.get(1));       
        
        //se agrega el pedido 2 a la lista de pedidos
        if(!pedidos.contains(unPedido2))
            pedidos.add(unPedido2);
        
        ArrayList<ProductoDelPedido> pdp3 = new ArrayList<>();
        ProductoDelPedido pp6 = new ProductoDelPedido(unProducto3, 100);
        if(!pdp3.contains(pp6))
            pdp3.add(pp6);
        
        ProductoDelPedido pp7 = new ProductoDelPedido(unProducto2, 200);
        if(!pdp3.contains(pp7))
            pdp3.add(pp7);
        
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(), pdp3, (Cliente)usuarios.get(2));      
        
//        se agrega el pedido 3 a la lista de pedidos
        if(!pedidos.contains(unPedido3))
            pedidos.add(unPedido3);      
             
        ArrayList<ProductoDelPedido> pdp4 = new ArrayList<>();
        ProductoDelPedido pp8 = new ProductoDelPedido(unProducto1, 15);
        if(!pdp4.contains(pp8))
            pdp4.add(pp8);
        
        ProductoDelPedido pp9 = new ProductoDelPedido(unProducto2, 21);
        if(!pdp4.contains(pp9))
            pdp4.add(pp9);
        
        Pedido unPedido4 = new Pedido(3, LocalDateTime.now(), pdp4, (Cliente)usuarios.get(1));        
        
        //NO se agrega el pedido 4 a la lista de pedidos
        if(!pedidos.contains(unPedido4))
            pedidos.add(unPedido4);      
        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : pedidos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
        
       //</editor-fold>
       
        //<editor-fold desc="CLIENTE Y PEDIDOS" defaultstate="collapsed">
        /*
        CLIENTE Y PEDIDOS
        */
        ((Cliente)unCliente1).agregarPedido(unPedido1);
        ((Cliente)unCliente1).agregarPedido(unPedido1);
        //pedido repetido
       
        System.out.println("Pedidos de " + unCliente1.verApellido() + ", " + unCliente1.verNombre());
        for(Pedido p : unCliente1.verPedidos()) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
        ((Cliente)unCliente1).cancelarPedido(unPedido1);
        System.out.println("Pedidos de " + unCliente1.verApellido() + ", " + unCliente1.verNombre());
        for(Pedido p : unCliente1.verPedidos()) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
        //</editor-fold>
    }
    
}
