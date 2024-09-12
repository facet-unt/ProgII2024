/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import usuarios.modelos.*;
import productos.modelos.*;

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
        
        Cliente primerCliente = new Cliente();
        primerCliente.nombre = "Manuel";
        primerCliente.apellido = "pedraza";
        primerCliente.correo = "manuelpedraza@gmail.com";
        primerCliente.clave = "aos!!2idjgss2ai";
        
        Cliente segundoCliente = new Cliente();
        segundoCliente.nombre = "Manuel";
        segundoCliente.apellido = "pedraza";
        segundoCliente.correo = "manuelpedraza@gmail.com";
        segundoCliente.clave = "aos!!2idjgss2ai";
        
        Cliente tercerCliente = new Cliente();
        tercerCliente.nombre = "Manuel";
        tercerCliente.apellido = "pedraza";
        tercerCliente.correo = "manuelpedraza@gmail.com";
        tercerCliente.clave = "aos!!2idjgss2ai";
        
        Empleado primerEmpleado = new Empleado();
        primerEmpleado.nombre = "Manuel";
        primerEmpleado.apellido = "pedraza";
        primerEmpleado.correo = "manuelpedraza@gmail.com";
        primerEmpleado.clave = "aos!!2idjgss2ai";
        
        Empleado segundoEmpleado = new Empleado();
        segundoEmpleado.nombre = "Manuel";
        segundoEmpleado.apellido = "pedraza";
        segundoEmpleado.correo = "manuelpedraza@gmail.com";
        segundoEmpleado.clave = "aos!!2idjgss2ai";
        
        Empleado tercerEmpleado = new Empleado();
        tercerEmpleado.nombre = "Manuel";
        tercerEmpleado.apellido = "pedraza";
        tercerEmpleado.correo = "manuelpedraza@gmail.com";
        tercerEmpleado.clave = "aos!!2idjgss2ai";
        
        Encargado primerEncargado = new Encargado();
        primerEncargado.nombre = "Manuel";
        primerEncargado.apellido = "pedraza";
        primerEncargado.correo = "manuelpedraza@gmail.com";
        primerEncargado.clave = "aos!!2idjgss2ai";
        
        Encargado segundoEncargado = new Encargado();
        segundoEncargado.nombre = "Manuel";
        segundoEncargado.apellido = "pedraza";
        segundoEncargado.correo = "manuelpedraza@gmail.com";
        segundoEncargado.clave = "aos!!2idjgss2ai";
        
        Encargado tercerEncargado = new Encargado();
        tercerEncargado.nombre = "Manuel";
        tercerEncargado.apellido = "pedraza";
        tercerEncargado.correo = "manuelpedraza@gmail.com";
        tercerEncargado.clave = "aos!!2idjgss2ai";
        
        Producto primerProducto = new Producto();
        primerProducto.codigo = 1254523;
        primerProducto.estado = "Disponible";
        primerProducto.nombre = "Desodorante";
        primerProducto.precio = 1200f;
        primerProducto.descripcion = "Usalo porfavor amigo te lo pido";
        
        Producto segundoProducto = new Producto();
        segundoProducto.codigo = 1254523;
        segundoProducto.estado = "Disponible";
        segundoProducto.nombre = "Desodorante";
        segundoProducto.precio = 1200f;
        segundoProducto.descripcion = "Usalo porfavor amigo te lo pido";
        
        Producto tercerProducto = new Producto();
        tercerProducto.codigo = 1254523;
        tercerProducto.estado = "Disponible";
        tercerProducto.nombre = "Desodorante";
        tercerProducto.precio = 1200f;
        tercerProducto.descripcion = "Usalo porfavor amigo te lo pido";
        
        // Añadir objetos a los ArrayList
        clientes.add(primerCliente);
        clientes.add(segundoCliente);
        clientes.add(tercerCliente);
        empleados.add(primerEmpleado);
        empleados.add(segundoEmpleado);
        empleados.add(tercerEmpleado);
        encargados.add(primerEncargado);
        encargados.add(segundoEncargado);
        encargados.add(tercerEncargado);
        productos.add(primerProducto);
        productos.add(segundoProducto);
        productos.add(tercerProducto);
        
        for (Cliente unCliente : clientes)
        {
            unCliente.mostrar();
        }
        
        for (Empleado unEmpleado : empleados)
        {
            unEmpleado.mostrar();
        }
        
        for (Encargado unEncargado : encargados)
        {
            unEncargado.mostrar();
        }
        
        for (Producto unProducto : productos)
        {
            unProducto.mostrar();
        }
    }
}
