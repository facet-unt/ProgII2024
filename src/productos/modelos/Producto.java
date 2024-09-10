package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public String codigo;
    public String descripcion;
    public float precio;
    public String estado;
    public String categoria;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */
    void mostrar(){
    System.out.println("Codigo: "+ codigo + "Descripcion: "+ descripcion + "Categoria: "+ categoria + "Estado: "+ estado + "Precio: "+ precio);
    }
    
       
}




