package app;

import industrias.industriaAlimenticia;
import industrias.industriaAutomobilistica;
import industrias.industriaFarmaceutica;
import java.util.ArrayList;
import java.util.Scanner;

public class aplicacao{
    public static void main(String[] args) {
        
        ArrayList<industriaAlimenticia> industriaAl = new ArrayList<>();
        ArrayList<industriaAutomobilistica> industriaAu = new ArrayList<>();
        ArrayList<industriaFarmaceutica> industriaFa = new ArrayList<>();
        

        while(true) {
            switch(pergunta()) {
                case 1:
                    switch(tipoIndustria()) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida!");  
                    break;  
            }
        }
        
    }

    public static int pergunta() {
        Scanner scan = new Scanner(System.in);
        int resposta;
        System.out.println("O que você deseja fazer ?");
        System.out.println("(1) Adicionar uma industria.");
        System.out.println("(2) Adicionar um produto a uma industria.");
        System.out.println("Opção: ");
        resposta = scan.nextInt();
        scan.close();
        return resposta;
    }

    public static int tipoIndustria() {
        Scanner scan = new Scanner(System.in);
        int resposta;
        System.out.println("Insira o tipo da industria.");
        System.out.println("(1) Indústria alimentícia.");
        System.out.println("(2) Indústria automobilística.");
        System.out.println("(3) Indústria farmacêutica.");
        resposta = scan.nextInt();
        scan.close();
        return resposta;
    }

    public static void adicionarIndustria() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome da industria: ");

    }
}
