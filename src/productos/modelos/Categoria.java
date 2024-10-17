package productos.modelos;

public enum Categoria {
    ENTRADA("Entrada"),
    PLATO_PRINCIPAL("Plato Principal"),
    POSTRE("Postre");
    
    private String valor;
    
    private Categoria (String valor)
    {
        this.valor = valor;
    }
    
    @Override
    public String toString()
    {
        return valor;
    }
}