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
public class controladorPrincipal {

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


       Producto1.nombre="Gaseosa1";
       Producto1.descripcion="Gaseosa";
       Producto1.estado="Con stock";
       Producto1.precio= 1220f;

       Producto2.nombre="Alfajor1";
       Producto2.descripcion="Alfajor";
       Producto2.estado="Sin stock";
       Producto2.precio= 600f;

       Producto3.nombre="Agua1";
       Producto3.descripcion="Agua";
       Producto3.estado="Con stock";
       Producto3.precio= 800f;

       Cliente1.apellid="Martinez";
       Cliente1.nombre="Marcos";
       Cliente1.correo="marcos@martinez.com";
       Cliente1.clave="12345";

       Cliente2.apellido="Marquez";
       Cliente2.nombre="Ricardo";
       Cliente2.correo="ricador@marquez.com";
       Cliente2.clave="12345";

       Cliente3.apellido="Lopez";
       Cliente3.nombre="Sandra";
       Cliente3.correo="sandra@lopez.com";
       Cliente3.clave="12345";

       Encargado1.apellido = "Pereira";
       Encargado1.nombre = "Maria";
       Encargado1.correo = "maria@gpereira.coma";
       Encargado1.clave="12345";

       Encargado2.apellido = "Gerez";
       Encargado2.nombre = "Sabrina";
       Encargado2.correo = "sabrina@gerez.com";
       Encargado2.clave="12345";

       Encargado3.apellido = "Perez";
       Encargado3.nombre = "Mauricio";
       Encargado3.correo = "mauricio@perez.com";
       Encargado3.clave="12345";


       Empleado1.apellido="Martinez";
       Empleado1.nombre="Mario";
       Empleado1.correo="mario@martinez.com";
       Empleado1.clave="12345";

       Empleado2.apellido="Marquez";
       Empleado2.nombre="Maria";
       Empleado2.correo="maria@marquez.com";
       Empleado2.clave="12345";

       Empleado3.apellido="Pereira";
       Empleado3.nombre="Melanie";
       Empleado3.correo="melanie@pereira.com";
       Empleado3.clave="12345";
         
        
          
                
        for (Producto producto :Productos){
          producto.mostrar();
          System.out.println(producto);
          System.out.println("");
     
        
    }
         for (Cliente Cliente :Clientes){
          Cliente.mostrar();
          System.out.println("");
     
        
    }
         
         for (Empleado Empleado :Empleados){
          Empleado.mostrar();
          System.out.println("");
     
        
    }
         
         for (Encargado Encargado :Encargados){
          Encargado.mostrar();
          System.out.println("");
     
        
    }
}
}
