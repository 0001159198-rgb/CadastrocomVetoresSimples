public class produto {
    private String nome;
    private double preco;

    // Construtor
    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome + " | Preço: R$" + preco);
    }
}
