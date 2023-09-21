package Atividade5;

public class carro extends veiculo{
    public final int velocidadeMax = 500;
    private boolean portasTrancadas = true;
    public carro(String marca, String modelo, int anoDeFabricacao) {
        super(marca, modelo, anoDeFabricacao);
    }
    @Override
    public void acelerar() {
        this.velocidade=(this.velocidade>velocidadeMax)?velocidadeMax:++this.velocidade;
    }

    @Override
    public void frear() {
        this.velocidade=(this.velocidade<0)?0:--this.velocidade;
    }

    public void abrirPortas() {
        this.portasTrancadas = false;
    }

    public void fecharPortas() {
        this.portasTrancadas = true;
    }

    public boolean getPortas() {
        return this.portasTrancadas;
    }
}
