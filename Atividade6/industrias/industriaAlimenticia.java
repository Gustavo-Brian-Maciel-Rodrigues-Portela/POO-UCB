package industrias;
import produtos.produtoAlimenticio;
import java.util.ArrayList;

public class industriaAlimenticia extends industria{
    private String tipoProdutosAlimenticios;
    private boolean utilizaIngredientesOrgânicos;
    public ArrayList<produtoAlimenticio> produtosAlimenticios;
    public final static String nomeclatura ="indústria Alimentícia";

    public industriaAlimenticia(
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
        this.utilizaIngredientesOrgânicos = utilizaIngredientesOrgânicos;
        this.produtosAlimenticios = new ArrayList<>();
    }

    public String getTipoProdutosAlimenticios() {
        return this.tipoProdutosAlimenticios;
    }

    public void setTipoProdutosAlimenticios(String tipoProdutosAlimenticios) {
        this.tipoProdutosAlimenticios = tipoProdutosAlimenticios;
    }

    public boolean getUtilizaIngredientesOrgânicos() {
        return this.utilizaIngredientesOrgânicos;
    }

    public void setUtilizaIngredientesOrgânicos(boolean utilizaIngredientesOrgânicos) {
        this.utilizaIngredientesOrgânicos = utilizaIngredientesOrgânicos;
    }

    public void criarProduto(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante
    ) {
        produtosAlimenticios.add(new produtoAlimenticio(
            nome,
            descricao,
            preco,
            quantidadeEmEstoque,
            categoria,
            fabricante
        ));
    }

}
