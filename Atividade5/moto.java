package Atividade5;

public class moto extends veiculo{
    public final int velocidadeMax = 400;
    public moto(String marca, String modelo, int anoDeFabricacao) {
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

    public void empinar() {
        System.out.println("A moto empinou");
    }
}
