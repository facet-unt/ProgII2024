
package usuarios.modelos;

public class Encargado {
    public String correo;
    public String clave;
    public String apellido;
    public String nombre;

    void mostrar() {   
     
        System.out.println("Correo:" +correo);
        System.out.println("Clave: " +clave);
        System.out.println("Apellido" +apellido);
        System.out.println("Nombre:" +nombre);
        
    }


    
}
