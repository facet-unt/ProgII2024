/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

//import java.time.LocalDateTime;
import com.sun.source.doctree.SinceTree;
import java.util.ArrayList;
import static productos.modelos.Categoria.ENTRADA;
import static productos.modelos.Categoria.PLATOPRINCIPAL;
import static productos.modelos.Categoria.POSTRE;
import static productos.modelos.Estado.DISPONIBLE;
import static productos.modelos.Estado.NODISPONIBLE;
//import pedidos.modelos.Pedido;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuarios;

/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {

    

    
    public static void main(String[] args) {        
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
//        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        //<editor-fold desc="PRIMERA PARTE" defaultstate="collapsed">
        /*
        PRIMERA PARTE
        */
        Usuarios unUsuario1 = new Cliente("domicilioCliente1","cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
        Usuarios unUsuario2 = new Cliente("domicilioCliente2","cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
        Usuarios unUsuario3=new Cliente("domicilioCliente2","cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");

        usuarios.add(unUsuario1);
        usuarios.add(unUsuario2);
        usuarios.add(unUsuario3);

        Usuarios unEmpleado1 = new Empleado(1213,"empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
        Usuarios unEmpleado2 = new Empleado(1233,"empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
        Usuarios unEmpleado3 = new Empleado(12223,"empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");

        usuarios.add(unEmpleado1);
        usuarios.add(unEmpleado2);
        usuarios.add(unEmpleado3);
        
        Usuarios unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
        Usuarios unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
        Usuarios unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");

        usuarios.add(unEncargado1);
        usuarios.add(unEncargado2);
        usuarios.add(unEncargado3);
        
        System.out.println("Usuarios");
        System.out.println("========");
        int contador = 1;  // Inicializa un contador
        for (Usuarios c : usuarios) {
        if (c instanceof Encargado) {
        System.out.println("USUARIO N:" + contador + ".");  // Imprime el número antes de mostrar el objeto
        c.mostrar();  // Llama al método mostrar() del objeto
        System.out.println("----------");
        System.out.println();
        contador++;  // Incrementa el contador para el próximo objeto
    }
}


        Producto unProducto1 = new Producto(1, "Producto1",1.0f ,DISPONIBLE , ENTRADA );        
        Producto unProducto2 = new Producto(2, "Producto2",2.0f, DISPONIBLE, PLATOPRINCIPAL);
        Producto unProducto3 = new Producto(3, "Producto3",3.0f, NODISPONIBLE, POSTRE);

        productos.add(unProducto1);
        productos.add(unProducto2);
        productos.add(unProducto3);

        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : productos) {
            p.mostrar();
            System.out.println("----------");
            System.out.println();
        }
        System.out.println();


       

        System.out.println(unProducto1);
        //</editor-fold>
        
        //<editor-fold desc="SEGUNDA PARTE" defaultstate="collapsed">
        /*
        SEGUNDA PARTE
        */
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), unCliente1);        
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(),  unCliente2);        
//        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(),  unCliente3);        
//        
//        pedidos.add(unPedido1);
//        pedidos.add(unPedido2);
//        pedidos.add(unPedido3);
//        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : pedidos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
       //</editor-fold>
        
        
        
    }

}
