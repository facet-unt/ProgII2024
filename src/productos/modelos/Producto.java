package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    private int codigo;
    private String descripcion;
    private String categoria;
    private String estado;
    private float precio;
    

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */
    public void mostrar() {        
        System.out.println("Producto: "+codigo + " - "+ descripcion + " precio $:"+ precio);
    }
       
    public String toString(){
        return descripcion;
    }

    public Producto(int codigo, String descripcion,String categoria,  String estado, float precio) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }
    
    
    

    public int verCodigo() {
        return codigo;
    }

    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String verCategoria() {
        return categoria;
    }

    public void asignarCategoria(String categoria) {
        this.categoria = categoria;
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
        return estado;
    }

    public void asinarEstado(String estado) {
        this.estado = estado;
    }
    
    
}




