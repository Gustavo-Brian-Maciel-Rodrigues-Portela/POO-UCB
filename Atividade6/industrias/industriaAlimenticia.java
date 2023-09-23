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

}
