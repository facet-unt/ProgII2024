package productos.modelos;

import usuarios.modelos.Cliente;

public class Producto {
    public String nombre;
    public String descripcion;
    public float precio;
    public String estado;

    /**
     * Este método permite mostrar un Producto
     * @return devuelve nada
     */
    public void mostrar() {        
        System.out.println("Nombre:" +nombre);
        System.out.println("Precio:" +precio);
        
        
        
    }
       
    
    
     public void asignarNombre (String n){
        n = nombre;
        
    }
    
     public void asignarPrecio (Float p){
        p = precio;
        
    }
     
      public void asignarEstado (String e){
        e = estado;
        
    }
 

    public String verNombre() {   
     
        return nombre;
        
    }

    public float verPrecio() {   
     
        return precio;
        
    }
    
    public String verDescripcion() {   
     
        return descripcion;
        
    }
    
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Descripcion: " + descripcion;
    }


}




