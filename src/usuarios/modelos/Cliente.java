/*
 * Copyright (c) 2024, Lucas Ahumada Checa   &   Juan Pablo Rearte
 * Todos los derechos reservados.
 *
 * Este código es propiedad de [Lucas Ahumada Checa   &   Juan Pablo Rearte] y no puede ser utilizado
 * sin permiso explícito.
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario {

    private ArrayList<Pedido> pedidos;

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido unPedido) {

        if (!this.pedidos.contains(unPedido)) {
            this.pedidos.add(unPedido);
            System.out.println("El pedido se agrego.");
            System.out.println();
        } else {
            this.pedidos.remove(unPedido);
            this.pedidos.add(unPedido);
            System.out.println("El pedido fue reemplazado.");

            System.out.println();
        }
    }

    public void cancelarPedido(Pedido pedidoACancelar) {
        if (this.pedidos.contains(pedidoACancelar)) {
            this.pedidos.remove(pedidoACancelar);
            System.out.println("Se cancelo el pedido.");
        } else {
            System.out.println("El pedido no existe.");
        }

    }

    @Override
    public ArrayList<Pedido> verPedidos() {
        return this.pedidos;
    }
}
