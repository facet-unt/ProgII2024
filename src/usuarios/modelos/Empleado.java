/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import productos.modelos.Producto;

public class Empleado {

    /*    public static void main(String[] args) {
        Producto unProducto = new Producto();
        unProducto.mostrar();
        unProducto.nombre = "Pizza";
        unProducto.codigo = 1;
        unProducto.precio = 35.50f;
        unProducto.mostrar();
        System.out.println(unProducto.toString());
    }*/
    
   
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;

    public void mostrar() {
        System.out.println("Datos del empleado");
        System.out.println("Correo: " + correo);
        System.out.println("Clave: " + clave);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);

    }

    public Empleado(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Empleado(String c, String a, String n) {
        this(c, "123466", a, n);
    }

    public String verCorreo() {
        return correo;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
}
