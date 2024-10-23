/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class GestorProductos {
    
    private ArrayList<Producto> productos = new ArrayList<>();
    private static GestorProductos gestor;
    public static final String EXITO = "Producto creado/modificado con éxito";
public static final String ERROR_CODIGO = "El código del producto es incorrecto";
public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";
public static final String ERROR_ESTADO = "El precio del producto es incorrecto";
public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";
public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";

    private GestorProductos() {
    }

    public static GestorProductos instanciador (){
        if(gestor==null){
        gestor = new GestorProductos();
        }
        return gestor;
    }
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if(codigo < 0){
        return ERROR_CODIGO;
        }
        
        if(descripcion  ==  null || descripcion.isEmpty()){
        return ERROR_DESCRIPCION;
        }
        
        if(precio < 0){
            return ERROR_PRECIO;
        }
        
        if(categoria == null){
        return ERROR_CATEGORIA;
        }
        
        if(estado == null){
        return ERROR_ESTADO;
        }
        
        Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
        
        if(productos.contains(producto)){
        return PRODUCTOS_DUPLICADOS;
        }
        
        productos.add(producto);
        
        return(EXITO);
    }
    
    
    
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if(codigo < 0){
        return ERROR_CODIGO;
        }
        
        if(descripcion  ==  null || descripcion.isEmpty()){
        return ERROR_DESCRIPCION;
        }
        
        if(precio < 0){
            return ERROR_PRECIO;
        }
        
        if(categoria == null){
        return ERROR_CATEGORIA;
        }
        
        if(estado == null){
        return ERROR_ESTADO;
        }
        
        if(!productos.contains(productoAModificar)){
        return PRODUCTO_INEXISTENTE;
        }
        
        int posicion = productos.indexOf(productoAModificar);
        
        Producto productoNuevo = new Producto(codigo, descripcion, categoria, estado, precio);
        
        productos.set(posicion, productoNuevo);
        
        return EXITO;
        
        
    }
    
    
    public ArrayList<Producto> menu(){
      return productos;
    }
    
    public ArrayList<Producto> buscarProductos(String descripcion){
        ArrayList<Producto> productosDescripcion = new ArrayList<>();
        
        descripcion = descripcion.toLowerCase().trim();
        
        for(Producto p : productos){
            String descripcionProducto = p.verDescripcion().toLowerCase().trim();
            
            if(descripcion.contains(descripcionProducto) || descripcionProducto.contains(descripcion)){
                productosDescripcion.add(p);
            }
        }
        
        return productosDescripcion;
    
    }
    
    
    public boolean existeEsteProducto(Producto producto){
        return productos.contains(producto);
    }
    
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        ArrayList<Producto> productosCategoria = new ArrayList<>();
        
        for(Producto p : productos){
            if(p.verCategoria().equals(categoria.toString())){
                productosCategoria.add(p);
                
            }
        }
       
        return productosCategoria;
        
        
    }
    
}
