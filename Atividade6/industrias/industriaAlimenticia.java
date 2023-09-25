package industrias;
import produtos.ProdutoAlimenticio;
import java.util.ArrayList;

public class IndustriaAlimenticia extends Industria{
    private String tipoProdutosAlimenticios;
    private boolean utilizaIngredientesOrganicos;
    public ArrayList<ProdutoAlimenticio> produtosAlimenticios;
    public final static String nomeclatura ="indústria Alimentícia";

    public IndustriaAlimenticia(
        String nome, 
        String endereco, 
        String cnpj, 
        int anoFundacao,
        String tipoProdutosAlimenticios, 
        boolean utilizaIngredientesOrganicos
    ) {
        super(
            nome, 
            endereco, 
            cnpj, 
            anoFundacao
        );
        this.tipoProdutosAlimenticios = tipoProdutosAlimenticios;
        this.utilizaIngredientesOrganicos = utilizaIngredientesOrganicos;
        this.produtosAlimenticios = new ArrayList<>();
    }

    public String getTipoProdutosAlimenticios() {
        return this.tipoProdutosAlimenticios;
    }

    public void setTipoProdutosAlimenticios(String tipoProdutosAlimenticios) {
        this.tipoProdutosAlimenticios = tipoProdutosAlimenticios;
    }

    public boolean getUtilizaIngredientesOrgânicos() {
        return this.utilizaIngredientesOrganicos;
    }

    public void setUtilizaIngredientesOrgânicos(boolean utilizaIngredientesOrgânicos) {
        this.utilizaIngredientesOrganicos = utilizaIngredientesOrgânicos;
    }

    public void criarProduto(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante
    ) {
        produtosAlimenticios.add(new ProdutoAlimenticio(
            nome,
            descricao,
            preco,
            quantidadeEmEstoque,
            categoria,
            fabricante
        ));
    }

}
