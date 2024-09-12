
package principal.controladores;

import java.util.ArrayList;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import productos.modelos.Producto;

public class ControladorPrincipal {
    
    
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
      
        Cliente uncliente = new Cliente();
        Cliente uncliente1 = new Cliente();
        Cliente uncliente2 = new Cliente();
        
        clientes.add(uncliente);
        clientes.add(uncliente1);
        clientes.add(uncliente2);
        
        Empleado unempleado = new Empleado();
        Empleado unempleado1 = new Empleado();
        Empleado unempleado2 = new Empleado();
        
        empleados.add(unempleado);
        empleados.add(unempleado1);
        empleados.add(unempleado2);
        
        Encargado unencargado = new Encargado();
        Encargado unencargado1 = new Encargado();
        Encargado unencargado2 = new Encargado();
           
        encargados.add(unencargado);
        encargados.add(unencargado1);
        encargados.add(unencargado2);
        
        Producto unproducto = new Producto();
        Producto unproducto1 = new Producto();
        Producto unproducto2 = new Producto();
        
        productos.add(unproducto);
        productos.add(unproducto1);
        productos.add(unproducto2);
        
        for (Cliente cliente : clientes){
            cliente.mostrar();
        }
        
        for (Empleado empleado : empleados){
            empleado.mostrar();
        }
        
        for (Encargado encargado : encargados){
            encargado.mostrar();
        }
        
        for (Producto producto : productos){
            producto.mostrar();
        }
    }
}
