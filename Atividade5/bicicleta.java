package Atividade5;

public class bicicleta extends veiculo{
    public final int velocidadeMax = 45;
    public final int marchaMax = 20;
    public int marcha;

    public bicicleta(String marca, String modelo, int anoDeFabricacao) {
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

    public void addMarcha() {
        this.marcha=(this.marcha>marchaMax)?marchaMax:++this.marcha;
    }

    public void removeMarcha() {
        this.marcha=(this.marcha<0)?0:--this.marcha;
    }

    public int getMarcha() {
        return this.marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

}
