/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import pedidos.modelos.Pedido;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuario;

/**
 *
 * @author luis
 */
public class ControladorPrincipal_Parte2 {
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

        System.out.println("Clientes");
        System.out.println("========");
        for(Usuario u : usuarios) {
            if (u instanceof Cliente) {
                u.mostrar();
                System.out.println();
            }
        }
        System.out.println();        

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

        System.out.println("Empleados");
        System.out.println("=========");
        for(Usuario u : usuarios) {
            if (u instanceof Empleado) {
                u.mostrar();
                System.out.println();
            }
        }
        System.out.println();

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

        System.out.println("Encargados");
        System.out.println("==========");
        for(Usuario u : usuarios) {
            if (u instanceof Encargado) {
                u.mostrar();
                System.out.println();
            }
        }
        System.out.println();

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
         
        System.out.println("Lista de usuarios");
        System.out.println("========");
        for(Usuario u : usuarios) {
            u.mostrar();
            System.out.println();
        }
        System.out.println();
        //</editor-fold>
    }    
}
