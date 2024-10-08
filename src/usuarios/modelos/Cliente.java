package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario {

    
    private ArrayList<Pedido> listaPedidos;

    

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }

    //para que esta esto?
    public Cliente(String c, String a, String n) {
        this(c, "123466", a, n);
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
