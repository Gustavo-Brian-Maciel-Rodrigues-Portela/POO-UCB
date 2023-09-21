package Atividade5;

public class veiculo {
    
    protected String marca;
    protected String modelo;
    protected int anoDeFabricacao;
    protected int velocidade;

    public veiculo(String marca, String modelo, int anoDeFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setMarca(String marca) {
       this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
      this.anoDeFabricacao = anoDeFabricacao;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() {
        this.velocidade++;
    }

    public void frear() {
        this.velocidade--;
    }

}
