package industrias;
import produtos.produtoAlimenticio;;

public class industriaAlimenticia extends industria{
    private String tipoProdutosAlimenticios;
    private boolean utilizaIngredientesOrgânicos;

    public industriaAlimenticia(String nome, String endereco, String cnpj, int anoFundacao,
    String tipoProdutosAlimenticios, boolean utilizaIngredientesOrganicos) {
        super(nome, endereco, cnpj, anoFundacao);
        this.tipoProdutosAlimenticios = tipoProdutosAlimenticios;
        this.utilizaIngredientesOrgânicos = utilizaIngredientesOrgânicos;
    }   
}
