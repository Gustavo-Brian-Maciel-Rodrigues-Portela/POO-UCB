package industrias;

public class industriaAutomobilistica extends industria{
    private int numeroModelos;
    private boolean fabricacaoCarrosEletricos;
    
    public industriaAutomobilistica(String nomeProduto, String endereco, String cnpj, int numeroFuncionarios,
    int numeroModelos, boolean fabricacaoCarrosEletricos) {
        super(nomeProduto, endereco, cnpj, numeroFuncionarios);
        this.numeroModelos = numeroModelos;
        this.fabricacaoCarrosEletricos = fabricacaoCarrosEletricos;
    }
}
