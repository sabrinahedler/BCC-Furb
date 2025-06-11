public class Produto {

    /*
     * Atributos:
     * • codigo (int) - código único do produto
     * • nome (String) - nome do produto
     * • quantidade (int) - quantidade em estoque
     * • preco (double) - preço unitário
     * • categoria (String) - categoria do produto
     * Métodos:
     * • Construtor com todos os parâmetros
     * • adicionarEstoque(int quantidade) - adiciona produtos ao estoque
     * • removerEstoque(int quantidade) - remove produtos do estoque (retorna
     * boolean indicando sucesso)
     * • calcularValorTotal() - retorna o valor total do produto em estoque
     * (quantidade × preço)
     * • toString() - retorna uma representação em String dos dados do produto
     */

    // atributos:
    int codigo;
    String nome;
    int quantidade;
    double preco;
    String categoria;

    public Produto(int codigo, String nome, int quantidade, double preco, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

    // métodos para puxar atributos para outras classes
    public int getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    // método void pois não retorna nada
    void AdicionarEstoque(int quantidade) {

        this.quantidade = this.quantidade + quantidade;
    }

    // boolean, porq se retornar false, não irá executar
    public boolean removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    public double calcularValorTotal() {
        return this.quantidade * this.preco;
    }

    // serve para detalhar o objeto, no caso agora, produto
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade +
                ", Preço: R$" + preco + ", Categoria: " + categoria +
                ", Valor Total: R$" + calcularValorTotal();
    }
}