package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

public class Cliente extends Usuario {
    
     private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    public ArrayList<Pedido> verPedidos() {
        return pedidos;
    }
        
//    public Cliente(String c, String a, String n) {
//        this(c, "123466", a, n);   
//    }

}
