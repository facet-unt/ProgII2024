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
        ArrayList<Cliente> ListaClientes = new ArrayList<>();
        ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
        ArrayList<Encargado> ListaEncargados = new ArrayList<>();
        ArrayList<Producto> ListaProductos = new ArrayList<>();
        
        Cliente cliente1= new Cliente();
        
        cliente1.correo="manzana@gmail.com";
        cliente1.apellido="Belgrano";
        cliente1.nombre="Manuel";
        cliente1.clave="12345";
        
        Cliente cliente2= new Cliente();
        
        cliente2.correo="manzana@gmail.com";
        cliente2.apellido="Belgrano";
        cliente2.nombre="Manuel";
        cliente2.clave="12345";
        
        Cliente cliente3= new Cliente();
        
        cliente3.correo="manzana@gmail.com";
        cliente3.apellido="Belgrano";
        cliente3.nombre="Manuel";
        cliente3.clave="12345";
        
        Empleado empleado1= new Empleado();
        
        empleado1.apellido="Messi";
        empleado1.clave="1234567";
        empleado1.correo="noMegustacalculo@gmail.com";
        empleado1.nombre="Lionel";
        
        Empleado empleado2= new Empleado();
        
        empleado2.apellido="Messi";
        empleado2.clave="1234567";
        empleado2.correo="noMegustacalculo@gmail.com";
        empleado2.nombre="Lionel";
        
        
        Empleado empleado3= new Empleado();
        
        empleado3.apellido="Messi";
        empleado3.clave="1234567";
        empleado3.correo="noMegustacalculo@gmail.com";
        empleado3.nombre="Lionel";
        
        Encargado encargado1= new Encargado();
        
        encargado1.apellido="Venado";
        encargado1.clave="1234";
        encargado1.correo="vendoVenados@gmail.com";
        encargado1.nombre="Ricardo";
        
        Encargado encargado2= new Encargado();
        
        encargado2.apellido="Venado";
        encargado2.clave="1234";
        encargado2.correo="vendoVenados@gmail.com";
        encargado2.nombre="Ricardo";
        
        
        
        Encargado encargado3= new Encargado();
        
        encargado3.apellido="Venado";
        encargado3.clave="1234";
        encargado3.correo="vendoVenados@gmail.com";
        encargado3.nombre="Ricardo";
        
        
        
        Producto producto1= new Producto();
        
        producto1.categoria="Ropa Deportiva";
        producto1.codigo="23445";
        producto1.descripcion="Camiseta de Independiente";
        producto1.estado="Disponible";
        producto1.precio=343523.f;
        
        Producto producto2= new Producto();
        
        producto2.categoria="Ropa Deportiva";
        producto2.codigo="23445";
        producto2.descripcion="Camiseta de Independiente";
        producto2.estado="Disponible";
        producto2.precio=343523.f;
        
        
        Producto producto3= new Producto();
        
        producto3.categoria="Ropa Deportiva";
        producto3.codigo="23445";
        producto3.descripcion="Camiseta de Independiente";
        producto3.estado="Disponible";
        producto3.precio=343523.f;
        
        ListaClientes.add(cliente1);
        ListaClientes.add(cliente2);
        ListaClientes.add(cliente3);
        
        ListaEmpleados.add(empleado1);
        ListaEmpleados.add(empleado2);
        ListaEmpleados.add(empleado3);
        
        ListaEncargados.add(encargado1);
        ListaEncargados.add(encargado2);
        ListaEncargados.add(encargado3);
        
        ListaProductos.add(producto1);
        ListaProductos.add(producto2);
        ListaProductos.add(producto3);
        
        for(Cliente c1: ListaClientes){
        c1.mostrar();
                }
        
        for(Empleado e1: ListaEmpleados){
        e1.mostrar();
                }
        
        for(Encargado empleado: ListaEncargados){
        empleado.mostrar();
                }
        
        for(Producto p1: ListaProductos){
        p1.mostrar();
                }
        
        
        
        
    }
    
}
