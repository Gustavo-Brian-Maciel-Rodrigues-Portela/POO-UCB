package industrias;
import produtos.ProdutoAutomobilistico;
import java.util.ArrayList;

public class IndustriaAutomobilistica extends Industria{
    private String tipoVeiculo;
    private boolean fabricacaoCarrosEletricos;
    public ArrayList<ProdutoAutomobilistico> produtosAutomobilisticos;
    public final static String nomeclatura ="indústria Automobilística";
    
    public IndustriaAutomobilistica(
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
        produtosAutomobilisticos.add(new ProdutoAutomobilistico(
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
