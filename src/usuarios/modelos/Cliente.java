
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;
import java.util.ArrayList;
import java.util.List;
import pedidos.modelos.Pedido;
/*4. A la clase Cliente: hacerla subclase de Usuario y realizar las modificaciones que considere
necesarias. Como se ve son visibles las modificaciones en el*/
public class Cliente extends Usuario {

    public Cliente(String correo, String clave, String apellido, String nombre, String claverepetida, Perfil perfil) {
        super(correo, clave, apellido, nombre, claverepetida, perfil); // Llama al constructor de Usuario
    }

//    public Cliente(String correo, String apellido, String nombre) {
//        this(correo, apellido,nombre,"123466"); // Llama al constructor con clave por defecto
//    }

    @Override
    public void mostrar() {
        System.out.println("Cliente: " + this.verApellido() + ", " + this.verNombre());
        super.mostrar(); // Llama al método mostrar de la superclase
    }

    @Override
public List<Pedido> verPedidos() {
    return listaPedidos; // Devuelve directamente la lista de pedidos
}
public void asignarListaPedidos(Pedido p) {
        if(!listaPedidos.contains(p))
        listaPedidos.add(p);
    }
    
    public void agregarPedido(Pedido p){
        p.AsignarCliente(this);
        if(listaPedidos.contains(p)){
            for (Pedido p2 : listaPedidos){
                if(p.equals(p2)){
                    listaPedidos.remove(p2);
                    listaPedidos.add(p);
                }
            }
        } else{
            listaPedidos.add(p);
        }
    }
    public void cancelarPedido(Pedido p){
        if(listaPedidos.contains(p)){
            listaPedidos.remove(p);
        }
    
    }       
}




