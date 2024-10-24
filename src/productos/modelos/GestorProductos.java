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
    private ArrayList <Producto> productos= new ArrayList<>();
    //Implementación del patrón singleton
    private GestorProductos instancia;
    private GestorProductos(){
        
    }
    private GestorProductos instanciar(){
        if(instancia==null){
            instancia=new GestorProductos();
        }
        return instancia;
    }
    
    //Constantes de error
    public static final String EXITO = "Producto creado/modificado con éxito";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";
    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";
    public static final String ERROR_ESTADO = "El precio del producto es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    //Métodos de la clase
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if (codigo<0){
            return ERROR_CODIGO;
        }else if(descripcion.isBlank() || descripcion==null){
            return ERROR_DESCRIPCION;
        }else if(precio<0){
            return ERROR_PRECIO;
        }else if(categoria==null){
            return ERROR_CATEGORIA;
        }else if(estado==null){
            return ERROR_ESTADO;
        }else{
            Producto p=new Producto(codigo, descripcion, precio, categoria, estado);
            productos.add(p);
            return EXITO;
        }
    }
    
    public String crearProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        if (codigo<0){
            return ERROR_CODIGO;
        }else if(!descripcion.isBlank() && descripcion==null){
            return ERROR_DESCRIPCION;
        }else if(precio<0){
            return ERROR_PRECIO;
        }else if(categoria==null){
            return ERROR_CATEGORIA;
        }else if(estado==null){
            return ERROR_ESTADO;
        }else if(!productos.contains(productoAModificar)){
            return PRODUCTO_INEXISTENTE;
        }else{
            int index= productos.indexOf(productoAModificar);
            productos.get(index).asignarCodigo(codigo);
            productos.get(index).asignarDescripcion(descripcion);
            productos.get(index).asignarPrecio(precio);
            productos.get(index).asignarCategoria(categoria);
            productos.get(index).asignarEstado(estado);
            return EXITO;
        }
    }
    
    public ArrayList<Producto> menu(){
        return productos;
    }
    
    public ArrayList<Producto> buscarProductos(String descripcion){
        ArrayList<Producto> coincidencias = new ArrayList<>();
        for(Producto p : productos){
            if (p.verDescripcion().toLowerCase()==descripcion.toLowerCase()){
                coincidencias.add(p);
            }
        }
        if(coincidencias.isEmpty()){
            System.out.println("No se encontró ningún producto con la descripción otorgada.");
            return coincidencias;
        }else{
            return coincidencias;
        }
    }
    
    public boolean existeEsteProducto(Producto producto){
        if(productos.contains(producto)){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        ArrayList<Producto> coincidencias= new ArrayList<>();
        for (Producto p : productos){
            if (p.verCategoria()==categoria.toString()){
                coincidencias.add(p);
            }
        }
        return coincidencias;
    }
    
    public Producto obtenerProducto (Integer codigo){
        for (Producto p : productos){
            if (p.verCodigo()==codigo){
                return p;
            }
        }
        return null;
    }
}
