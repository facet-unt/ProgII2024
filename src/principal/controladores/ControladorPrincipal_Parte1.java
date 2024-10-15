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

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal_Parte1 {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        //<editor-fold desc="USUARIOS" defaultstate="collapsed">
        /*
        USUARIOS
        */
        Cliente unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
        Cliente unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
        Cliente unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");

        clientes.add(unCliente1);
        clientes.add(unCliente2);
        clientes.add(unCliente3);

        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();        

        Empleado unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
        Empleado unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
        Empleado unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");

        empleados.add(unEmpleado1);
        empleados.add(unEmpleado2);
        empleados.add(unEmpleado3);

        System.out.println("Empleados");
        System.out.println("=========");
        for(Empleado e : empleados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();

        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Encargado unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Encargado unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");

        encargados.add(unEncargado1);
        encargados.add(unEncargado2);
        encargados.add(unEncargado3);

        System.out.println("Encargados");
        System.out.println("==========");
        for(Encargado e : encargados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
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

        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : productos) {
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
        
        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), pdp1, unCliente1); 
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
        
        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), pdp2, unCliente2);       
        
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
        
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(), pdp3, unCliente3);      
        
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
        
        Pedido unPedido4 = new Pedido(3, LocalDateTime.now(), pdp4, unCliente2);        
        
        //NO se agrega el pedido 4 a la lista de pedidos
        if(!pedidos.contains(unPedido4))
            pedidos.add(unPedido4);      
        
        System.out.println("Pedidos");
        System.out.println("=======");
        for(Pedido p : pedidos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
       //</editor-fold>
    
    }
}
