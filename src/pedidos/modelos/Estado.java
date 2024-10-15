/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author diego
 */
public enum Estado {
    CREADO("Creado"),
    PROCESANDO("Procesando"),
    ENTREGADO("Entregado"),
    DISPONIBLE("Disponible"),

    /**
     *
     */
    NO_DISPONIBLE("No disponible");
    private String valor;
    
    private Estado (String valor)
    {
        this.valor = valor;
    }
    
    @Override
    public String toString()
    {
        return valor;
    }
}