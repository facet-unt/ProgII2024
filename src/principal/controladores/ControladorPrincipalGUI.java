/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import javax.swing.UIManager;
import productos.vistas.VentanaAMProducto;

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
        //VentanaAMProducto ventana = new VentanaAMProducto(null);
        
        //ventana.setTitle("Nuevo producto");
        
        VentanaAMProducto ventana = new VentanaAMProducto(null);
        
        
        //CLIENTE
     
//        VentanaAMCliente ventanac = new VentanaAMCliente(null);
//        ventanac.setLocationRelativeTo(null);
//        ventanac.setTitle("Nuevo cliente");
//        ventanac.setVisible(true);
             
       //EMPLEADO 
      
//        VentanaAMEmpleado ventanaem = new VentanaAMEmpleado(null);
//        ventanaem.setLocationRelativeTo(null);
//        ventanaem.setTitle("Nuevo empleado");
//        ventanaem.setVisible(true);
     
       //ENCARGADO
   
//        VentanaAMEncargado ventanaen = new VentanaAMEncargado(null);
//        ventanaen.setLocationRelativeTo(null);
//        ventanaen.setTitle("Nuevo encargado");
//        ventanaen.setVisible(true);
    
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
