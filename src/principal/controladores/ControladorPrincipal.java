/*
 * Copyright (c) 2024, Lucas Ahumada Checa   &   Juan Pablo Rearte
 * Todos los derechos reservados.
 *
 * Este código es propiedad de [Lucas Ahumada Checa   &   Juan Pablo Rearte] y no puede ser utilizado
 * sin permiso explícito.
 */
//package principal.controladores;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import pedidos.modelos.Pedido;
//import productos.modelos.Categoria;
//import productos.modelos.Estado;
//import productos.modelos.Producto;
//import usuarios.modelos.Cliente;
//import usuarios.modelos.Empleado;
//import usuarios.modelos.Encargado;
//import usuarios.modelos.Usuario;
//
///**
// *
// * @author estudiante
// */
//public class ControladorPrincipal {
//
//    public static void main(String[] args) {
//        ArrayList<Usuario> usuarios = new ArrayList<>();
//        ArrayList<Producto> productos = new ArrayList<>();
//        ArrayList<Pedido> pedidos = new ArrayList<>();
//
//        //<editor-fold desc="PRIMERA PARTE" defaultstate="collapsed">
//        /*
//        PRIMERA PARTE
//         */
//        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");
//        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");
//        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//
//        if (!usuarios.contains(unCliente1)) {
//            usuarios.add(unCliente1);
//        }
//        if (!usuarios.contains(unCliente2)) {
//            usuarios.add(unCliente2);
//        }
//        if (!usuarios.contains(unCliente3)) {
//            usuarios.add(unCliente3);
//        }
//
//        System.out.println("Clientes");
//        System.out.println("========");
//        for (Usuario u : usuarios) {
//            if (u instanceof Cliente) {
//                u.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();
//
//        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");
//        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");
//        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//
//        if (!usuarios.contains(unEmpleado1)) {
//            usuarios.add(unEmpleado1);
//        }
//        if (!usuarios.contains(unEmpleado2)) {
//            usuarios.add(unEmpleado2);
//        }
//        if (!usuarios.contains(unEmpleado3)) {
//            usuarios.add(unEmpleado3);
//        }
//
//        System.out.println("Empleados");
//        System.out.println("=========");
//        for (Usuario e : usuarios) {
//            if (e instanceof Empleado) {
//                e.mostrar();
//                System.out.println();
//            }
//            System.out.println();
//
//            Usuario unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
//            Usuario unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
//            Usuario unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//
//            if (!usuarios.contains(unEncargado1)) {
//                usuarios.add(unEncargado1);
//            }
//            if (!usuarios.contains(unEncargado2)) {
//                usuarios.add(unEncargado2);
//            }
//            if (!usuarios.contains(unEncargado3)) {
//                usuarios.add(unEncargado3);
//            }
//
//            System.out.println("Encargados");
//            System.out.println("==========");
//            for (Usuario enc : usuarios) {
//                if (enc instanceof Encargado) {
//                    enc.mostrar();
//                    System.out.println();
//                }
//                System.out.println();
//
//                Producto unProducto1 = new Producto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);
//                Producto unProducto1 = new Producto(2, "Producto2", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);
//                Producto unProducto1 = new Producto(3, "Producto3", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);

//
//                if (!productos.contains(unProducto1)) {
//                    productos.add(unProducto1);
//                }
//                if (!productos.contains(unProducto2)) {
//                    productos.add(unProducto2);
//                }
//                if (!productos.contains(unProducto3)) {
//                    productos.add(unProducto3);
//                }
//
//                System.out.println("Productos");
//                System.out.println("=========");
//
//                for (Producto p : productos) {
//                    p.mostrar();
//                    System.out.println();
//                }
//                System.out.println();
//
//                unCliente1.asignarCorreo("cliente10@bar.com");
//                System.out.println("Clientes");
//                System.out.println("========");
//
//                //</editor-fold>
//                //<editor-fold desc="SEGUNDA PARTE" defaultstate="collapsed">
//                /*
//        SEGUNDA PARTE
//                 */
//                Cliente cliente1 = (Cliente) unCliente1;
//                Cliente cliente2 = (Cliente) unCliente2;
//                Cliente cliente3 = (Cliente) unCliente3;
//
//                Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), cliente1);
//                Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), cliente2);
//                Pedido unPedido3 = new Pedido(3, LocalDateTime.now(), cliente3);
//
//                if (!pedidos.contains(unPedido1)) {
//                    pedidos.add(unPedido1);
//                }
//
//                if (!pedidos.contains(unPedido2)) {
//                    pedidos.add(unPedido2);
//                }
//
//                if (!pedidos.contains(unPedido3)) {
//                    pedidos.add(unPedido3);
//                }
//
//                System.out.println("Pedidos");
//                System.out.println("=======");
//                for (Pedido p : pedidos) {
//                    p.mostrar();
//                    System.out.println();
//                }
//                System.out.println();
//                //</editor-fold>
//
//            }
//
//        }
//    }
//}
