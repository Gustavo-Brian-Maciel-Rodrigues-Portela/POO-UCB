package industrias;
import produtos.produtoFarmaceutico;
import java.util.ArrayList;

public class industriaFarmaceutica extends industria{
    private String especialidadeFarmaceutica;
    private boolean pesquisaEmAndamento;
    private ArrayList<produtoFarmaceutico> produtosFarmaceuticos;
    public final static String nomeclatura ="indústria Farmacêutica";

    public industriaFarmaceutica(
        String nome, 
        String endereco, 
        String cnpj, 
        int anoFundacao,
        String especialidadeFarmaceutica, 
        boolean pesquisaEmAndamento
    ) {
        super(
            nome, 
            endereco, 
            cnpj, 
            anoFundacao
        );
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

    public void criarProduto(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante
    ) {
        produtosFarmaceuticos.add(new produtoFarmaceutico(
            nome, 
            descricao, 
            preco, 
            quantidadeEmEstoque, 
            categoria, 
            fabricante
        ));
    }
    
}
