public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    // Construtor completo
    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Construtor sobrecarregado (quantidade = 0)
    public Produto(String nome, Double preco) {
        this(nome, preco, 0);
    }

    // Métodos básicos
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

    // Métodos adicionais
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
}