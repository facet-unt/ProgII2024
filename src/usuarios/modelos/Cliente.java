package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario {

    private ArrayList<Pedido> listaPedidos;

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
        listaPedidos = new ArrayList<Pedido>();
    }

    //para que esta este costructor?
    public Cliente(String c, String a, String n) {
        this(c, "123466", a, n);
    }

    @Override
    public ArrayList<Pedido> verPedidos() {
        return listaPedidos;
    }

    public void agregarPedido(Pedido unPedido) {

        if (!listaPedidos.contains(unPedido)) {
            listaPedidos.add(unPedido);
        } else {
            int indice = this.listaPedidos.indexOf(unPedido);
            this.listaPedidos.set(indice, unPedido);
        }

    }

    public void cancelarPedido(Pedido unPedido) {
        if (listaPedidos.contains(unPedido)) {
            listaPedidos.remove(unPedido);
        }

    }
}
