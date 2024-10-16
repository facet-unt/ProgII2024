/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import static productos.modelos.Categoria.ENTRADA;
import static productos.modelos.Categoria.PLATO_PRINCIPAL;
import static productos.modelos.Categoria.POSTRE;
import static productos.modelos.Estado.DISPONIBLE;
import static productos.modelos.Estado.NO_DISPONIBLE;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuario;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        
        //<editor-fold desc="PRIMERA PARTE" defaultstate="collapsed">
        /*
        PRIMERA PARTE
         */
        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");
        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");
        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");

        usuarios.add(unCliente1);
        usuarios.add(unCliente2);
        usuarios.add(unCliente3);

        System.out.println("Clientes");
        System.out.println("========");

        Empleado unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");
        Empleado unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");
        Empleado unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");

        usuarios.add(unEmpleado1);
        usuarios.add(unEmpleado2);
        usuarios.add(unEmpleado3);

        

        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Encargado unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Encargado unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");

        usuarios.add(unEncargado1);
        usuarios.add(unEncargado2);
        usuarios.add(unEncargado3);

        System.out.println("usuarios");
        System.out.println("==========");
        for (Usuario u : usuarios) {
            u.mostrar();
            System.out.println();
        }
        System.out.println();

        Producto unProducto1 = new Producto(1, "Producto1", ENTRADA,DISPONIBLE ,1.0f );
        Producto unProducto2 = new Producto(2, "Producto2",PLATO_PRINCIPAL , DISPONIBLE,2.0f );
        Producto unProducto3 = new Producto(1, "Producto3", POSTRE, NO_DISPONIBLE,3.0f );
        
        if (!productos.contains(unProducto1)){
            productos.add(unProducto1);
        }
        
        if (!productos.contains(unProducto2)){
            productos.add(unProducto2);
        }
        if (!productos.contains(unProducto3)){
            productos.add(unProducto3);
        }

        System.out.println("Productos");
        System.out.println("=========");
        for (Producto p : productos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();

        unCliente1.asignarCorreo("cliente10@bar.com");
        unCliente1.mostrar();
        System.out.println();

        unProducto1.mostrar();
        //</editor-fold>

        //<editor-fold desc="SEGUNDA PARTE" defaultstate="collapsed">
        /*
        SEGUNDA PARTE
         */
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), (Cliente)unCliente1);
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), (Cliente)unCliente2);
//        Pedido unPedido3 = new Pedido(1, LocalDateTime.now(),(Cliente)unCliente3);
        
        //NO SIRVE: Pedido unPedido4 = new Pedido(4, LocalDateTime.now(), (Cliente)unEncargado1);
        //el (cliente) se llama hacer casting, le avisa al costructor que este usuario es un cliente
        
//        if (!pedidos.contains(unPedido1)){
//            pedidos.add(unPedido1);
//        }
//        if (!pedidos.contains(unPedido2)){
//            pedidos.add(unPedido2);
//        }
//        if (!pedidos.contains(unPedido3)){
//            pedidos.add(unPedido3);
//        }
//        
        System.out.println("Pedidos");
        System.out.println("=======");
        for (Pedido p : pedidos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        //</editor-fold>

        
        
        Usuario unEmpleado4 = new Empleado("empleado1@bar.com", "claveEmpleado1ss", "ApellidoEmspleado1", "NombreEmssspleado1");
        System.out.println("funciona? : " + unEmpleado4.equals(unEmpleado1));
        Usuario unCliente4 = new Cliente("empleado1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");
        System.out.println("funciona? : " + unCliente4.equals(unEmpleado1));
        
        //parte 3 tp 4
//        ((Cliente)unCliente1).agregarPedido(unPedido1);
//        ((Cliente)unCliente1).agregarPedido(unPedido2);
//        ((Cliente)unCliente1).agregarPedido(unPedido3);
        for (Pedido p : ((Cliente)unCliente1).verPedidos()) {
            p.mostrar(); //muestra solo pedido 2 y 3, porque pedido 3 es igual a pedido 1 y lo reemplaza
        }
//        ((Cliente)unCliente1).cancelarPedido(unPedido3);
        for (Pedido p : ((Cliente)unCliente1).verPedidos()) {
            p.mostrar(); //muestra solo 2
        }
    }

}
