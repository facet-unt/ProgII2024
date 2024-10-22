package productos.modelos;

import java.util.ArrayList;

public class GestorProductos {
    private ArrayList<Producto> productos = new ArrayList<>();
    private static GestorProductos gestor;
    public static final String EXITO = "Producto creado/modificado con exito";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    private GestorProductos(){}
                
    public static GestorProductos instanciarGestorProductos(){
        if (gestor == null)
            gestor = new GestorProductos();
        
        return gestor;
    }
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
        
    }
    
    public ArrayList<Producto> buscarProductos(String descripcion){
        
        String descripcionEnMinuscula  = descripcion.toLowerCase();
        ArrayList <Producto> recorrer = new ArrayList<>();
        
        for(Producto prod : productos){
            if(prod.verDescripcion().equals(descripcionEnMinuscula)){
                recorrer.add(prod);
            }    
            else
                System.out.println(PRODUCTO_INEXISTENTE);
         }
        return recorrer;
    }
}