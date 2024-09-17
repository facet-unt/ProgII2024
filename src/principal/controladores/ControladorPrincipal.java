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

        Cliente nuevoCliente1 = new Cliente(null,null,null,null);
        Cliente nuevoCliente2 = new Cliente(null,null,null,null);
        Cliente nuevoCliente3 = new Cliente(null,null,null,null);
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
         
         nuevoCliente1.setApellido("midajs");
         nuevoCliente1.setNombre("Martins");
         nuevoCliente1.setCorreo("holas@gmail.com");
             nuevoCliente2.setApellido("gonzalos");
             nuevoCliente2.setNombre("nasus");
             nuevoCliente2.setCorreo("lalas@gmail.com");
                 nuevoCliente3.setApellido("pepos");
                 nuevoCliente3.setNombre("mamas");
                 nuevoCliente3.setCorreo("papas@gmail.com");
                  
                 
                nuevoEncargado1.Apellido = "midajsa";
                nuevoEncargado1.Nombre = "Martinsa";
                nuevoEncargado1.Correo = "holas@gmail.coma";
                    nuevoEncargado2.Apellido = "gonzalosa";
                    nuevoEncargado2.Nombre = "nasusa";
                    nuevoEncargado2.Correo = "lalasa@gmail.com";
                        nuevoEncargado3.Apellido = "peposa";
                        nuevoEncargado3.Nombre = "mamasa";
                        nuevoEncargado3.Correo = "papasagmail.com";
                NombreProducto1.setCodigo(123);
                NombreProducto1.setDescripcion("Soda");
                NombreProducto1.setEstado("Disponlible");
                NombreProducto1.setPrecio(100f);
                    NombreProducto2.setCodigo(1234);
                    NombreProducto2.setDescripcion("pespi");
                    NombreProducto2.setEstado("Disponlible");
                    NombreProducto2.setPrecio(120f);
                        NombreProducto3.setCodigo(1233);
                        NombreProducto3.setDescripcion("coca");
                        NombreProducto3.setEstado("no hay");
                        NombreProducto3.setPrecio(1000f);
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
        nuevoCliente1.setApellido("morales");
        for (Cliente cliente : listaClientes) {
            cliente.mostrar();
            System.out.println("");
            
        }
        
    }
}
