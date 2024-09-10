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
public class ControladoPrincipal {
    public static void main(String[] args) {
        ArrayList <Producto> listaProductos =new ArrayList<>();
        ArrayList <Cliente> listaClientes =new ArrayList<>();
        ArrayList <Empleado> listaEmpleados =new ArrayList<>();
        ArrayList <Encargado> listaEncargados =new ArrayList<>();
        Encargado encargado1 = new Encargado();
        Encargado encargado2 = new Encargado();
        Encargado encargado3 = new Encargado();
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaEncargados.add(encargado1);
        listaEncargados.add(encargado2);
        listaEncargados.add(encargado3);
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        for (Producto p :listaProductos){
            p.mostrar();
        }
        for (Encargado p :listaEncargados){
            p.mostrar();
        }
        for (Empleado p :listaEmpleados){
            p.mostrar();
        }
        for (Cliente p :listaClientes){
            p.mostrar();
        }
        empleado1.nombre="Gustavo";
        empleado1.apellido="Napoli";
        empleado1.clave="1234";
        empleado1.correo="empleado1@restaurant.com";
        empleado2.nombre="Carlos Alberto";
        empleado2.apellido="García";
        empleado2.clave="1234";
        empleado2.correo="empleado2@restaurant.com";
        empleado3.nombre="Ricardo";
        empleado3.apellido="Mollo";
        empleado3.clave="1234";
        empleado3.correo="empleado3@restaurant.com";
        encargado1.nombre="Luis Alberto";
        encargado1.apellido="Spinetta";
        encargado1.clave="1234";
        encargado1.correo="encargado1@restaurant.com";
        encargado2.nombre="Cristian";
        encargado2.apellido="Álvarez";
        encargado2.clave="1234";
        encargado2.correo="encargado2@restaurant.com";
        encargado3.nombre="Carlos Alberto";
        encargado3.apellido="Solari";
        encargado3.clave="1234";
        encargado3.correo="encargado3@restaurant.com";
        cliente1.nombre="Gustavo";
        cliente1.apellido="Cerati";
        cliente1.clave="1234";
        cliente1.correo="cliente1@usuarios.com";
        cliente2.nombre="Norberto";
        cliente2.apellido="Napolitano";
        cliente2.clave="1234";
        cliente2.correo="cliente2@usuarios.com";
        cliente3.nombre="Sergio";
        cliente3.apellido="Dawi";
        cliente3.clave="1234";
        cliente3.correo="cliente3@usuarios.com";
        producto1.nombre="Pizza";
        producto1.descripcion="";
        producto1.precio=1.0f;
        producto1.estado="Disponible";
        producto2.nombre="Hamburguesa";
        producto2.descripcion="";
        producto2.precio=2.0f;
        producto2.estado="No Disponible";
        producto3.nombre="Fideos";
        producto3.descripcion="";
        producto3.precio=3.0f;
        producto3.estado="Disponible";
        listaClientes.clear();
        listaEncargados.clear();
        listaEmpleados.clear();
        listaProductos.clear();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaEncargados.add(encargado1);
        listaEncargados.add(encargado2);
        listaEncargados.add(encargado3);
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        for (Producto p :listaProductos){
            p.mostrar();
        }
        for (Encargado p :listaEncargados){
            p.mostrar();
        }
        for (Empleado p :listaEmpleados){
            p.mostrar();
        }
        for (Cliente p :listaClientes){
            p.mostrar();
        }
    }
}
