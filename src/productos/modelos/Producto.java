package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;
    private EstadoProducto estado;
    private CategoriaProducto categoria;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */

    public void mostrar(){
    System.out.println("Codigo: "+ codigo + "\nDescripcion: "+ descripcion + "\nCategoria: "+ categoria + "\nEstado: "+ estado + "\nPrecio: "+ precio);
    }

    public Producto(int codigo, String descripcion, EstadoProducto estado, CategoriaProducto categoria, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.categoria = categoria;
    }
    
    public String toString(){
        return "Producto{" +
               "Código=" + codigo +
               ", Descripción='" + descripcion +
               ", Precio=" + precio +
               ", Estado=" + estado +
               ", Categoría=" + categoria +
               '}';
        
    }
    
    
    public int verCodigo() {
        return codigo;
    }

    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }

    public EstadoProducto verEstado() {
        return estado;
    }

    public void asignarEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public CategoriaProducto verCategoria() {
        return categoria;
    }

    public void asignarCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
}




