package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public int codigo;
    public String nombre;
    public String descripcion;
    public float precio;
    public String estado;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */
    public void mostrar() {        
       // System.out.println(nombre);
       // System.out.println(precio);     
        System.out.println("Producto: "+codigo + " - "+ nombre + " precio $:"+ precio);
    }
       
    public String toString(){
        return descripcion;
    }
}




