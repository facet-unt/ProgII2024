
package usuarios.modelos;

import pedidos.modelos.Pedido;
import java.util.ArrayList;
import java.util.Objects;

public class Cliente extends Usuario{
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    @Override                                      //se redefine el metodo mostrar
    public void mostrar(){
    super.mostrar();
    for(Pedido p: pedidos)
       
            System.out.println(p.verNumero());
    }

    public Cliente(String correo, String clave, String apellido, String nombre) {
       super(correo,clave,apellido,nombre);        //se llama al constructor de la super clase
    }
    
    public void agregarPedido(Pedido pedido){         //agrego los pedidos a la lista 
        if(!pedidos.contains(pedido))
         pedidos.add(pedido);
        
    }
    
    public void cancelarPedido(Pedido pedido){        // cancelo pedidos que estan en la lista
          if(pedidos.contains(pedido))
              pedidos.remove(pedido);
    }
    
    @Override                                             // metodo abstracto que se hereda de la super clase y devulve una lista de pedidos
    public ArrayList<Pedido> verPedidos() {
        return pedidos;
    }   

    @Override                                    // comparo si 2  clientes tiene pedidos repetidos
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.pedidos, other.pedidos)) {
            return false;
        }
        return true;
    }
    
}
