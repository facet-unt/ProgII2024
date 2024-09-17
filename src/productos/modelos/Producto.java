package productos.modelos;

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
        System.out.println(nombre);
        System.out.println(precio);        
    }

    @Override
    public String toString() {
        return "Producto" + "nombre" + nombre + ", descripcion" + descripcion + '}';
    }
       
    
}
