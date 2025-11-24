package POO;

import java.time.LocalDate;

public interface MovimentacaoEstoque {
    void consultaTotalEstoqueCategoria(String categoria);
    void consultaTotalEstoque();
    void listarSaida(String classificacao, LocalDate data);
    void listarEntrada(String classificacao, LocalDate data);
    void estoqueAvaria(Produto produto);
    void movimentacaoEstoque(String classificacao, LocalDate dataInicio, LocalDate dataFim);
    String listarEntrada();
    String listarSaida();
}