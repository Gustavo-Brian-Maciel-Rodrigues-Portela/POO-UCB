package industrias;
import produtos.produtoFarmaceutico;

public class industriaFarmaceutica extends industria{
    private String especialidadeFarmaceutica;
    private boolean pesquisaEmAndamento;

    public industriaFarmaceutica(
        String nome, 
        String endereco, 
        String cnpj, 
        int anoFundacao,
        String especialidadeFarmaceutica, 
        boolean pesquisaEmAndamento
    ) {
        super(nome, endereco, cnpj, anoFundacao);
        this.especialidadeFarmaceutica = especialidadeFarmaceutica;
        this.pesquisaEmAndamento = pesquisaEmAndamento;
    }

    public String getEspecialidadeFarmaceutica() {
        return this.especialidadeFarmaceutica;
    }

    public void setEspecialidadeFarmaceutica(String especialidadeFarmaceutica) {
        this.especialidadeFarmaceutica = especialidadeFarmaceutica;
    }

    public boolean getPesquisaEmAndamento() {
        return this.pesquisaEmAndamento;
    }

    public void setPesquisaEmAndamento(boolean pesquisaEmAndamento) {
        this.pesquisaEmAndamento = pesquisaEmAndamento;
    }
    
}
