
package usuarios.modelos;

import pedidos.modelos.Pedido;
import java.util.ArrayList;

public class Cliente {
    
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public void mostrar(){
    System.out.println("Correo: "+ correo);
    System.out.println("Clave: "+ clave); 
    System.out.println("Cliente: "+ apellido +" "+nombre);
        System.out.println("pedidos");
    for(Pedido p: pedidos)
       
            System.out.println(p.verNumero());
    }

    public Cliente(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public void agrgarPedido(Pedido unpedido){
        this.pedidos.add(unpedido);
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
}
