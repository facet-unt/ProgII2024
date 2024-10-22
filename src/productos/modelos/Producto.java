package productos.modelos;

import usuarios.modelos.Cliente;
import productos.modelos.Categoria;
import productos.modelos.Estado;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;
    private Estado estado;
    private Categoria categoria;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */

    public void mostrar(){
    System.out.println("Codigo: "+ codigo + "\nDescripcion: "+ descripcion + "\nCategoria: "+ categoria + "\nEstado: "+ estado + "\nPrecio: "+ precio);
    }

    public Producto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
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

    public String verEstado() {
        return estado.toString();
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public String verCategoria() {
        return categoria.toString();
    }

    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }    
    
    @Override
    
    public boolean equals(Object objeto){
        if (this == objeto){
            return true;
        }
        if (objeto == null || getClass() != objeto.getClass()){
            return false;
        }
        Producto p  = (Producto) objeto;
        return codigo == p.verCodigo();
    }
}




