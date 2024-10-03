/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author joaquincoro
 */
public enum Categoria {
    ENTRADA("Entrada"),
    PLATOPRINCIPAL("Plato Principal"),
    POSTRE("Postre");
    
    private String tipo;
    private Categoria(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return this.tipo;
    }
}
