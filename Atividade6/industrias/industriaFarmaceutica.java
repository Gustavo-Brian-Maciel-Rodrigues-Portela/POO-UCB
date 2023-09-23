package industrias;

public class industriaFarmaceutica extends industria{
    private String especialidadeFarmaceutica;
    private boolean pesquisaEmAndamento;

    public industriaFarmaceutica(String nomeProduto, String endereco, String cnpj, int numeroFuncionarios,
    String especialidadeFarmaceutica, boolean pesquisaEmAndamento) {
        super(nomeProduto, endereco, cnpj, numeroFuncionarios);
        this.especialidadeFarmaceutica = especialidadeFarmaceutica;
        this.pesquisaEmAndamento = pesquisaEmAndamento;
    }
}
