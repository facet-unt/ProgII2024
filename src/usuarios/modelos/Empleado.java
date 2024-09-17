package usuarios.modelos;

public class Empleado {
    
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    public void mostrar() {

        System.out.println("El correo del empleado es:" + correo);
        System.out.println("La clave del empleado es: " + clave);
        System.out.println("El apellido del empleado es: " + apellido);
        System.out.println("El Nombre del empleado es: " + nombre);
        
    }

}
