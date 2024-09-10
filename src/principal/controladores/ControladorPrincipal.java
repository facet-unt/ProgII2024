/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
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
        ArrayList<Cliente> listaClientes = new ArrayList();
            ArrayList<Producto> listaProductos = new ArrayList();
                ArrayList<Encargado> listaEncargados = new ArrayList();
                    ArrayList<Empleado> listaEmpleados = new ArrayList();

        Producto NombreProducto1 = new Producto();
        Producto NombreProducto2 = new Producto();
        Producto NombreProducto3 = new Producto();
            listaProductos.add(NombreProducto1);
            listaProductos.add(NombreProducto2);
            listaProductos.add(NombreProducto3);

        Cliente nuevoCliente1 = new Cliente();
        Cliente nuevoCliente2 = new Cliente();
        Cliente nuevoCliente3 = new Cliente();
            listaClientes.add(nuevoCliente1);
            listaClientes.add(nuevoCliente2);
            listaClientes.add(nuevoCliente3);

        Encargado nuevoEncargado1 = new Encargado();
        Encargado nuevoEncargado2 = new Encargado();
        Encargado nuevoEncargado3 = new Encargado();
            listaEncargados.add(nuevoEncargado1);
            listaEncargados.add(nuevoEncargado2);
            listaEncargados.add(nuevoEncargado3);

        Empleado nuevoEmpleado1 = new Empleado();
        Empleado nuevoEmpleado2 = new Empleado();
        Empleado nuevoEmpleado3 = new Empleado();

        listaEmpleados.add(nuevoEmpleado1);
            listaEmpleados.add(nuevoEmpleado2);
                listaEmpleados.add(nuevoEmpleado3);
        nuevoEmpleado1.Apellido="midaj";
        nuevoEmpleado1.Nombre="Martin";
        nuevoEmpleado1.Correo="hola@gmail.com";
            nuevoEmpleado2.Apellido="gonzalo";
            nuevoEmpleado2.Nombre="nasu";
            nuevoEmpleado2.Correo="lala@gmail.com";
                nuevoEmpleado3.Apellido="pepo";
                nuevoEmpleado3.Nombre="mama";
                nuevoEmpleado3.Correo="papa@gmail.com";
         
         nuevoCliente1.Apellido="midajs";
         nuevoCliente1.Nombre="Martins";
         nuevoCliente1.Correo="holas@gmail.com";
             nuevoCliente2.Apellido="gonzalos";
             nuevoCliente2.Nombre="nasus";
             nuevoCliente2.Correo="lalas@gmail.com";
                 nuevoCliente3.Apellido="pepos";
                 nuevoCliente3.Nombre="mamas";
                 nuevoCliente3.Correo="papas@gmail.com";
                  
                 
                nuevoEncargado1.Apellido = "midajsa";
                nuevoEncargado1.Nombre = "Martinsa";
                nuevoEncargado1.Correo = "holas@gmail.coma";
                    nuevoEncargado2.Apellido = "gonzalosa";
                    nuevoEncargado2.Nombre = "nasusa";
                    nuevoEncargado2.Correo = "lalasa@gmail.com";
                        nuevoEncargado3.Apellido = "peposa";
                        nuevoEncargado3.Nombre = "mamasa";
                        nuevoEncargado3.Correo = "papasagmail.com";
                NombreProducto1.Codigo=123;
                NombreProducto1.descripcion="Soda";
                NombreProducto1.estado="Disponlible";
                NombreProducto1.precio= 100f;
                    NombreProducto2.Codigo=1234;
                    NombreProducto2.descripcion="pespi";
                    NombreProducto2.estado="Disponlible";
                    NombreProducto2.precio= 120f;
                        NombreProducto3.Codigo=1233;
                        NombreProducto3.descripcion="coca";
                        NombreProducto3.estado="no hay";
                        NombreProducto3.precio= 1000f;
        for (Empleado empleado : listaEmpleados) {
            empleado.mostrar();
            System.out.println("");
            
        }
        for (Cliente cliente : listaClientes) {
            cliente.mostrar();
            System.out.println("");
            
        }
        for (Encargado encargado : listaEncargados) {
            encargado.mostrar();
            System.out.println("");
            
        }
        for (Producto producto : listaProductos) {
            producto.mostrar();
            System.out.println("");
            
        }
        System.out.println(NombreProducto1);
        System.out.println(NombreProducto2);
        System.out.println(NombreProducto3);
        nuevoCliente1.Apellido="morales";
        for (Cliente cliente : listaClientes) {
            cliente.mostrar();
            System.out.println("");
            
        }
        
    }
}
