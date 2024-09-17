package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {

    public String nombre;
    private int codigo;
    private String descripcion;
    private float precio;
    private String estado;
    private String correo;

    /**
     * Este método permite mostrar un Producto
     */
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
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }

    public Producto(String nombre, int codigo, String descripcion, float precio, String estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public Producto(String c, String a, String n) {
        this(c, "123466", a, n);
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
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

    public void asignarApellido(float precio) {
        this.precio = precio;
    }
    
    public String verEstado() {
        return estado;
    }

    public void asignarEstado(String estado) {
        this.estado = estado;
    }

}
