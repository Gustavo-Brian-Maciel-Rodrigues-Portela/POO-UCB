package industrias;
import produtos.produtoAutomobilistico;
import java.util.ArrayList;

public class industriaAutomobilistica extends industria{
    private String tipoVeiculo;
    private boolean fabricacaoCarrosEletricos;
    public ArrayList<produtoAutomobilistico> produtosAutomobilisticos;
    public final static String nomeclatura ="indústria Automobilística";
    
    public industriaAutomobilistica(
        String nome, 
        String endereco, 
        String cnpj, 
        int anoFundacao,
        String tipoVeiculo, 
        boolean fabricacaoCarrosEletricos
    ) {
        super(
            nome, 
            endereco, 
            cnpj, 
            anoFundacao
        );
        this.tipoVeiculo = tipoVeiculo;
        this.fabricacaoCarrosEletricos = fabricacaoCarrosEletricos;
        this.produtosAutomobilisticos = new ArrayList<>();
    }

    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public boolean getFabricacaoCarrosEletricos() {
        return this.fabricacaoCarrosEletricos;
    }

    public void setFabricacaoCarrosEletricos(boolean fabricacaoCarrosEletricos) {
        this.fabricacaoCarrosEletricos = fabricacaoCarrosEletricos;
    }

    public void criarProduto(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante,
        String modelo,
        String marca
    ) {
        produtosAutomobilisticos.add(new produtoAutomobilistico(
            nome, 
            descricao, 
            preco, 
            quantidadeEmEstoque, 
            categoria, 
            fabricante, 
            modelo, 
            marca
        ));
    }

}
