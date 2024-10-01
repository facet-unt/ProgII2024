/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import javax.swing.UIManager;
import usuarios.vistas.VentanaAMCliente;
import usuarios.vistas.VentanaAMEmpleado;
import usuarios.vistas.VentanaAMEncargado;
/*
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
        
//        VentanaAMProducto ventanaProducto = new VentanaAMProducto(null);
//        ventanaProducto.setLocationRelativeTo(null);
//        ventanaProducto.setTitle("Nuevo producto");
//        ventanaProducto.setVisible(true);
        
        //CLIENTE
      
        VentanaAMCliente ventanaCliente = new VentanaAMCliente(null);
        ventanaCliente.setLocationRelativeTo(null);
        ventanaCliente.setTitle("Nuevo cliente");
        ventanaCliente.setVisible(true);
     
       //EMPLEADO 

        VentanaAMEmpleado ventanaEmpleado = new VentanaAMEmpleado(null);
        ventanaEmpleado.setLocationRelativeTo(null);
        ventanaEmpleado.setTitle("Nuevo empleado");
        ventanaEmpleado.setVisible(true);

       //ENCARGADO

        VentanaAMEncargado ventanaEncargado = new VentanaAMEncargado(null);
        ventanaEncargado.setLocationRelativeTo(null);
        ventanaEncargado.setTitle("Nuevo encargado");
        ventanaEncargado.setVisible(true);

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
