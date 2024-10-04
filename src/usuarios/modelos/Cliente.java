
package usuarios.modelos;

public class Cliente extends Usuarios {
    
     private String domicilio;
     
     public Cliente(String domicilio ,String correo, String clave, String apellido, String nombre) {
       super(correo,clave,apellido,nombre);
       this.domicilio = domicilio;
       
    }
    

   
      public void mostrar(){
    System.out.println("Correo: "+ this.verCorreo() + "\nClave: "+ this.verClave() + "\nApellido: "+ this.verApellido() + "\nNombre: "+ this.verApellido());
          System.out.println("Domicilio: "+ domicilio);
      }      
  
}
