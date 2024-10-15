/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author estudiante
 */
public class Empleado extends Usuario{
    
    
    public void mostrar(){
        System.out.println(super.verCorreo()+"\n"+super.verApellido()+"\n"+super.verNombre());
    }
    //Métodos get/set
    @Override
    public String verCorreo() {
        return super.verCorreo();
    }
    
    @Override
    public void asignarCorreo(String correo) {
        super.asignarCorreo(correo);
    }

    @Override
    public String verClave() {
        return super.verClave();
    }

    @Override
    public void asignarClave(String clave) {
        super.asignarClave(clave);
    }
    
    @Override
    public String verApellido() {
        return super.verApellido();
    }
    
    @Override
    public void asignarApellido(String apellido) {
        super.asignarApellido(apellido);
    }
    
    @Override
    public String verNombre() {
        return super.verNombre();
    }

    @Override
    public void asignarNombre(String nombre) {
        super.asignarNombre(nombre);
    }
    
    @Override
    public ArrayList<Pedido> verPedidos(){
        return new ArrayList();
    }
    //Constructor de la clase
    public Empleado(String correo, String clave, String apellido, String nombre ){
        super(correo, clave, apellido, nombre); 
    }
}