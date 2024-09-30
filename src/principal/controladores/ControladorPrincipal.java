/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import pedidos.modelos.Pedido;
import productos.modelos.Producto;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    

    
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        Producto unProducto1 = new Producto(1, "Producto1", 503.2f, "DISPONIBLE", "POSTRES");        
        Producto unProducto2 = new Producto(2, "Producto2", 324.2f, "DISPONIBLE", "ENTRADAS");
        Producto unProducto3 = new Producto(3, "Producto3", 2435.2f, "DISPONIBLE", "POSTRES");

        productos.add(unProducto1);
        productos.add(unProducto2);
        productos.add(unProducto3);
        
        
        Pedido primerPedido = new Pedido(1);
        primerPedido.agregarProducto(unProducto3, 1);
        primerPedido.agregarProducto(unProducto1, 5);
        primerPedido.agregarProducto(unProducto2, 3);
        primerPedido.mostrar();
        
        
//        ArrayList<Cliente> clientes = new ArrayList<>();
//        ArrayList<Empleado> empleados = new ArrayList<>();
//        ArrayList<Encargado> encargados = new ArrayList<>();
//        
//
//        Cliente unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Cliente unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Cliente unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//
//        clientes.add(unCliente1);
//        clientes.add(unCliente2);
//        clientes.add(unCliente3);
//
//        System.out.println("Clientes");
//        System.out.println("========");
//        for(Cliente c : clientes) {
//            c.mostrar();
//            System.out.println();
//        }
//        System.out.println();        
//
//        Empleado unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
//        Empleado unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
//        Empleado unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//
//        empleados.add(unEmpleado1);
//        empleados.add(unEmpleado2);
//        empleados.add(unEmpleado3);
//
//        System.out.println("Empleados");
//        System.out.println("=========");
//        for(Empleado e : empleados) {
//            e.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//
//        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
//        Encargado unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
//        Encargado unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//
//        encargados.add(unEncargado1);
//        encargados.add(unEncargado2);
//        encargados.add(unEncargado3);
//
//        System.out.println("Encargados");
//        System.out.println("==========");
//        for(Encargado e : encargados) {
//            e.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//
//        Producto unProducto1 = new Producto(1, "Producto1", "Esta muy bueno", 503.2f, "DISPONIBLE", "POSTRES");        
//        Producto unProducto2 = new Producto(2, "Producto2", "Esta bueno", 324.2f, "DISPONIBLE", "ENTRADAS");
//        Producto unProducto3 = new Producto(3, "Producto3", "Esta decente", 2435.2f, "DISPONIBLE", "POSTRES");
//
//        productos.add(unProducto1);
//        productos.add(unProducto2);
//        productos.add(unProducto3);
//
//        System.out.println("Productos");
//        System.out.println("=========");
//        for(Producto p : productos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//
//
//        unCliente1.asignarCorreo("cliente10@bar.com");
//        unCliente1.asignarApellido("CambioApellido1");
//        unCliente1.asignarNombre("CambioNombre1");
//        System.out.println("Clientes");
//        System.out.println("========");
//        for(Cliente c : clientes) {
//            c.mostrar();
//            System.out.println();
//        }
//        System.out.println();

    }

}
