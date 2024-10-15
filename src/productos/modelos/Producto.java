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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }
    
    

    public Producto(int codigo, String descripcion, CategoriaProducto categoria, EstadoProducto estado, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.categoria = categoria;
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




