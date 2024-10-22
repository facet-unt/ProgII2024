
import java.util.ArrayList;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.Producto;

public class GestorProductos {
    private ArrayList<Producto> productos = new ArrayList<>();
    private static GestorProductos gestor;
    public static final String EXITO = "Producto creado/modificado con exito";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    
    private GestorProductos(){
    }
                
    public static GestorProductos instanciarGestorProductos(){
        if (gestor == null)
            gestor = new GestorProductos();
        
        return gestor;
    }
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
        
    }
