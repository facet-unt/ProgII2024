package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private float precio;
    private String estado;

    /**
   
     * @return devuelve nada
     */
    
    
    
    public Producto(int codigo, String nombre, String descripcion, float precio, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

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
}




