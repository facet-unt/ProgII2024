package principal.controladores;


/**
 *
 * @author rodrigoAndres
 */

import java.util.ArrayList;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import productos.modelos.Producto;

public class ControladorPrincipal {
    
    public static void main(String[] args){
        
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
        ArrayList<Empleado> arrayEmpleados = new ArrayList<>();
        ArrayList<Encargado> arrayEncargados = new ArrayList<>();
        ArrayList<Producto> arrayProductos = new ArrayList<>();
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        arrayClientes.add(cliente1);
        arrayClientes.add(cliente2);
        arrayClientes.add(cliente3);
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        arrayEmpleados.add(empleado1);
        arrayEmpleados.add(empleado2);
        arrayEmpleados.add(empleado3);
        
        Encargado encargado1 = new Encargado();
        Encargado encargado2 = new Encargado();
        Encargado encargado3 = new Encargado();
        arrayEncargados.add(encargado1);
        arrayEncargados.add(encargado2);        
        arrayEncargados.add(encargado3);

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();
        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);
        
        for(Cliente index: arrayClientes){
            index.mostrar();
        }
        
        for(Empleado index: arrayEmpleados){
            index.mostrar();
        }
        
        for(Encargado index: arrayEncargados){
            index.mostrar();
        }
       
        for(Producto index: arrayProductos){
            index.mostrar();
        }
  
  
        
    }
    
}
