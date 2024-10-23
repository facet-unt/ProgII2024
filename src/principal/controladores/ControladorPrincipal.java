///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import productos.modelos.Categoria;
/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    public static void main(String[] args) {        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        
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
 

        Producto unProducto1 = new Producto(1, "Producto1",Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE , 1.0f);        
                       if(!listaProductos.contains(unProducto1)){
                           listaProductos.add(unProducto1);
                       }
        Producto unProducto2 = new Producto(2, "Producto2",Categoria.PLATOPRINCIPAL,productos.modelos.Estado.NODISPONIBLE, 2.0f);
                        if(!listaProductos.contains(unProducto2)){
                           listaProductos.add(unProducto2);
                       }
        Producto unProducto3 = new Producto(3, "Producto3",Categoria.POSTRE,productos.modelos.Estado.DISPONIBLE,3.0f);
                        if(!listaProductos.contains(unProducto3)){
                           listaProductos.add(unProducto3);
                       }
        Producto unProducto4 = new Producto(3, "Producto4",Categoria.ENTRADA,productos.modelos.Estado.NODISPONIBLE,3.0f);
                        if(!listaProductos.contains(unProducto4)){
                           listaProductos.add(unProducto4);
                       }
                        
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : listaProductos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();

        //</editor-fold>
//        
//        //<editor-fold desc="SEGUNDA PARTE" defaultstate="collapsed">
//        /*
//        SEGUNDA PARTE

        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), unCliente1, pedidos.modelos.Estado.SOLICITADO);        
        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), unCliente2, pedidos.modelos.Estado.CREADO);        
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(), unCliente3, pedidos.modelos.Estado.PROCESANDO);        
        
        listaPedidos.add(unPedido1);
        listaPedidos.add(unPedido2);
        listaPedidos.add(unPedido3);
        
        unPedido1.agregarProducto(unProducto1, 8);
        unPedido2.agregarProducto(unProducto2, 3);
        unPedido3.agregarProducto(unProducto3, 2);
        
        
        System.out.println("Pedidos");
        System.out.println("=======");
        for(Pedido p : listaPedidos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
       //</editor-fold>      
        
   }
}

//package Principal.Controladores;
//
//import usuarios.modelos.Cliente;
//import usuarios.modelos.Empleado;
//import usuarios.modelos.Encargado;
//import productos.modelos.Producto;
//import java.util.ArrayList;
//
//public class ControladorPrincipal {
//
//    public static void main(String[] args) {
//
//        ArrayList<Cliente> clientes = new ArrayList<>(); //creo la ArryList
//        ArrayList<Empleado> empleados = new ArrayList<>();
//        ArrayList<Encargado> encargados = new ArrayList<>();
//        ArrayList<Producto> productos = new ArrayList<>();
//
//        //se le asigna los valores a cada atributo de Cliente
//        // Crear clientes
//        clientes.add(new Cliente("Gomez", "Fernando", "Gapsiloe@gmail.com", "123456"));
//        clientes.add(new Cliente("Hernan", "Perez", "Fliaa@gmail.com", "987654"));
//        clientes.add(new Cliente("Isaias", "Olmedo", "olmo@gmail.com", "001001"));
//        
//        // Imprimir detalles de clientes
//        System.out.println("Clientes");
//        System.out.println("=========");
//
//        for (Cliente c : clientes) //recorre el arraylist 
//        {
//            c.mostrar();
//        }
//        System.out.println();        
//        
//        //se crea em´pleados
//        empleados.add(new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1"));        
//        empleados.add(new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2"));        
//        empleados.add(new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3"));
//
//        
//        System.out.println("Empleados");
//        System.out.println("=========");
//        for(Empleado e : empleados) {
//            e.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//
//        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado56", "NombreEncargado1");
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
//        Producto unProducto1 = new Producto(1, "Producto1", "ENTRADA" ,"DISPONIBLE", 1.0f);        
//        Producto unProducto2 = new Producto(2, "Producto2", "PLATOPRINCIPAL", "DISPONIBLE", 2.0f);
//        Producto unProducto3 = new Producto(3, "Producto3", "POSTRE", "DISPONIBLE", 3.0f);
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
//    }
//}
