package lib;

import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;


public class Main {
    public static void main(String[] args) {
        Producto unProducto = new Producto();
        Producto unProducto1= new Producto();
        unProducto.mostrar();
        unProducto.codigo=1;
        unProducto.nombre = "Pizza";
        unProducto.precio = 35.50f;
        unProducto.mostrar();
        System.out.println(unProducto.toString());
        
        ArrayList<Producto> lista =new  ArrayList<>();
        ArrayList<Cliente> listaCliente =new  ArrayList<>();
        
    }
}
