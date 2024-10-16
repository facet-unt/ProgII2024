package productos.modelos;



public enum Estado {
    DISPONIBLE("Disponible"),
    NO_DISPONIBLE("No disponible");
    
    private String valor;
    
    private Estado (String valor)
    {
        this.valor = valor;
    }
    
    @Override
    public String toString()
    {
        return valor;
    }
}