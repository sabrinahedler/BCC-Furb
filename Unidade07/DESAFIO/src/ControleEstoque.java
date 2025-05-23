public class ControleEstoque {

    /*
     * Atributos:
     * • produtos - vetor de objetos Produto (capacidade para 30 produtos)
     * • quantidadeProdutos (int) - controla quantos produtos estão cadastrados
     * Métodos públicos:
     * • Construtor padrão (inicializa o vetor e a quantidade)
     * • cadastrarProduto(Produto produto) - adiciona um produto ao estoque
     * • buscarProduto(int codigo) - retorna o produto com o código informado (ou
     * null se não encontrar)
     * 2
     * • listarTodosProdutos() - exibe todos os produtos cadastrados
     * • listarProdutosPorCategoria(String categoria) - lista produtos de uma
     * categoria específica
     * • calcularValorTotalEstoque() - calcula o valor total de todos os produtos em
     * estoque
     */

     Produto [] produtos;
     int quantidadeProdutos;
     
     public ControleEstoque() {
        produtos = new Produto[30];
        quantidadeProdutos = 0;
    }
    public void cadastrarProduto(Produto produto) {
        if (quantidadeProdutos < produtos.length) {
            produtos[quantidadeProdutos++] = produto;
            System.out.println("Produto cadastrado com sucesso!");
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public Produto buscarProduto(int codigo) {
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produtos[i].getCodigo() == codigo) {
                return produtos[i];
            }
        }
        return null;
    }

    public void listarTodosProdutos() {
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println(produtos[i]);
        }
    }

    public void listarProdutosPorCategoria(String categoria) {
        for (int i = 0; i < quantidadeProdutos; i++) {
            if (produtos[i].getCategoria().equalsIgnoreCase(categoria)) {
                System.out.println(produtos[i]);
            }
        }
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            total += produtos[i].calcularValorTotal();
        }
        return total;
    }
}