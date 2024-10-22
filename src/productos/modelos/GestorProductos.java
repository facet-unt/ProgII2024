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
    
    // Implemento el arraylist de productos
    private ArrayList<Producto> productos = new ArrayList<>();
    
    //// Defino el mecanismo para solo instanciar un gestor de productos
    
        // Privatizacion del constructor predeterminado
        private GestorProductos(){
            
        }
    
        // Variable de clase que guarde la unica instancia
        private static GestorProductos instancia;
    
        public static GestorProductos instanciar() {
            
            // Verifico si la instancia actual es nula, de ser asi, creo una
            if (instancia == null){
                instancia = new GestorProductos();
            }
            
            // En cualquier caso, devuelvo la instancia
            return instancia;
        }
    
    ///////////////
        
        /* Metodos del gestor productos */
        
        // Defino las constantes de estado para la clase
        
        public static final String EXITO = "Producto creado/modificado con exito";
        public static final String ERROR_CODIGO = "El codigo del producto es incorrecto";
        public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
        public static final String ERROR_DESCRIPCION = "La descripcion del producto es incorrecta";
        public static final String ERROR_CATEGORIA = "La categoria del producto es incorrecta";                      
        public static final String ERROR_ESTADO = "El estado del producto es incorrecto";
        public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese codigo";
        public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
        public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    // Defino un metodo que permite validar los datos
    private String validarDatos (int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        // Realizo las validaciones de datos
        // Codigo debe ser positivo
        if (codigo <= 0)
            return ERROR_CODIGO;
        // Descripcion debe ser no nula y no vacia
        if (descripcion == null || descripcion.trim().equals(""))
            return ERROR_DESCRIPCION;
        // Precio debe ser positivo
        if (precio <= 0)
            return ERROR_PRECIO;
        // Categoria debe ser no nula
        if (categoria == null)
            return ERROR_CATEGORIA;
        // Estado debe ser no nulo
        if (estado == null)
            return ERROR_ESTADO;
        // Si veriico todo, retorno exito
        return VALIDACION_EXITO;
    }
        
    // Defino el metodo para crear productos
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        // Defino donde almacenare el resultado de la validacion de los datos del producto
        String resultado = validarDatos(codigo, descripcion, precio, categoria, estado);
        
        // Si la validacion no se realizo correctamente, retorno error
        if (!resultado.equals(VALIDACION_EXITO))
            return resultado;
        
        // Instancio el producto, luego verifico si ya existe
        Producto p = new Producto(codigo, descripcion, categoria, estado, precio);
        if (this.productos.contains(p))
            resultado = PRODUCTOS_DUPLICADOS;
        
        // Si el producto ya existe, retorno error
        if (!resultado.equals(VALIDACION_EXITO))
            return resultado;
        
        // Luego, si supero las verificaciones, guardo el producto en el arreglo y retorno exito
        resultado = EXITO;
        this.productos.add(p);
        return resultado;
    }
    
    // Defino el metodo para modificar productos
    public String modificarProducto(Producto producto, int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        // Defino donde almacenare el resultado de la validacion de los datos del producto
        String resultado = validarDatos(codigo, descripcion, precio, categoria, estado);
        
        // Si la validacion no se realizo correctamente, retorno error
        if (!resultado.equals(VALIDACION_EXITO))
            return resultado;
        
        // Verifico que el producto ya existe, de ser asi guardo su indice
        int indice = 0;
        for (Producto p : this.productos)
        {
            if (p.equals(producto)) {
                resultado = PRODUCTOS_DUPLICADOS;
                indice = productos.indexOf(p);
            }
        }
        
        // Si el producto no existe, retorno error
        if (!resultado.equals(PRODUCTOS_DUPLICADOS)) {
            resultado = PRODUCTO_INEXISTENTE;
            return resultado;
        }
            
        
        // Luego, si supero las verificaciones, instancio el producto y lo reemplaza en el arreglo
        resultado = EXITO;
        Producto p = new Producto(codigo, descripcion, categoria, estado, precio);
        this.productos.set(indice, p);
        return resultado;
    }
        
    // Defino el metodo para mostrar el menu
    public ArrayList<Producto> menu() {
        return this.productos;
    }
}
