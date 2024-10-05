package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Cliente {

    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    private ArrayList<Pedido> listaPedidos;

    public void mostrar() {
        System.out.println("Correo: " + correo + "\nClave: " + clave + "\nApellido: " + apellido + "\nNombre: " + nombre);
    }

    public Cliente(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Cliente(String c, String a, String n) {
        this(c, "123466", a, n);
    }

    public String verCorreo() {
        return correo;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> verPedidos() {
        return listaPedidos;
    }

    /*
    metodo para agreagar pedidos
    public void agregarPedidos(Pedido unPedido) {
        pedidos.add(unPedido);
    }
     */
}
