/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;



public enum CategoriaProducto {
    entrada("Entrada"),
    PLATOPRINCIPAL("PLATOPRINCIPAL"),
    postre("Postre");

    private String clasif;

    private CategoriaProducto(String clasif){
    this.clasif=clasif;
    }
    
    @Override
    public String toString(){
        return this.clasif;
    }
}
    