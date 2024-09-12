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
        ArrayList<Cliente> Clientes = new ArrayList();
            ArrayList<Producto> Productos = new ArrayList();
                ArrayList<Encargado> Encargados = new ArrayList();
                    ArrayList<Empleado> Empleados = new ArrayList();

        Producto Producto1 = new Producto();
        Producto Producto2 = new Producto();
        Producto Producto3 = new Producto();

            
        Cliente Cliente1 = new Cliente();
        Cliente Cliente2 = new Cliente();
        Cliente Cliente3 = new Cliente();
            

        Encargado Encargado1 = new Encargado();
        Encargado Encargado2 = new Encargado();
        Encargado Encargado3 = new Encargado();
           
        Empleado Empleado1 = new Empleado();
        Empleado Empleado2 = new Empleado();
        Empleado Empleado3 = new Empleado();



        Productos.add(Producto1);
        Productos.add(Producto2);
        Productos.add(Producto3);

        Clientes.add(Cliente1);
        Clientes.add(Cliente2);
        Clientes.add(Cliente3);

        Encargados.add(Encargado1);
        Encargados.add(Encargado2);
        Encargados.add(Encargado3);

        Empleados.add(Empleado1);
        Empleados.add(Empleado2);
        Empleados.add(Empleado3);


       Producto1.Codigo=1234;
       Producto1.descripcion="Gaseosa";
       Producto1.estado="Con stock";
       Producto1.precio= 1220f;

       Producto2.Codigo=12345;
       Producto2.descripcion="Alfajor";
       Producto2.estado="Sin stock";
       Producto2.precio= 600f;

       Producto3.Codigo=123456;
       Producto3.descripcion="Agua";
       Producto3.estado="Con stock";
       Producto3.precio= 800f;

       Cliente1.Apellido="Martinez";
       Cliente1.Nombre="Marcos";
       Cliente1.Correo="marcos@martinez.com";
       Cliente1.Clave="12345";

       Cliente2.Apellido="Marquez";
       Cliente2.Nombre="Ricardo";
       Cliente2.Correo="ricador@marquez.com";
       Cliente2.Clave="12345";

       Cliente3.Apellido="Lopez";
       Cliente3.Nombre="Sandra";
       Cliente3.Correo="sandra@lopez.com";
       Cliente3.Clave="12345";

       Encargado1.Apellido = "Pereira";
       Encargado1.Nombre = "Maria";
       Encargado1.Correo = "maria@gpereira.coma";
       Encargado1.Clave="12345";

       Encargado2.Apellido = "Gerez";
       Encargado2.Nombre = "Sabrina";
       Encargado2.Correo = "sabrina@gerez.com";
       Encargado2.Clave="12345";

       Encargado3.Apellido = "Perez";
       Encargado3.Nombre = "Mauricio";
       Encargado3.Correo = "mauricio@perez.com";
       Encargado3.Clave="12345";


       Empleado1.Apellido="Martinez";
       Empleado1.Nombre="Mario";
       Empleado1.Correo="mario@martinez.com";
       Empleado1.Clave="12345";

       Empleado2.Apellido="Marquez";
       Empleado2.Nombre="Maria";
       Empleado2.Correo="maria@marquez.com";
       Empleado2.Clave="12345";

       Empleado3.Apellido="Pereira";
       Empleado3.Nombre="Melanie";
       Empleado3.Correo="melanie@pereira.com";
       Empleado3.Clave="12345";
         
        
                  
                
        for (Producto producto : Productos) {
            Producto.mostrar();
            System.out.println("");
            
        }


        for (Cliente cliente : Clientes) {
            Cliente.mostrar();
            System.out.println("");
            
        }


        for (Encargado encargado : Encargados) {
            Encargado.mostrar();
            System.out.println("");
            
        }



        for (Empleado empleado : Empleados) {
            Empleado.mostrar();
            System.out.println("");
            
        }

        
    }
}
