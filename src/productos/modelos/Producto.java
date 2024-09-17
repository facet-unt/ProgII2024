package productos.modelos;

public class Producto {
    public int codigo;
    public String nombre;
    public String descripcion;
    public float precio;
    public String estado;

    public void mostrar() {
        System.out.println("Datos del producto");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Estado: " + estado);
    }

    @Override
    public String toString() {
        return "Producto" + "nombre" + nombre + ", descripcion" + descripcion + '}';
    }

//    public String toString(){
//        return descripcion;
//    }

}
