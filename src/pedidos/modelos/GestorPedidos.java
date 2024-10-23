/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;

/**
 *
 * @author Mi buen PC
 */
public class GestorPedidos {
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private static GestorPedidos gestor;
    public static final String EXITO = "Pedido creado/modificado/cancelado con éxito";
    public static final String ERROR_FECHA = "La fecha del pedido es incorrecta";
    public static final String ERROR_HORA = "La hora del pedido es incorrecta";
    public static final String ERROR_PRODUCTOS_DEL_PEDIDO = "El pedido no tiene productos";
    public static final String ERROR_CLIENTE = "El pedido no tiene un cliente";
    public static final String ERROR_ESTADO = "El pedido no tiene un estado";
    public static final String ERROR_CANCELAR = "No se puede cancelar el pedido en este estado";
    public static final String PEDIDOS_DUPLICADOS = "Ya existe un pedido con ese número";
    public static final String PEDIDO_INEXISTENTE = "No existe el pedido especificado";
    public static final String VALIDACION_EXITO = "El pedido tiene los datos correctos";

    private GestorPedidos() {
    }
    
    public static GestorPedidos instanciar(){
        if(gestor == null){
            gestor = new GestorPedidos();
        }
        return gestor;
    }
    
    
    
    private String validador(LocalDate fecha, LocalTime hora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente){
        if(fecha == null){
            return ERROR_FECHA;
        }
        
        if(hora == null){
            return ERROR_HORA;
        }
        
        if(productosDelPedido.isEmpty()){
            return ERROR_PRODUCTOS_DEL_PEDIDO;
        }
        
        if(cliente == null){
            return ERROR_CLIENTE;
        }
        
        return VALIDACION_EXITO;
    
    }
    
    
    
    

    
    
    
    
    
}
