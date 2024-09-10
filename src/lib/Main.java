package lib;

import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> ListaProducto = new ArrayList<>();
        ArrayList<Cliente> ListaCliente = new ArrayList<>();
        ArrayList<Empleado> ListaEmpleado = new ArrayList<>();
        ArrayList<Encargado> ListaEncargado = new ArrayList<>();
        
        Producto unProducto = new Producto();
        Producto unProducto2 = new Producto();
        Producto unProducto3 = new Producto();

        Cliente unCliente1 = new Cliente();
        Cliente unCliente2 = new Cliente();
        Cliente unCliente3 = new Cliente();
       
        Empleado unEmpleado1 = new Empleado();
        Empleado unEmpleado2 = new Empleado();
        Empleado unEmpleado3 = new Empleado();
        
        Encargado unEncargado1 = new Encargado();
        Encargado unEncargado2 = new Encargado();
        Encargado unEncargado3 = new Encargado();
        
        unProducto.mostrar();
        unProducto.nombre = "Pizza";
        unProducto.codigo = 1;
        unProducto.precio = 35.50f;
        unProducto.mostrar();
        System.out.println(unProducto.toString());
        
        ListaProducto.add(unProducto);
        ListaProducto.add(unProducto2);
        ListaProducto.add(unProducto3);
        
        ListaCliente.add(unCliente1);
        ListaCliente.add(unCliente2);
        ListaCliente.add(unCliente3);
        
        ListaEmpleado.add(unEmpleado1);
        ListaEmpleado.add(unEmpleado2);
        ListaEmpleado.add(unEmpleado3);
        
        ListaEncargado.add(unEncargado1);
        ListaEncargado.add(unEncargado2);
        ListaEncargado.add(unEncargado3);
    }

}
