package Atividade5;
import Atividade5.veiculo;
import Atividade5.moto;
import Atividade5.carro;
import Atividade5.bicicleta;

public class exe {
    public static void main(String[] args) {
        carro objC1 = new carro("tantoFaz1", "fusca", 1990);
        moto objM1 = new moto("tantoFaz2", "Biz", 2000);
        bicicleta objB1 = new bicicleta("tantoFaz3", "seiLa", 2015);

        System.out.println(objC1.velocidade);
        System.out.println(objC1.getPortas());
        objC1.abrirPortas();
        objC1.acelerar();
        System.out.println(objC1.velocidade);
        System.out.println(objC1.getPortas());
        System.out.println("\n");
        objM1.empinar();
        System.out.println("\n");
        System.out.println(objB1.getMarcha());
        objB1.addMarcha();
        System.out.println(objB1.getMarcha());


    }
}