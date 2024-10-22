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
    
    ArrayList<Producto> productos = new ArrayList<>();
    
    private GestorProductos() {
        
    }
    
    public static GestorProductos instanciar() {
        if (gestor == null)
            gestor = new GestorProductos();
        return gestor;
    }
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        
        return EXITO;
    }
    
    
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
       
        return EXITO;
    }
    
    public ArrayList<Producto> menu(){
        
    }
    
    public ArrayList<Producto> buscarProductos(String descripcion) {
        
    }
    
    public boolean existeEsteProducto(Producto producto) {
        
    }
    
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        
    }
    
    public Producto obtenerProducto(Integer codigo) {
        
    }
    
}