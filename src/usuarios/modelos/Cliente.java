
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario{
    
    
    private ArrayList<Pedido> pedidos=new ArrayList();
    
    @Override
    public void mostrar() {
        System.out.println("Datos del cliente");
        System.out.println("Correo: " + super.verCorreo());
        System.out.println("Clave: " + super.verClave());
        System.out.println("Apellido: " + super.verApellido());
        System.out.println("Nombre: " + super.verNombre());
    }

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
        
    public Cliente(String c, String a, String n) {
        super(c, "123466", a, n);   
    }
    
    @Override 
    public String verCorreo() {
        return super.verCorreo();
    }

    public void asignarCorreo(String correo) {
        super.asignarCorreo(correo);
    }

    public String verClave() {
        return super.verClave();
    }

    public void asignarClave(String clave) {
        super.asignarClave(clave);
    }

    public String verApellido() {
        return super.verApellido();
    }

    public void asignarApellido(String apellido) {
        super.asignarApellido(apellido);
    }

    public String verNombre() {
        return super.verNombre();
    }

    public void asignarNombre(String nombre) {
        super.asignarNombre(nombre);
    }
    
    public ArrayList<Pedido> verPedidos(){
        return new ArrayList<>(this.pedidos);
    }
    //Aquí no debería hacer ningún control, ya que con mi increible intelecto he craneado
    //una forma en que no hay manera que dos pedidos tengan el mismo número, pero mi genio
    //se ve limitado por una planeación diferente
    public void agregarPedido(Pedido pedido){
        if (!pedidos.contains(pedido)){
            pedidos.add(pedido);
        }
    }
    
    public void cancelarPedido(Pedido pedido){
        if (pedidos.contains(pedido)){
            pedidos.remove(pedido);
        }else{
            System.out.println("No se encuentra el pedido especificado.\n");
        }
    }

}
