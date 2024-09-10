package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
   
    public String descripcion;
    public float precio;
    public String estado;
    public int Codigo;

    public void mostrar(){
        System.out.println(descripcion);
        System.out.println(precio);
        System.out.println(estado);
        System.out.println(Codigo);
    }

    @Override
    public String toString() {
        return "El producto es: "+descripcion;
    }
  
}

//Su codigo es: "+ Codigo+ "Su precio es: "+precio+"Su estado es: "+estado


