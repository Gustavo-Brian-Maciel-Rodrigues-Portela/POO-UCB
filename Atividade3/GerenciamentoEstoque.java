import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ItemEstoque {
    private String nome;
    private int quantidade;

    public ItemEstoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

class GerenciadorEstoque {
    private List<ItemEstoque> estoque;

    public GerenciadorEstoque() {
        estoque = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        estoque.add(new ItemEstoque(nome, quantidade));
    }

    public void removerItem(String nome) {
        estoque.removeIf(item -> item.getNome().equals(nome));
    }

    public void atualizarQuantidade(String nome, int novaQuantidade) {
        for (ItemEstoque item : estoque) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }

    public void listarItens() {
        System.out.println("Itens em estoque:");
        for (ItemEstoque item : estoque) {
            System.out.println("Nome: " + item.getNome() + ", Quantidade: " + item.getQuantidade());
        }
    }
}

public class GerenciamentoEstoque {
    public static void main(String[] args) {
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Atualizar quantidade");
            System.out.println("4 - Listar itens");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    gerenciador.adicionarItem(nome, quantidade);
                    break;
                case 2:
                    System.out.print("Digite o nome do item a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerItem(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do item a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    gerenciador.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    break;
                case 4:
                    gerenciador.listarItens();
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }
    }
}
