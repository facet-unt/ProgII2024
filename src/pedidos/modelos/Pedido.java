/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDateTime;
import usuarios.modelos.Cliente;

/**
 *
 * @author Mariana
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Cliente cliente;
    private Estado estado;
}
