
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author Gisela
 */
public class Empleado extends Usuario {
    
    public Empleado(String correo, String clave, String apellido, String nombre) {
       super(correo,clave,apellido,nombre); //llamo al constructor de la super clase 
    }
    //clase abstracta que se hereda de una super clase
    @Override
    public ArrayList<Pedido> verPedidos() {
       return new ArrayList<Pedido>();
    }
   
     
}
