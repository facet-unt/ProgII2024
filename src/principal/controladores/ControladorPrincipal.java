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
        Cliente cliente2= new Cliente();
        Cliente cliente3= new Cliente();
        
        Empleado empleado1= new Empleado();
        Empleado empleado2= new Empleado();
        Empleado empleado3= new Empleado();
        
        Encargado encargado1= new Encargado();
        Encargado encargado2= new Encargado();
        Encargado encargado3= new Encargado();
        
        Producto producto1= new Producto();
        Producto producto2= new Producto();
        Producto producto3= new Producto();
        
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
        System.out.println(c1);
                }
        
        for(Empleado e1: ListaEmpleados){
        System.out.println(e1);
                }
        
        for(Encargado empleado: ListaEncargados){
        System.out.println(empleado);
                }
        
        for(Producto p1: ListaProductos){
        System.out.println(p1);
                }
        
        
        
        
    }
    
}
