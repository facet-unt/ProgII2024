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
public class ModeloComboCategoria extends DefaultComboBoxModel {
    
    public ModeloComboCategoria() {
        for(Categoria c : Categoria.values()) {
            this.addElement(c);
        }
    }
    
    public Categoria obtenerCategoria() {
        return (Categoria)this.getSelectedItem();
    }
    
}
