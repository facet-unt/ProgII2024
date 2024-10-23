/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;

/**
 *
 * @author fabri
 */
public class GestorProductos{
    
    ArrayList<Producto> listaproductos = new ArrayList();
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
    
    public static GestorProductos crear(){  
        if(gestor == null){
            gestor = new GestorProductos();
        }
        return gestor;
    }
    
    private String controlProductos(Producto p){
    
        if(p.verCodigo() < 0){
            return ERROR_CODIGO;
        }else if(p.verDescripcion() == null || p.verDescripcion().isEmpty()){
            return ERROR_DESCRIPCION;
        }else if(p.verPrecio() < 0){
            return ERROR_PRECIO;
        }else if(p.verCategoria() == null){
            return ERROR_CATEGORIA;
        }else if(p.verEstado() == null){
            return ERROR_ESTADO;
        }
        
        controlProductos(p);
        
        if(!listaproductos.contains(p)){
            listaproductos.add(p);
        }else if(listaproductos.contains(p)){
            return PRODUCTOS_DUPLICADOS;
        }
        return VALIDACION_EXITO;
    }
    
    
    public String crearProducto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {

        Producto p = new Producto(codigo, descripcion, categoria, estado, precio);        
        
        String resultado = controlProductos(p);
                
        if(resultado.equals(VALIDACION_EXITO)) {
            return EXITO;
        } else {
            return resultado;
        }
    }
    
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        
        if(listaproductos.contains(productoAModificar)) {
            
            productoAModificar.asignarCodigo(codigo);
            productoAModificar.asignarDescripcion(descripcion);
            productoAModificar.asignarPrecio(precio);
            productoAModificar.asignarCategoria(categoria);
            productoAModificar.asignarEstado(estado);
            
            
            String resultado = controlProductos(productoAModificar);
            
            
            if(resultado.equals(VALIDACION_EXITO)) {
                return EXITO;
            } else {
                return resultado;
            }
        } else {
           
            return PRODUCTO_INEXISTENTE;
        }
    }
    
    
    public ArrayList<Producto> menu(){
        return listaproductos;
    }
    
    
    public ArrayList<Producto> buscarProductos(String descripcion){
        ArrayList<Producto> productosPorDescripcion = new ArrayList<>();
        for(Producto p : listaproductos){
            if(p.verDescripcion().contains(descripcion)){
                productosPorDescripcion.add(p);
            }
        }
        
        
        return productosPorDescripcion;
    }
    
    
    public boolean existeEsteProducto(Producto producto){
        if(listaproductos.contains(producto))
            return true;
        return false;     
    }
    
    
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria){
        ArrayList<Producto> productosPorCategoria = new  ArrayList();
        for(Producto p : listaproductos){
            if(p.verCategoria().equals(categoria)){
                productosPorCategoria.add(p);
            }
        }
        
        
        return productosPorCategoria;
    }
    
    
    public Producto obtenerProducto(Integer codigo){
         
        for(Producto p : listaproductos){
          if(p.verCodigo() == codigo)
            return p;
        }
        return null;
    }

    public ArrayList<Producto> verListaProductos() {
        return listaproductos;
    }

    public void asignarListaProductos(ArrayList<Producto> listaProductos) {
        this.listaproductos = listaProductos;
    }
}

    
    
//    public String borrarProducto(Producto producto) {
//        GestorPedidos gp = GestorPedidos.crear();
//        int bandera = 0;
//        for(Pedido p : gp.verPedidos()){
//            for (ProductoDelPedido pdp : p.verListaDeProductos()){
//                if(pdp.verProducto().equals(producto)){
//                    bandera = 1;   
//                }
//            }
//        }
//        
//        if(bandera == 0){
//            listaProductos.remove(producto);
//            return EXITO_PRODUCTO;
//        }else {
//            return ERROR_ELIMINACION;
//        }
//    }   
//}
    
    

