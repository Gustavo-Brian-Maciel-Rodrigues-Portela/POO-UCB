package produtos;

public class produtoFarmaceutico extends produto{
    private String principioAtivo;
    private double Dosagem;
    private String formaFarmaceutica;

    public produtoFarmaceutico(
        String nome,
        String descricao, 
        double preco, 
        int quantidadeEmEstoque,
        String categoria,
        String fabricante
    ) {
        super(
            nome, 
            descricao, 
            preco, 
            quantidadeEmEstoque, 
            categoria, 
            fabricante
        );
    }

    public String getPrincipioAtivo() {
        return this.principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public double getDosagem() {
        return this.Dosagem;
    }

    public void setDosagem(double Dosagem) {
        this.Dosagem = Dosagem;
    }

    public String getFormaFarmaceutica() {
        return this.formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

}
