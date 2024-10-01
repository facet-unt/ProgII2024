/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import javax.swing.UIManager;
import productos.vistas.VentanaAMProducto;
import usuarios.vistas.VentanaAMCliente;
import usuarios.vistas.VentanaAMEmpleado;
import usuarios.vistas.VentanaAMEncargado;

/**
 *
 * @author luis
 */
public class ControladorPrincipalGUI {
    public static void main(String[] args) {
        //Trabajamos con una ventana por vez
        //Para todos los casos:
        /*
        * Asigna el look and feel "Nimbus" a la ventana
        * Se crea la ventana
        * Se centra la ventana
        * Se asigna un título a la ventana
        * Se hace visible la ventana
        */
        establecerLookAndFeel("Nimbus"); 
        
        // PRODUCTO
        VentanaAMProducto ventana = new VentanaAMProducto(null);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Nuevo producto");
        ventana.setVisible(true);
//        
        //CLIENTE
      
        VentanaAMCliente ventana2 = new VentanaAMCliente(null);
        ventana2.setLocationRelativeTo(null);
        ventana2.setTitle("Nuevo cliente");
        ventana2.setVisible(true);
           
       //EMPLEADO 
      
        VentanaAMEmpleado ventana3 = new VentanaAMEmpleado(null);
        ventana3.setLocationRelativeTo(null);
        ventana3.setTitle("Nuevo empleado");
        ventana3.setVisible(true);
       
       //ENCARGADO
       
        VentanaAMEncargado ventana4 = new VentanaAMEncargado(null);
        ventana4.setLocationRelativeTo(null);
        ventana4.setTitle("Nuevo encargado");
        ventana4.setVisible(true);
       
    }
    
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void establecerLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
            }
        }
    }
}
