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
                    adicionarProduto(scanner, industriaAl, industriaAu, industriaFa);
                    limparTerminal();
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

    public static double inputDouble(Scanner scanner) {
        double resposta;
        resposta = scanner.nextDouble();
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
        System.out.print("CNPJ: ");
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
            ArrayList <industriaAlimenticia> industriasAlimenticias,
            ArrayList <industriaAutomobilistica> industriasAutomobilisticas,
            ArrayList <industriaFarmaceutica> industriasFarmaceuticas
    ) {
        int contador=0;
        System.out.println("(1) "+industriaAlimenticia.nomeclatura+"\n");
        for (industriaAlimenticia industriaAlimenticia : industriasAlimenticias) {
            System.out.println("Index: "+contador+"| Indústria: "+industriaAlimenticia.getNome());
            contador++;
        }   
        contador = 0;
        System.out.println("\n(2) "+industriaAutomobilistica.nomeclatura+"\n");
        for(industriaAutomobilistica industriaAutomobilistica : industriasAutomobilisticas) {
            System.out.println("Index: "+contador+"| Indústria: "+industriaAutomobilistica.getNome());
            contador++;
        }
        System.out.println("\n(3) "+industriaFarmaceutica.nomeclatura+"\n");
        contador = 0;
        for (industriaFarmaceutica industriaFarmaceutica : industriasFarmaceuticas) {
            System.out.println("Index: "+contador+"| Indústria: "+industriaFarmaceutica.getNome());
            contador++;
        }
    }

    public static void adicionarProduto(
        Scanner scanner,
        ArrayList <industriaAlimenticia> industriasAlimenticias,
        ArrayList <industriaAutomobilistica> industriasAutomobilisticas,
        ArrayList <industriaFarmaceutica> industriasFarmaceuticas    
    ) {
        System.out.print("\n\nInsira o número que vem antes do nome do agrupamento das indústrias selecionado: ");
        int agrupamento = inputInt(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);
        System.out.print("\nInsira o index da indústria selecionada: ");
        int index = inputInt(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);
        System.out.print("\nInsira o nome do produto: ");
        String nome = inputString(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);
        System.out.print("\nInsira o descrição do produto: ");
        String descricao = inputString(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);
        System.out.print("\nInsira o preço do produto: ");
        double preco = inputDouble(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);
        System.out.print("\nInsira a quantidade em estoque: ");
        int quantidadeEmEstoque = inputInt(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);
        System.out.print("\ninsira a categoria: ");
        String categoria = inputString(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);
        System.out.print("\nInsira o fabricante: ");
        String fabricante = inputString(scanner);
        mostrarIndustrias(industriasAlimenticias, industriasAutomobilisticas, industriasFarmaceuticas);

        switch(agrupamento) {
            case 1:
                industriasAlimenticias.get(index).criarProduto(
                    nome,
                    descricao, 
                    preco, 
                    quantidadeEmEstoque, 
                    categoria, 
                    fabricante
                );
                break;
            case 2:
                System.out.println("Insira o modelo: ");
                String modelo = inputString(scanner);
                System.out.println("Insira a marca: ");
                String marca = inputString(scanner);
                industriasAutomobilisticas.get(index).criarProduto(
                    nome,
                    descricao, 
                    preco, 
                    quantidadeEmEstoque, 
                    categoria, 
                    fabricante,
                    modelo,
                    marca
                );
                break;
            case 3:
                industriasFarmaceuticas.get(index).criarProduto(
                    nome,
                    descricao, 
                    preco, 
                    quantidadeEmEstoque, 
                    categoria, 
                    fabricante
                );
                break;
            default:
                System.out.println("Opção inválida!");
                break; 
        }

    }

}
