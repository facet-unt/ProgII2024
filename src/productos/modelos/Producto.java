package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public String nombre="Arroz";
    public String descripcion;
    public float precio=3.5f;
    public String estado="Disponible";

    public void mostrar() {        
        System.out.println(nombre);
        System.out.println(precio);        
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
       
}




