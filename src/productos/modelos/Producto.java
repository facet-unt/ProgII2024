package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
   
    private String descripcion;
    private float precio;
    private String estado;
    private int Codigo;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void mostrar(){
        System.out.println(descripcion);
        System.out.println(precio);
        System.out.println(estado);
        System.out.println(Codigo);
    }

    @Override
    public String toString() {
        return "El producto es: "+descripcion + Codigo;
    }
  
}

//Su codigo es: "+ Codigo+ "Su precio es: "+precio+"Su estado es: "+estado


