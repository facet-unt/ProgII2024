/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 *
 * @author Mi buen PC
 */
public class GestorUsuarios {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    private static GestorUsuarios gestor;

    private GestorUsuarios() {
    }
    
    
    public static GestorUsuarios instanciar(){
        if(gestor==null){
            gestor = new GestorUsuarios();
        }
        return gestor;
    }
    
    
    
}
