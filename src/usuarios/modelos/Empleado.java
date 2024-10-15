package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Empleado extends Usuario{
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public Empleado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return pedidos;
    }
}