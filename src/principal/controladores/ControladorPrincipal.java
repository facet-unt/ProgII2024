/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.util.ArrayList;
import productos.modelos.Producto;

public class ControladorPrincipal {

    public static void main(String[] args) {
        Producto unProducto = new Producto();
        unProducto.mostrar();
        unProducto.nombre = "Pizza";
        unProducto.codigo = 1;
        unProducto.precio = 35.50f;
        unProducto.mostrar();
        System.out.println(unProducto.toString());
        
        ArrayList<Producto>ListaProducto= new ArrayList<>();
                
    }

}
