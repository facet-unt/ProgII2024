
package usuarios.modelos;

import pedidos.modelos.Pedido;
import java.util.ArrayList;

public class Cliente extends Usuario{
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    @Override
    public void mostrar(){
    super.mostrar();
        System.out.println("pedidos");
    for(Pedido p: pedidos)
            System.out.println(p.verNumero());
    }

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo,clave,apellido,nombre);
    }
    
    public void agrgarPedido(Pedido unpedido){
        this.pedidos.add(unpedido);
        
    }
}
