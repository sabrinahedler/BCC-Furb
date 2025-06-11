import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        ControleEstoque estoque = new ControleEstoque();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Entrada de mercadoria");
            System.out.println("3. Saída de mercadoria");
            System.out.println("4. Listar todos os produtos");
            System.out.println("5. Listar produtos por categoria");
            System.out.println("6. Buscar produto por código");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = teclado.nextInt();
                    System.out.print("Preço: ");
                    double preco = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = teclado.nextLine();
                    estoque.cadastrarProduto(new Produto(codigo, nome, quantidade, preco, categoria));
                    break;
                case 2:
                    System.out.print("Código do produto: ");
                    Produto entrada = estoque.buscarProduto(teclado.nextInt());
                    if (entrada != null) {
                        System.out.print("Quantidade a adicionar: ");
                        entrada.AdicionarEstoque(teclado.nextInt());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Código do produto: ");
                    Produto saida = estoque.buscarProduto(teclado.nextInt());
                    if (saida != null) {
                        System.out.print("Quantidade a remover: ");
                        if (!saida.removerEstoque(teclado.nextInt())) {
                            System.out.println("Quantidade insuficiente.");
                        }
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    estoque.listarTodosProdutos();
                    break;
                case 5:
                    teclado.nextLine();
                    System.out.print("Categoria: ");
                    estoque.listarProdutosPorCategoria(teclado.nextLine());
                    break;
                case 6:
                    System.out.print("Código do produto: ");
                    Produto p = estoque.buscarProduto(teclado.nextInt());
                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);

        teclado.close();
    }
}