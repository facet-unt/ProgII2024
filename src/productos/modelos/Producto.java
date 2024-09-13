package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public String nombre;
    public String descripcion;
    public float precio;
    public String estado;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */
    public void mostrar() {        
        System.out.println("Nombre:" +nombre);
        System.out.println("Precio:" +precio);
        
        
        
    }
       
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Descripcion: " + descripcion;
    }


}




