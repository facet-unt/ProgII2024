package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private float precio;
    private String estado;

        public void mostrar() {
        System.out.println("Datos del producto");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Estado: " + estado);
    }
       
    public String toString(){
        return descripcion;
    }
    //constructor
    public Producto(String nombre, String descripcion, String estado, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }
    

    public String verEstado() {
        return estado;
    }

    public void asignarEstado(String estado) {
        this.estado = estado;
    }
    
    
}




