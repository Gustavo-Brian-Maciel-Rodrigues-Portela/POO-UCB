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
                            industriaAl.add(new industriaAlimenticia(adicionarNomeIndustria(), adicionarEnderecoIndustria(), adicionarCjpjIndustria(), adicionarAnoFundacao(), adicionarTipoProdutosAlimenticios(), adicionarUtilizaIngredientesOrganicos()));
                            break;
                        case 2:
                            industriaAu.add(new industriaAutomobilistica(adicionarNomeIndustria(), adicionarEnderecoIndustria(), adicionarCjpjIndustria(), adicionarAnoFundacao(), adicionarTipoVeiculo(), adicionarFabricacaoCarrosEletricos()));
                            break;
                        case 3:
                            industriaFa.add(new industriaFarmaceutica(adicionarNomeIndustria(), adicionarEnderecoIndustria(), adicionarCjpjIndustria(), adicionarAnoFundacao(), AdicionarEspecialidadeFarmaceutica(), AdicionarPesquisaEmAndamento()));
                            break;
                        default:
                            System.out.println("Opção inválida!");  
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

    public static int inputInt() {
        Scanner scan = new Scanner(System.in);
        int resposta;
        resposta = scan.nextInt();
        scan.close();
        return resposta;
    }

    public static String inputString() {
        Scanner scan = new Scanner(System.in);
        String resposta;
        resposta = scan.nextLine();
        scan.close();
        return resposta;
    }

    public static boolean inputBoolean() {
        System.out.println("(1) Sim.");
        System.out.println("(2) Não.");
        return (inputInt()==1)?true:false;
    }

    public static int pergunta() {
        System.out.println("O que você deseja fazer ?");
        System.out.println("(1) Adicionar uma industria.");
        System.out.println("(2) Adicionar um produto a uma industria.");
        System.out.println("Opção: ");
        return inputInt();
    }

    public static int tipoIndustria() {
        System.out.println("Insira o tipo da industria.");
        System.out.println("(1) Indústria alimentícia.");
        System.out.println("(2) Indústria automobilística.");
        System.out.println("(3) Indústria farmacêutica.");
        return inputInt();
    }

    public static String adicionarNomeIndustria() {
        System.out.println("Nome da indústria: ");
        return inputString();
    }

    public static String adicionarEnderecoIndustria() {
        System.out.println("Endereço da indústria: ");
        return inputString();
    }

    public static String adicionarCjpjIndustria() {
        System.out.println("CJPJ: ");
        return inputString();
    }

    public static int adicionarAnoFundacao() {
        System.out.println("Ano da fundação: ");
        return inputInt();
    }

    public static String adicionarTipoProdutosAlimenticios() {
        System.out.println("Tipo do produto alimentício: ");
        return inputString();
    }

    public static boolean adicionarUtilizaIngredientesOrganicos() {
        System.out.println("Utiliza ingredientes orgânicos?");
        return inputBoolean();
    }

    public static String adicionarTipoVeiculo() {
        System.out.println("Tipo do veículo: ");
        return inputString();
    }

    public static boolean adicionarFabricacaoCarrosEletricos() {
        System.out.println("Fabrica carros elétricos?");
        return inputBoolean();
    }

    public static String AdicionarEspecialidadeFarmaceutica() {
        System.out.println("Especialidade farmacêutica: ");
        return inputString();
    }

    public static boolean AdicionarPesquisaEmAndamento() {
        System.out.println("Há pesquisas em andamento?");
        return inputBoolean();
    }
}
