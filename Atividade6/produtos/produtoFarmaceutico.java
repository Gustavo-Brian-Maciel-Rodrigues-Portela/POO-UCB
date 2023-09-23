package produtos;

public class produtoFarmaceutico extends produto{
    public produtoFarmaceutico(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante
    ) {
        super(nome, descricao, preco, quantidadeEmEstoque, categoria, fabricante);
    }
}
