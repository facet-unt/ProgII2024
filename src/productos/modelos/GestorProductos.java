package productos.modelos;

import java.util.ArrayList;

public class GestorProductos {
    private ArrayList<Producto> productos = new ArrayList<>();
    private static GestorProductos gestor;
    public static final String EXITO = "Producto creado/modificado con exito";
    public static final String ERROR_PRODUCTO ="No se pudo crear el producto";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoria del producto es incorrecta";
    public static final String ERROR_ESTADO = "El estado del producto es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese codigo";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String VALIDACION_ERRONEA = "Los datos del producto no son correctos"; 
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    
    private GestorProductos(){
    }
                
    public static GestorProductos instanciarGestorProductos(){
        if (gestor == null)
            gestor = new GestorProductos();
        return gestor;
    }
    
    private String validacionParametros(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if(!(codigo>0))
            return ERROR_CODIGO;
        if(descripcion == null)
            return ERROR_DESCRIPCION;
        if(!(precio>0))
            return ERROR_PRECIO;
        if(categoria == null)
            return ERROR_CATEGORIA;
        if(estado == null)
            return ERROR_ESTADO;
        if(codigo > 0 && descripcion != null && precio > 0 && categoria != null && estado != null )
            return VALIDACION_EXITO;
        else
            return VALIDACION_ERRONEA;
    }
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if(validacionParametros(codigo, descripcion, precio, categoria, estado).equals(VALIDACION_EXITO)){
            Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
              if(productos.contains(producto))
                  return PRODUCTOS_DUPLICADOS;
              else{
                  productos.add(producto);
                  return EXITO;
            }
        }
        else
            return ERROR_PRODUCTO;     
    }
    
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){          
            for(Producto p : productos){
                if(p.equals(productoAModificar)){
                //    p.asignarCodigo(productoAModificar.verCodigo());
                    p.asignarDescripcion(productoAModificar.verDescripcion());
                    p.asignarPrecio(productoAModificar.verPrecio());
                    p.asignarCategoria(productoAModificar.verCategoria());
                    p.asignarEstado(productoAModificar.verEstado());
                    }
        }
        if(!(productos.contains(productoAModificar)))
            return PRODUCTO_INEXISTENTE;
        else
            return EXITO;
}
    
    public ArrayList<Producto> buscarProductos(String descripcion){
        String descripcionEnMinuscula  = descripcion.toLowerCase();
        ArrayList <Producto> recorrer = new ArrayList<>();
        
        for(Producto prod : productos){
            prod.asignarDescripcion(prod.verDescripcion().toLowerCase());
            if(descripcionEnMinuscula.equals(prod.verDescripcion())){
                recorrer.add(prod);
            }    
         }
        if(recorrer.isEmpty())
            System.out.println(PRODUCTO_INEXISTENTE);
        return recorrer;
    }   
    
    public ArrayList<Producto> menu(){
        return productos;
    }   

    public boolean existeEsteProducto(Producto producto){
        if(productos.contains(producto))
            return true;        
        else
            return false;
    }
    
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        ArrayList <Producto> recorrer2 = new ArrayList <>();
       
        for(Producto pds : productos){
            if(pds.verCategoria().equals(categoria))
               recorrer2.add(pds);
       }
        if(recorrer2.isEmpty())
            System.out.println(ERROR_CATEGORIA);
       
        return recorrer2;
    }
    
    public Producto obtenerProducto(Integer codigo) {
        
        for(Producto prod : productos){
            if(prod.verCodigo() == codigo)
                return prod;
        }
    return null;
    }
}