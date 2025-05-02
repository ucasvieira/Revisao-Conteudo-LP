import java.util.Scanner;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, Double preco) {
        this(nome, preco, 0);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade);
    }

    public void adicionarEstoque(Integer quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(Integer quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public Double calcularValorTotal() {
        return preco * quantidade;
    }

    public Boolean estaDisponivel() {
        return quantidade > 0;
    }

    public void aplicarDesconto(Double percentual) {
        preco *= (1 - percentual / 100);
        System.out.println("Novo preço após desconto: R$" + preco);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto p = null;

        System.out.println("Como quer cadastrar o produto? (1 - Completo / 2 - Sobrecarregado):");
        int resposta = sc.nextInt();
        sc.nextLine();

        if (resposta == 1) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            Double preco = sc.nextDouble();
            System.out.print("Digite a quantidade do produto: ");
            Integer quantidade = sc.nextInt();
            sc.nextLine();
            p = new Produto(nome, preco, quantidade);
        } else if (resposta == 2) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            Double preco = sc.nextDouble();
            sc.nextLine();
            p = new Produto(nome, preco);
        } else {
            System.out.println("Opção inválida.");
            System.exit(0);
        }

        boolean executar = true;
        while (executar) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Exibir informações");
            System.out.println("2 - Adicionar estoque");
            System.out.println("3 - Remover estoque");
            System.out.println("4 - Calcular valor total");
            System.out.println("5 - Verificar disponibilidade");
            System.out.println("6 - Aplicar desconto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    p.exibirInfo();
                    break;
                case 2:
                    System.out.print("Quantidade a adicionar: ");
                    int adicionar = sc.nextInt();
                    sc.nextLine();
                    p.adicionarEstoque(adicionar);
                    break;
                case 3:
                    System.out.print("Quantidade a remover: ");
                    int remover = sc.nextInt();
                    sc.nextLine();
                    p.removerEstoque(remover);
                    break;
                case 4:
                    System.out.println("Valor total do estoque: R$" + p.calcularValorTotal());
                    break;
                case 5:
                    System.out.println("Disponível: " + p.estaDisponivel());
                    break;
                case 6:
                    System.out.print("Percentual de desconto (%): ");
                    Double desconto = sc.nextDouble();
                    sc.nextLine();
                    p.aplicarDesconto(desconto);
                    break;
                case 0:
                    executar = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}