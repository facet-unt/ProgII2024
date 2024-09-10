package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public String nombre;
    public int codigo;  
    public String descripcion;
    public float precio;
    public String estado;

    /**
     * Este método permite mostrar un Producto
     */
    public void mostrar() {        
        System.out.println(nombre);
        System.out.println(precio);        
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
       
   
   
}




