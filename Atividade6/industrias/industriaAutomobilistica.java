package industrias;
import produtos.produtoAutomobilistico;

public class industriaAutomobilistica extends industria{
    private String tipoVeiculo;
    private boolean fabricacaoCarrosEletricos;
    
    public industriaAutomobilistica(String nome, String endereco, String cnpj, int anoFundacao,
    String tipoVeiculo, boolean fabricacaoCarrosEletricos) {
        super(nome, endereco, cnpj, anoFundacao);
        this.tipoVeiculo = tipoVeiculo;
        this.fabricacaoCarrosEletricos = fabricacaoCarrosEletricos;
    }
}
