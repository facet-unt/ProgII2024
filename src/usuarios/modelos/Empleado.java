/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
package usuarios.modelos;


 
 

import java.util.List;
import pedidos.modelos.Pedido;
/*5. A la clase Empleado: hacerla subclase de Usuario y realizar las modificaciones que considere
necesarias.*/
public class Empleado extends Usuario {

    public Empleado(String correo, String apellido, String nombre, String clave) {
        super(correo, apellido, nombre, clave);
    }

    @Override
    public void mostrar() {
        System.out.println("Empleado: " + this.verApellido() + ", " + this.verNombre());
        super.mostrar(); // Llama al método mostrar de la superclase
    }

    @Override
    public List<Pedido> verPedidos() {
        return super.listaPedidos; // Retorna la lista de pedidos
    }
}

