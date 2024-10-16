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

public class Empleado extends Usuario {

    public Empleado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }

    @Override
    public ArrayList<Pedido> verPedidos() {
        return new ArrayList<Pedido>();
    }
}
