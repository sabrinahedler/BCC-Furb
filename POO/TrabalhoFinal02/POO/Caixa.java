package POO;
import java.util.List;
import java.util.Optional;

public class Caixa implements OperacoesCaixa {
    private double valorTotal;
    private List<Produto> estoque; // referência opcional ao estoque do sistema

    public Caixa(double valorInicial, List<Produto> estoque) {
        this.valorTotal = Math.max(0, valorInicial);
        this.estoque = estoque;
    }

    @Override
    public void realizarCompra() {
        System.out.println("realizarCompra: implementar lógica de compra e débito do caixa");
    }

    @Override
    public void realizarVenda(List<Produto> produtosVendidos) {
        if (produtosVendidos == null || produtosVendidos.isEmpty()) {
            System.out.println("Nenhum produto informado para venda.");
            return;
        }

        double totalVenda = 0.0;
        for (Produto p : produtosVendidos) {
            if (p == null) continue;
            int qtd = p.getQuantidade();
            double valorUnit = p.valorProduto();
            totalVenda += qtd * valorUnit;
            // reduzir do estoque referenciado, se presente
            if (estoque != null) {
                Optional<Produto> opt = estoque.stream()
                        .filter(e -> e.getCodigo() == p.getCodigo())
                        .findFirst();
                if (opt.isPresent()) {
                    Produto estoqueProduto = opt.get();
                    int novaQtd = Math.max(0, estoqueProduto.getQuantidade() - qtd);
                    estoqueProduto.setQuantidade(novaQtd);
                }
            }
        }
        valorTotal += totalVenda;
        System.out.println("Venda realizada. Total: " + totalVenda + " | Caixa agora: " + valorTotal);
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    
    public void setValorTotal(double valorTotal) {         // Setters/Getters
    	this.valorTotal = valorTotal; 
    }
    
    
    public List<Produto> getEstoque() { 
    	return estoque; 
    }
    
    
    public void setEstoque(List<Produto> estoque) { this.estoque = estoque; }
}