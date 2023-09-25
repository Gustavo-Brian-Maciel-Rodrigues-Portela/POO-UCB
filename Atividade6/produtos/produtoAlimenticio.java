package produtos;

public class ProdutoAlimenticio extends Produto{
    private String dataValidade;
    private String codigoBarras;

    public ProdutoAlimenticio(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante
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

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

}
