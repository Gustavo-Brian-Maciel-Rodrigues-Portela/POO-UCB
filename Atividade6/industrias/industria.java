package industrias;
import java.util.Objects;

public class industria {
    private String nome;
    private String endereco;
    private String cnpj;
    protected int numeroFuncionarios;
    protected double receitaAnual;
    protected String nomeProduto; 
    private int anoFundacao;    

    public industria(
        String nome, 
        String endereco, 
        String cnpj, 
        int anoFundacao
    ) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumeroFuncionarios() {
        return this.numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public double getReceitaAnual() {
        return this.receitaAnual;
    }

    public void setReceitaAnual(double receitaAnual) {
        this.receitaAnual = receitaAnual;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getAnoFundacao() {
        return this.anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}
