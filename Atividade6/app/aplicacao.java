import industrias.industriaAlimenticia;
import industrias.industriaAutomobilistica;
import industrias.industriaFarmaceutica;
import java.util.ArrayList;
import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        limparTerminal();
        Scanner scanner = new Scanner(System.in);

        ArrayList<industriaAlimenticia> industriaAl = new ArrayList<>();
        ArrayList<industriaAutomobilistica> industriaAu = new ArrayList<>();
        ArrayList<industriaFarmaceutica> industriaFa = new ArrayList<>();

        while(true) {
            switch(pergunta(scanner)) {
                case 1:
                    switch(tipoIndustria(scanner)) {
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
                    mostrarIndustrias(industriaAl,industriaAu,industriaFa);
                    inputInt(scanner);
                    break;
                case 3:
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
        scanner.nextLine();
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
        System.out.println("\n(1) Sim.");
        System.out.println("(2) Não.");
        System.out.print("Opção: ");
        int resposta = inputInt(scanner);
        limparTerminal();
        return (resposta == 1);
    }

    public static int pergunta(Scanner scanner) {
        System.out.println("O que você deseja fazer ?");
        System.out.println("(1) Adicionar uma indústria.");
        System.out.println("(2) Adicionar um produto a uma indústria.");
        System.out.println("(3) Visualizar as indústrias e seus respectivos produtos.");
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
        System.out.print("Nome da indústria: ");
        return inputString(scanner);
    }

    public static String adicionarEnderecoIndustria(Scanner scanner) {
        System.out.print("Endereço da indústria: ");
        return inputString(scanner);
    }

    public static String adicionarCjpjIndustria(Scanner scanner) {
        System.out.print("CJPJ: ");
        return inputString(scanner);
    }

    public static int adicionarAnoFundacao(Scanner scanner) {
        System.out.print("Ano da fundação: ");
        return inputInt(scanner);
    }

    public static String adicionarTipoProdutosAlimenticios(Scanner scanner) {
        System.out.print("Tipo do produto alimentício: ");
        return inputString(scanner);
    }

    public static boolean adicionarUtilizaIngredientesOrganicos(Scanner scanner) {
        System.out.print("Utiliza ingredientes orgânicos?");
        return inputBoolean(scanner);
    }

    public static String adicionarTipoVeiculo(Scanner scanner) {
        System.out.print("Tipo do veículo: ");
        return inputString(scanner);
    }

    public static boolean adicionarFabricacaoCarrosEletricos(Scanner scanner) {
        System.out.print("Fabrica carros elétricos?");
        return inputBoolean(scanner);
    }

    public static String AdicionarEspecialidadeFarmaceutica(Scanner scanner) {
        System.out.print("Especialidade farmacêutica: ");
        return inputString(scanner);
    }

    public static boolean AdicionarPesquisaEmAndamento(Scanner scanner) {
        System.out.print("Há pesquisas em andamento?");
        return inputBoolean(scanner);
    }

    public static void mostrarIndustrias(
            ArrayList <industriaAlimenticia> industriaAlimenticias,
            ArrayList <industriaAutomobilistica> industriaAutomobilisticas,
            ArrayList <industriaFarmaceutica> industriaFarmaceuticas
    ) {
        int contador=0;
        for (industriaAlimenticia industriaAlimenticia : industriaAlimenticias) {
            System.out.println(industriaAlimenticia.getNome()+" "+industriaAlimenticia.nomeclatura+" Indústria-----: "+contador);
            contador++;
        }   
        contador = 0;
        System.out.println("\n");
        for(industriaAutomobilistica industriaAutomobilistica : industriaAutomobilisticas) {
            System.out.println(industriaAutomobilistica.getNome()+" "+industriaAutomobilistica.nomeclatura+" Indústria-: "+contador);
            contador++;
        }
        System.out.println("\n");
        contador = 0;
        for (industriaFarmaceutica industriaFarmaceutica : industriaFarmaceuticas) {
            System.out.println(industriaFarmaceutica.getNome()+" "+industriaFarmaceutica.nomeclatura+" Indústria----: "+contador);
            contador++;
        }
    }

}
