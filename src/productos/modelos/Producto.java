package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public String nombre;
    public String descripcion;
    public float precio;
    public String estado;
    public int codigo;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */
    public void mostrar() {        
        System.out.println(nombre);
        System.out.println(precio);        
    }
       
    
    
}




