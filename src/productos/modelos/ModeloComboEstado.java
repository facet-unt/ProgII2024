/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author luis
 */
public class ModeloComboEstado extends DefaultComboBoxModel {
    
    public ModeloComboEstado() {
        for(Estado e : Estado.values()) {
            this.addElement(e);
        }        
    }
    
    public Estado obtenerEstado() {
        return (Estado)this.getSelectedItem();
    }
    
}
