package industrias;

public class industriaAlimenticia extends industria{
    private String tipoProdutosAlimenticios;
    private boolean utilizaIngredientesOrgânicos;

    public industriaAlimenticia(String tipoProduto, String endereco, String cnpj, int numeroFuncionarios,
    String tipoProdutosAlimenticios, boolean utilizaIngredientesOrgânicos) {
        super(tipoProduto, endereco, cnpj, numeroFuncionarios);
        this.tipoProdutosAlimenticios = tipoProdutosAlimenticios;
        this.utilizaIngredientesOrgânicos = utilizaIngredientesOrgânicos;
    }   
}
