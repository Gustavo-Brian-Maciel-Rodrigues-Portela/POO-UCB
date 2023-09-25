package industrias;
import produtos.ProdutoFarmaceutico;
import java.util.ArrayList;

public class IndustriaFarmaceutica extends Industria{
    private String especialidadeFarmaceutica;
    private boolean pesquisaEmAndamento;
    public ArrayList<ProdutoFarmaceutico> produtosFarmaceuticos;
    public final static String nomeclatura ="indústria Farmacêutica";

    public IndustriaFarmaceutica(
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
        this.produtosFarmaceuticos = new ArrayList<>();
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
        produtosFarmaceuticos.add(new ProdutoFarmaceutico(
            nome, 
            descricao, 
            preco, 
            quantidadeEmEstoque, 
            categoria, 
            fabricante
        ));
    }
    
}
