package produtos;

public class produtoAutomobilistico extends produto{
    private String modelo;
    private String marca;

    public produtoAutomobilistico(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante,
        String modelo,
        String marca
    ) {
        super(
            nome, 
            descricao, 
            preco, 
            quantidadeEmEstoque, 
            categoria, 
            fabricante
        );
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
