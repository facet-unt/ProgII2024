
package usuarios.modelos;

public class Encargado {
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    
    
    
    
    
     public void asignarNombre (String n){
        n = nombre;
        
    }
    
     public void asignarApellido (String a){
        a = apellido;
        
    }
     
      public void asignarCorreo (String c){
        c = apellido;
        
    }
 

    public String verNombre() {   
     
        return nombre;
        
    }

    public String verapellido() {   
     
        return apellido;
        
    }
    
    public String verCorreo() {   
     
        return correo;
        
    }

    public void mostrar() {   
     
        System.out.println("Correo: " +correo);
        System.out.println("Clave: " +clave);
        System.out.println("Apellido " +apellido);
        System.out.println("Nombre: " +nombre);
        
    }


    
}
