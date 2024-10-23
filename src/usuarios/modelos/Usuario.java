/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import pedidos.modelos.Pedido;

/**
 *
 * @author 54381
 */
/*ENUCrear la clase Usuario en el paquete usuarios.modelos
● Agregar como variables de instancia aquellos atributos comunes a las clases Cliente, Empleado y
Encargado.
● Constructores y métodos get/set que considere necesarios
● Hacerla abstracta. ¿Qué implica esto? ¿Cómo se implementa?
● Método mostrar() con la misma funcionalidad que el de las clases Cliente, Empleado y Encargado.*/
public abstract class Usuario implements Comparable<Usuario>{
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    protected List<Pedido>listaPedidos = new ArrayList<>();
    private String claverepetida;
    private Perfil perfil;

    public Usuario(String correo, String clave, String apellido, String nombre, String claverepetida, Perfil perfil) {
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.claverepetida = claverepetida;
        this.perfil = perfil;
    }

    public String verClaverepetida() {
        return claverepetida;
    }

    public void asignarClaverepetida(String claverepetida) {
        this.claverepetida = claverepetida;
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

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }


    public void asignarPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
   
    public abstract List<Pedido> verPedidos();
    
 public void mostrar(){
    System.out.println("Correo: "+ correo + "\nClave: "+ clave + "\nApellido: "+ apellido + "\nNombre: "+ nombre);
    }
 
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.correo);
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

        final Usuario other = (Usuario) obj;
        return Objects.equals(this.correo, other.correo);
    }
    
    

    @Override
    public int compareTo(Usuario o){
        if(this.apellido.equals(o.apellido)){
        return this.nombre.compareTo(o.nombre);
        }
        return this.apellido.compareTo(o.apellido);
    }

    
    }