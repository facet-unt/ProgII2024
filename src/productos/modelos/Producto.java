package productos.modelos;

import usuarios.modelos.Cliente;
import java.util.ArrayList;
public class Producto {
    private int codigo;
    private String descripcion;
    private Estado estado;
    private Categoria categoria;
    private float precio;
    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */

    public void mostrar(){
    System.out.println("Codigo: "+ codigo);
    System.out.println("Descripcion: "+ descripcion);
    System.out.println("Categoria: "+ categoria);
    System.out.println("Estado: "+ estado);
    System.out.println("Precio: \n"+ precio);
    }

    public Producto(int codigo, String descripcion,Categoria categoria, Estado estado, float precio) {
        
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
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
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
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

    public Estado verEstado() {
        return estado;
    }

    public Categoria verCategoria() {
        return categoria;
    }
}




