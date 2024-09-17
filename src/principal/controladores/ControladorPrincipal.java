package principal.controladores;

import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;

public class ControladorPrincipal {
    public static void main(String[] args) {
        
        ArrayList<Encargado> listaDeEncargados = new ArrayList<Encargado>();
        ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();
        ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
        
        
        Encargado encargado1 = new Encargado();
        Encargado encargado2 = new Encargado();
        Encargado encargado3 = new Encargado();
        
        listaDeEncargados.add(encargado1);
        listaDeEncargados.add(encargado2);
        listaDeEncargados.add(encargado3);

        for(Encargado e : listaDeEncargados){
            e.mostrar();
        }
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();

        listaDeEmpleados.add(empleado1);
        listaDeEmpleados.add(empleado2);
        listaDeEmpleados.add(empleado3);

        for(Empleado em : listaDeEmpleados){
            em.mostrar();
        }
        
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        listaDeProductos.add(producto1);
        listaDeProductos.add(producto2);
        listaDeProductos.add(producto3);
        
        for(Producto p : listaDeProductos){
            p.mostrar();
        }
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        listaDeClientes.add(cliente1);
        listaDeClientes.add(cliente2);
        listaDeClientes.add(cliente3);
        
        for(Cliente c : listaDeClientes){
            c.mostrar();
        }
    }
}
