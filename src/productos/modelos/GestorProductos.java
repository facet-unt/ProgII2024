/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class GestorProductos {
    
    private ArrayList<Producto> productos = new ArrayList<>();
    private static GestorProductos gestor;

    private GestorProductos() {
    }

    public static GestorProductos instanciador (){
        if(gestor==null){
        gestor = new GestorProductos();
        }
        return gestor;
    }
    
    
    
}
