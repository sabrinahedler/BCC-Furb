package POO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque implements MovimentacaoEstoque {
    private List<Produto> estoqueTotal = new ArrayList<>();
    private List<Produto> estoqueComponentes = new ArrayList<>();
    private List<Produto> estoquePerifericos = new ArrayList<>();
    private List<Produto> estoqueOutros = new ArrayList<>();

    public Estoque() {}

    public void adicionarProduto(Produto p) {
        if (p == null) return;
        estoqueTotal.add(p);
        distribuirPorTipo(p);
    }

    public void removerProduto(Produto p) {
        if (p == null) return;
        estoqueTotal.remove(p);
        estoqueComponentes.remove(p);
        estoquePerifericos.remove(p);
        estoqueOutros.remove(p);
    }

    private void distribuirPorTipo(Produto p) {
        String tipo = p.getTipo() == null ? "" : p.getTipo().toLowerCase();
        if ("componente".equals(tipo)) estoqueComponentes.add(p);
        else if ("periferico".equals(tipo)) estoquePerifericos.add(p);
        else estoqueOutros.add(p);
    }

    @Override
    public void consultaTotalEstoqueCategoria(String categoria) {
    	String categoriaFiltro = categoria == null ? "" : categoria;
    	int total = estoqueTotal.stream()
    	.filter(prod -> prod.getTipo() != null &&
        categoriaFiltro.equalsIgnoreCase(prod.getTipo()))
    	.mapToInt(Produto::getQuantidade)
    	.sum();
    }

    @Override
    public void consultaTotalEstoque() {
        int total = estoqueTotal.stream().mapToInt(Produto::getQuantidade).sum();
        System.out.println("Total no estoque: " + total);
    }

    @Override
    public void listarSaida(String classificacao, LocalDate data) {
        List<Produto> filtro = estoqueTotal.stream()
                .filter(p -> matchesClassificacaoAndDate(p, classificacao, data))
                .collect(Collectors.toList());
        filtro.forEach(System.out::println);
    }

    @Override
    public void listarEntrada(String classificacao, LocalDate data) {
        List<Produto> filtro = estoqueTotal.stream()
                .filter(p -> matchesClassificacaoAndDate(p, classificacao, data))
                .collect(Collectors.toList());
        filtro.forEach(System.out::println);
    }

    private boolean matchesClassificacaoAndDate(Produto p, String classificacao, LocalDate data) {
        boolean tipoOk = classificacao == null || classificacao.isEmpty()
                || classificacao.equalsIgnoreCase(p.getTipo());
        boolean dataOk = data == null || data.equals(p.getDataEntrada());
        return tipoOk && dataOk;
    }

    @Override
    public void estoqueAvaria(Produto produto) {
        if (produto == null) return;
        produto.setQuantidade(0);
        System.out.println("Produto marcado como avaria: " + produto);
    }

    @Override
    public void movimentacaoEstoque(String classificacao, LocalDate dataInicio, LocalDate dataFim) {
        List<Produto> mov = estoqueTotal.stream()
                .filter(p -> (classificacao == null || classificacao.isEmpty()
                              || classificacao.equalsIgnoreCase(p.getTipo()))
                        && (dataInicio == null || !p.getDataEntrada().isBefore(dataInicio))
                        && (dataFim == null || !p.getDataEntrada().isAfter(dataFim)))
                .collect(Collectors.toList());
        mov.forEach(System.out::println);
    }

    @Override
    public String listarEntrada() {
        return estoqueTotal.stream().map(Produto::toString).collect(Collectors.joining("; "));
    }

    @Override
    public String listarSaida() {
        // Sem histórico de saídas explícito, retornamos mesma listagem por enquanto
        return listarEntrada();
    }

    // Getters
    public List<Produto> getEstoqueTotal() { return estoqueTotal; }
    public List<Produto> getEstoqueComponentes() { return estoqueComponentes; }
    public List<Produto> getEstoquePerifericos() { return estoquePerifericos; }
    public List<Produto> getEstoqueOutros() { return estoqueOutros; }
    
    
}