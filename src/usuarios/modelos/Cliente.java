
package usuarios.modelos;

import java.util.ArrayList;
import java.util.HashSet;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario{
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    // Definicion de los constructores

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    // Metodos para ver agregar y borrar pedido
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return pedidos;
    }
    
    // Metodo que agrega pedido, si esta lo sobreescribe
    public void agregarPedido(Pedido pedido) {
        if (!pedidos.contains(pedido))
            pedidos.add(pedido);
        else {
            int indice = pedidos.indexOf(pedido);
            pedidos.set(indice, pedido);
        }
    }
    
    public void cancelarPedido(Pedido pedido)
    {
        if (pedidos.contains(pedido))
            pedidos.remove(pedido);
    }
}
