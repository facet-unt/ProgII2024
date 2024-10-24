/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class GestorUsuarios {
    private ArrayList<Usuario> usuarios =new ArrayList<Usuario>();
    //implementación del patrón singleton
    private GestorUsuarios instancia;
    private GestorUsuarios(){
        
    }
    private GestorUsuarios instanciar(){
        if(instancia==null){
            instancia=new GestorUsuarios();
        }
        return instancia;
    }
    
    
}
