/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import productos.modelos.Producto;

public class Empleado {

    public static void main(String[] args) {
        Producto unProducto = new Producto();
        unProducto.mostrar();
        unProducto.nombre = "Pizza";
        unProducto.codigo = 1;
        unProducto.precio = 35.50f;
        unProducto.mostrar();
        System.out.println(unProducto.toString());
    }

/**
 *
 * @author estudiante
 */
public class Empleado {
    
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;
    
    public void mostrar() {
        System.out.println("Datos del empleado");
        System.out.println("Correo: " + correo);
        System.out.println("Clave: " + clave);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
    }
}
