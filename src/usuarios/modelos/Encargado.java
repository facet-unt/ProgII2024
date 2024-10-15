    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author estudiante
 */
public class Encargado extends Usuario {
    
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    // Definicion del constructor que llama al super
    
    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
    
    // Override del metodo verPedidos para que compile
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return pedidos;
    }
}