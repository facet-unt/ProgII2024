/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    

    
    public static void main(String[] args) {        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        //<editor-fold desc="PRIMERA PARTE" defaultstate="collapsed">
        /*
        PRIMERA PARTE
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

        Producto unProducto1 = new Producto(1, "Producto1", "ENTRADA", "DISPONIBLE", 1.0f);        
        Producto unProducto2 = new Producto(2, "Producto2", "PLATOPRINCIPAL", "DISPONIBLE", 2.0f);
        Producto unProducto3 = new Producto(3, "Producto3", "POSTRE", "DISPONIBLE", 3.0f);

        productos.add(unProducto1);
        productos.add(unProducto2);
        productos.add(unProducto3);

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

        System.out.println(unProducto1);
        
        // Separacion del antes y dsp
        
        System.out.println();
        System.out.println("========= Modificaciones hechas =========");
        System.out.println();
        
        // Modificaciones a los objetos creados para su posterior muestra en pantalla
        
        unCliente1.asignarCorreo("nuevocorreo1@perrito.com");
        unCliente2.asignarCorreo("nuevocorreo2@perrito.com");
        unCliente3.asignarCorreo("nuevocorreo27@perrito.com");
        unCliente1.asignarClave(unCliente1.verClave()+"1233");
        unCliente2.asignarClave(unCliente2.verClave()+"1233");
        unCliente3.asignarClave(unCliente3.verClave()+"1233");
        
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();   
        
        unEmpleado1.asignarCorreo("entelaburantes25@losgatossonmejores.com");
        unEmpleado2.asignarCorreo("entelaburantes2323@losgatossonmejores.com");
        unEmpleado3.asignarCorreo("entelaburantes34971@losgatossonmejores.com");
        unEmpleado1.asignarClave(unEmpleado1.verClave()+"666 :o");
        unEmpleado2.asignarClave(unEmpleado2.verClave()+"7244!");
        unEmpleado3.asignarClave(unEmpleado3.verClave()+"!!!!!!!");
        
        System.out.println("Empleados");
        System.out.println("=========");
        for(Empleado e : empleados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        unEncargado1.asignarCorreo("todosestanbajomiMando@bussinesspersona.com");
        unEncargado2.asignarCorreo("lomismoqueelotro@bussinesspersona.com");
        unEncargado3.asignarCorreo("yestetmbesigual@bussinesspersona.com");
        unEncargado1.asignarClave(unEncargado1.verCorreo());
        unEncargado2.asignarClave(unEncargado2.verCorreo());
        unEncargado3.asignarClave(unEncargado3.verCorreo());
        unEncargado3.asignarNombre("Romina");
        
        System.out.println("Encargados");
        System.out.println("==========");
        for(Encargado e : encargados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : productos) {
            p.asignarEstado("AGOTADO");
            p.asignarDescripcion("YOGURT");
            p.asignarCodigo(777);
            p.mostrar();
            System.out.println();
        }
        //</editor-fold>
        
        //<editor-fold desc="SEGUNDA PARTE" defaultstate="collapsed">
        /*
        SEGUNDA PARTE
        */
        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), unCliente1);        
        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(),  unCliente2);        
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(),  unCliente3);        
        
        pedidos.add(unPedido1);
        pedidos.add(unPedido2);
        pedidos.add(unPedido3);
        
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
