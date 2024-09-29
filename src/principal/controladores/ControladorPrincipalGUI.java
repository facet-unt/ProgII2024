/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import javax.swing.UIManager;
import productos.vistas.VentanaAMProducto;
import usuarios.vistas.VentanaAMCliente;
import usuarios.vistas.VentanaAMEmpleado;
import usuarios.vistas.VentanaAMEncargado;

/**
 *
 * @author mariana
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
        
        //CLIENTE
      /* 
        VentanaAMCliente ventana = new VentanaAMCliente(null);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Nuevo cliente");
        ventana.setVisible(true);
       */        
       //EMPLEADO 
       /*
        VentanaAMEmpleado ventana = new VentanaAMEmpleado(null);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Nuevo empleado");
        ventana.setVisible(true);
        */
       //ENCARGADO
       /*
        VentanaAMEncargado ventana = new VentanaAMEncargado(null);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Nuevo encargado");
        ventana.setVisible(true);
       */
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