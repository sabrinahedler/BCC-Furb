package POO;

import java.util.List;

public interface OperacoesCaixa {
    void realizarCompra();
    void realizarVenda(List<Produto> produtosVendidos);
    double getValorTotal();
}