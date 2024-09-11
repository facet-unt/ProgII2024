/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Encargado;
import usuarios.modelos.Empleado;
/**
 *
 * @author estudiante
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        //Nuevo producto
        Producto unProducto = new Producto();
        
        unProducto.precio = 6000;
        unProducto.nombre = "Pizza";
        unProducto.descripcion = "Napolitana ";
        
        ArrayList<Producto> infoProducto = new ArrayList<>();
        
        infoProducto.add(unProducto); //se guarda en su correspondiente arrayList
        
        for(Producto prod: infoProducto){
            System.out.println(prod);
        }
        //Se agrega un cliente
        
        Cliente unCliente = new Cliente();
        unCliente.correo= "pabjuar@gmail.com";
        unCliente.clave = "398483";
        unCliente.nombre = "Pablo";
        unCliente.apellido = "Juarez ";
        //
        ArrayList<Cliente> infoCliente = new ArrayList<>();
        
        infoCliente.add(unCliente);
        
        System.out.println("Cliente: \n -------");
        for(Cliente clnt: infoCliente){
            System.out.println(clnt);
        }
        
        //Se agrega un Encargado
        
        Encargado unEncargado= new Encargado();
        unEncargado.correo= "germanges@gmail.com";
        unEncargado.clave = "232356";
        unEncargado.nombre = "German";
        unEncargado.apellido = "Gutierrez ";
        
        ArrayList<Encargado> infoEncargado = new ArrayList<>();
        
        infoEncargado.add(unEncargado);
        
        System.out.println("Encargado: \n -------");
        for(Encargado encargado: infoEncargado){
            System.out.println(encargado);
        }
        
        //Se agrega un Empleado
        
        Empleado unEmpleado= new Empleado();
        unEmpleado.correo= "Marslz@gmail.com";
        unEmpleado.clave = "232356";
        unEmpleado.nombre = "Martin";
        unEmpleado.apellido = "Salazar ";
        
        ArrayList<Empleado> infoEmpleado = new ArrayList<>();
        
        infoEmpleado.add(unEmpleado); //se guarda en su correspondiente arrayList
        
        System.out.println("Empleado: \n -------");
        for(Empleado emp: infoEmpleado){
            System.out.println(emp);
        }
        
        
       
    }
    
}
