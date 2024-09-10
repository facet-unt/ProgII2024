package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public String nombre;
    public String descripcion;
    public float precio;
    public String estado;        
    public void mostrar(){
        System.out.println(nombre+"\n"+descripcion+"\n"+precio+"\n"+estado);
    }    
    @Override
    public String toString(){
        return descripcion;
    }
}




