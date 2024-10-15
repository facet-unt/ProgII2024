
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario {
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    @Override
    public ArrayList<Pedido> verPedidos(){
    }
    
    
    
    public void cancelarPedido(Pedido pedido){
    if(pedidos.contains(pedido)){
        pedidos.remove(pedido);
    }
    }
    
   public void agregarPedido(Pedido pedido){
       int posicion;
       if(!pedidos.contains(pedido)){
           pedidos.add(pedido);
       }else{
           posicion = pedidos.indexOf(pedido);
           pedidos.set(posicion, pedido);
       
       }
   
   }
      
    
    
    

}
