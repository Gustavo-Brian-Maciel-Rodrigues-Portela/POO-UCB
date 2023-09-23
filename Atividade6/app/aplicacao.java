import industrias.industriaAlimenticia;
import industrias.industriaAutomobilistica;
import industrias.industriaFarmaceutica;
import java.util.ArrayList;
import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crie o Scanner uma vez no método main

        ArrayList<industriaAlimenticia> industriaAl = new ArrayList<>();
        ArrayList<industriaAutomobilistica> industriaAu = new ArrayList<>();
        ArrayList<industriaFarmaceutica> industriaFa = new ArrayList<>();

        while (true) {
            switch (pergunta(scanner)) {
                case 1:
                    switch (tipoIndustria(scanner)) {
                        case 1:
                            industriaAl.add(new industriaAlimenticia(
                                    adicionarNomeIndustria(scanner),
                                    adicionarEnderecoIndustria(scanner),
                                    adicionarCjpjIndustria(scanner),
                                    adicionarAnoFundacao(scanner),
                                    adicionarTipoProdutosAlimenticios(scanner),
                                    adicionarUtilizaIngredientesOrganicos(scanner)
                            ));
                            break;
                        case 2:
                            industriaAu.add(new industriaAutomobilistica(
                                    adicionarNomeIndustria(scanner),
                                    adicionarEnderecoIndustria(scanner),
                                    adicionarCjpjIndustria(scanner),
                                    adicionarAnoFundacao(scanner),
                                    adicionarTipoVeiculo(scanner),
                                    adicionarFabricacaoCarrosEletricos(scanner)
                            ));
                            break;
                        case 3:
                            industriaFa.add(new industriaFarmaceutica(
                                    adicionarNomeIndustria(scanner),
                                    adicionarEnderecoIndustria(scanner),
                                    adicionarCjpjIndustria(scanner),
                                    adicionarAnoFundacao(scanner),
                                    AdicionarEspecialidadeFarmaceutica(scanner),
                                    AdicionarPesquisaEmAndamento(scanner)
                            ));
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

    public static void limparTerminal() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int inputInt(Scanner scanner) {
        int resposta;
        resposta = scanner.nextInt();
        limparTerminal();
        return resposta;
    }

    public static String inputString(Scanner scanner) {
        String resposta;
        resposta = scanner.nextLine();
        limparTerminal();
        return resposta;
    }

    public static boolean inputBoolean(Scanner scanner) {
        System.out.println("(1) Sim.");
        System.out.println("(2) Não.");
        int resposta = inputInt(scanner);
        limparTerminal();
        return ( resposta == 1);
    }

    public static int pergunta(Scanner scanner) {
        System.out.println("O que você deseja fazer ?");
        System.out.println("(1) Adicionar uma indústria.");
        System.out.println("(2) Adicionar um produto a uma indústria.");
        System.out.print("Opção: ");
        return inputInt(scanner);
    }

    public static int tipoIndustria(Scanner scanner) {
        System.out.println("Insira o tipo da indústria.");
        System.out.println("(1) Indústria alimentícia.");
        System.out.println("(2) Indústria automobilística.");
        System.out.println("(3) Indústria farmacêutica.");
        System.out.print("Opção: ");
        return inputInt(scanner);
    }

    public static String adicionarNomeIndustria(Scanner scanner) {
        System.out.println("Nome da indústria: ");
        return inputString(scanner);
    }

    public static String adicionarEnderecoIndustria(Scanner scanner) {
        System.out.println("Endereço da indústria: ");
        return inputString(scanner);
    }

    public static String adicionarCjpjIndustria(Scanner scanner) {
        System.out.println("CJPJ: ");
        return inputString(scanner);
    }

    public static int adicionarAnoFundacao(Scanner scanner) {
        System.out.println("Ano da fundação: ");
        return inputInt(scanner);
    }

    public static String adicionarTipoProdutosAlimenticios(Scanner scanner) {
        System.out.println("Tipo do produto alimentício: ");
        return inputString(scanner);
    }

    public static boolean adicionarUtilizaIngredientesOrganicos(Scanner scanner) {
        System.out.println("Utiliza ingredientes orgânicos?");
        return inputBoolean(scanner);
    }

    public static String adicionarTipoVeiculo(Scanner scanner) {
        System.out.println("Tipo do veículo: ");
        return inputString(scanner);
    }

    public static boolean adicionarFabricacaoCarrosEletricos(Scanner scanner) {
        System.out.println("Fabrica carros elétricos?");
        return inputBoolean(scanner);
    }

    public static String AdicionarEspecialidadeFarmaceutica(Scanner scanner) {
        System.out.println("Especialidade farmacêutica: ");
        return inputString(scanner);
    }

    public static boolean AdicionarPesquisaEmAndamento(Scanner scanner) {
        System.out.println("Há pesquisas em andamento?");
        return inputBoolean(scanner);
    }

}
