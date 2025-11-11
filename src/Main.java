import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Perguntar quantos produtos serão cadastrados
        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidade = input.nextInt();
        input.nextLine(); // limpar buffer

        // 2. Criar um array de objetos Produto
        produto[] produtos = new produto[quantidade];

        // 3. Ler dados de cada produto
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Preço: ");
            double preco = input.nextDouble();
            input.nextLine(); // limpar buffer

            produtos[i] = new produto(nome, preco);
        }

        // 4. Imprimir todas as informações dos produtos
        System.out.println("\n=== Lista de Produtos ===");
        for (produto p : produtos) {
            p.imprimirInformacoes();
        }

        // 5. Encontrar o produto mais caro
        produto maisCaro = produtos[0];
        for (int i = 1; i < produtos.length; i++) {
            if (produtos[i].getPreco() > maisCaro.getPreco()) {
                maisCaro = produtos[i];
            }
        }

        System.out.println("\n=== Produto Mais Caro ===");
        maisCaro.imprimirInformacoes();

        input.close();
    }
}
