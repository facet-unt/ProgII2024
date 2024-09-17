package principal.controladores;

import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;

public class ControladorPrincipal {
    public static void main(String args[]){
    //Defino un ArrayList para cada clase
    ArrayList<Producto> Productos = new ArrayList<>();
    ArrayList<Cliente> Clientes = new ArrayList<>();
    ArrayList<Empleado> Empleados = new ArrayList<>();
    ArrayList<Encargado> Encargados = new ArrayList<>();
    
    //Instancio 3 objetos de cada clase
    Producto producto1 = new Producto();
    Productos.add(producto1);
    Producto producto2 = new Producto();
    Productos.add(producto2);
    Producto producto3 = new Producto();
    Productos.add(producto3);
    Cliente cliente1 = new Cliente();
    Clientes.add(cliente1);
    Cliente cliente2 = new Cliente();
    Clientes.add(cliente2);
    Cliente cliente3 = new Cliente();
    Clientes.add(cliente3);
    Empleado empleado1 = new Empleado();
    Empleados.add(empleado1);
    Empleado empleado2 = new Empleado();
    Empleados.add(empleado2);
    Empleado empleado3 = new Empleado();
    Empleados.add(empleado3);
    Encargado encargado1 = new Encargado();
    Encargados.add(encargado1);
    Encargado encargado2 = new Encargado();
    Encargados.add(encargado2);
    Encargado encargado3 = new Encargado();
    Encargados.add(encargado3);
    System.out.println("Muestro los ArrayList: ");
    //Recorro y muestro los ArrayList
    for(Producto p : Productos){
        System.out.println(p);
    }
    for(Cliente c : Clientes){
        System.out.println(c);
    }
    for(Empleado em : Empleados){
        System.out.println(em);
    }
    for(Encargado en : Encargados){
        System.out.println(en);
    }
    
    //Modifico el 2do elemento de cada ArrayList
    Producto actproducto = Productos.get(1);
    actproducto.Nombre = "Nuevo Nombre Producto";
    Cliente actcliente = Clientes.get(1);
    actcliente.Nombre = "Nuevo Nombre Cliente";
    Empleado actempleado = Empleados.get(1);
    actempleado.Nombre = "Nuevo Nombre Empleado";
    Encargado actencargado = Encargados.get(1);
    actencargado.Apellido = "Nuevo Apellido Encargado";
    
    System.out.println("Muestro los nuevos ArrayList");
    //Recorro y muestro los ArrayList ya actualizados
    for(Producto p : Productos){
        System.out.println(p);
    }
    for(Cliente c : Clientes){
        System.out.println(c);
    }
    for(Empleado em : Empleados){
        System.out.println(em);
    }
    for(Encargado en : Encargados){
        System.out.println(en);
    }
    actproducto.mostrar();
    }
    
}
