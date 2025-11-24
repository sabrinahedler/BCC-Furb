package test;

import POO.Caixa;
import POO.Estoque;
import POO.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ProjetoTeste {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    private Caixa criarCaixa(double valorInicial, List<Produto> estoque) {
        return new Caixa(valorInicial, estoque);
    }
    
    private Produto criarProduto(int codigo, String tipo, int quantidade, LocalDate data) {
        return new Produto(codigo, "Item " + codigo, tipo, 10.0, 0.1, quantidade, data);
    }
    private Produto criarProduto(int codigo, String tipo, int quantidade) {
        return criarProduto(codigo, tipo, quantidade, LocalDate.now());
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        outputStreamCaptor.reset();
    }
    
    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

	
	// ----------- Testes da classe Caixa -----------
	

    // Teste 01 da classe Caixa
    @Test
    public void imprimirMensagemListaDeVendaVazia() {
        Caixa caixa = criarCaixa(100.0, new ArrayList<>()); 
        String resultadoEsperado = "Nenhum produto informado para venda."; 
        caixa.realizarVenda(new ArrayList<>()); 
        assertEquals(resultadoEsperado, outputStreamCaptor.toString().trim(), "Deve imprimir mensagem para lista vazia."); 
    }

    
	
	// ----------- Testes da classe Estoque -----------
	
    
    // Teste 01 da classe Estoque
    @Test
    public void adicionarProdutoEstoqueTotal() {
        Estoque estoque = new Estoque();
        Produto p = criarProduto(1, "Componente", 5);
        estoque.adicionarProduto(p);
        assertEquals(1, estoque.getEstoqueTotal().size(), "O estoque total deve ter 1 produto.");
    }
	
    
    
    // Teste 02 da classe Estoque
    @Test
    public void removerProdutoEstoqueTotal() {
        Estoque estoque = new Estoque();
        Produto p = criarProduto(1, "Componente", 5);
        estoque.adicionarProduto(p);
        assertEquals(1, estoque.getEstoqueTotal().size());
        estoque.removerProduto(p);
        assertEquals(0, estoque.getEstoqueTotal().size(), "O estoque total deve estar vazio após a remoção.");
    }

    
	
    // Teste 03 da classe Estoque
    @Test
    public void imprimirTotalCorretoNoConsole() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(criarProduto(1, "Componente", 5));
        estoque.adicionarProduto(criarProduto(2, "Periferico", 10));
        String resultadoEsperado = "Total no estoque: 15";
        estoque.consultaTotalEstoque();
        assertTrue(outputStreamCaptor.toString().trim().contains(resultadoEsperado), "Deve imprimir o total correto de 15.");
    }

	
    
    // Teste 04 da classe Estoque
    @Test
    public void imprimirZeroParaEstoqueVazio() {
        Estoque estoque = new Estoque();
        String esperado = "Total no estoque: 0";
        estoque.consultaTotalEstoque();
        String saida = outputStreamCaptor.toString().trim();
        assertTrue(saida.contains(esperado), "Deve imprimir 'Total no estoque: 0' para estoque vazio.");
    }
    
  
	    
    // Estoque com dados de 4 argumentos para os testes 5 e 6
    private Estoque estoqueComDados() {
        Estoque estoque = new Estoque();
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        estoque.adicionarProduto(criarProduto(1, "Componente", 5, hoje));
        estoque.adicionarProduto(criarProduto(2, "Periferico", 10, ontem));
        estoque.adicionarProduto(criarProduto(3, "Componente", 15, ontem));
        estoque.adicionarProduto(criarProduto(4, "Outros", 20, hoje));
        
        return estoque;
    }
    
    // Teste 05 da classe Estoque
    @Test
    public void listarProdutosClassificacaoComponente() {
        Estoque estoque = estoqueComDados();
        String classificacao = "Componente";
        estoque.listarSaida(classificacao, null); 
        String saida = outputStreamCaptor.toString();
        assertTrue(saida.contains("codigo=1"), "Deve listar o Produto 1 (Componente).");
        assertTrue(saida.contains("codigo=3"), "Deve listar o Produto 3 (Componente).");
        assertFalse(saida.contains("codigo=2"), "Não deve listar o Produto 2 (Periferico).");
        assertFalse(saida.contains("codigo=4"), "Não deve listar o Produto 4 (Outros).");
    }
	
    
    
    // Teste 06 da classe Estoque
    @Test
    public void listarProdutosDataHoje() {
        Estoque estoque = estoqueComDados();
        LocalDate hoje = LocalDate.now();
        estoque.listarEntrada(null, hoje);
        String saida = outputStreamCaptor.toString();
        assertTrue(saida.contains("codigo=1"), "Deve listar o Produto 1 (Hoje).");
        assertTrue(saida.contains("codigo=4"), "Deve listar o Produto 4 (Hoje).");
        assertFalse(saida.contains("codigo=2"), "Não deve listar o Produto 2 (Ontem).");
        assertFalse(saida.contains("codigo=3"), "Não deve listar o Produto 3 (Ontem).");
    }

    
    
    // Teste 07 da classe Estoque
    @Test
    public void zerarQuantidadeEImprimirAvaria() {
        Estoque estoque = new Estoque();
        Produto p = criarProduto(1, "Componente", 5);
        estoque.adicionarProduto(p);
        String esperadoParcial = "Produto marcado como avaria: Produto{codigo=1,";
        estoque.estoqueAvaria(p);
        assertEquals(0, p.getQuantidade(), "A quantidade do produto deve ser zerada.");
        assertTrue(outputStreamCaptor.toString().trim().contains(esperadoParcial), "Deve imprimir a mensagem de avaria.");
    }
    
    
	
    // Teste 08 da classe Estoque
    @Test
    public void retornarStringFormatadaParaListarEntrada() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(criarProduto(1, "Componente", 5));
        estoque.adicionarProduto(criarProduto(2, "Periferico", 10));   // Adiciona DOIS produtos para garantir que o separador seja usado
        String entrada = estoque.listarEntrada();
        assertTrue(entrada.contains("Produto{codigo=1,"), "A listagem deve conter o primeiro produto.");
        assertTrue(entrada.contains("; "), "A listagem deve usar o separador '; ' entre os produtos.");
        assertTrue(entrada.contains("Produto{codigo=2,"), "A listagem deve conter o segundo produto.");
    }

    

    // Teste 09 da classe Estoque
    @Test
    public void retornarStringCorretaParaTamanhosDeLista() {
        Estoque estoque = new Estoque();
        Produto p1 = criarProduto(10, "Componente", 5);
        Produto p2 = criarProduto(20, "Periferico", 10); 
        String entradaVazia = estoque.listarEntrada();       // Lista Vazia
        assertEquals("", entradaVazia, "Deve retornar uma string vazia para um estoque vazio.");
    }
	
    
    

    // Teste 10 da classe Estoque
    @Test
    public void retornarMesmaStringQueListarEntrada() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(criarProduto(1, "Componente", 5));      // Adiciona alguns produtos para garantir que as listas não estejam vazias
        estoque.adicionarProduto(criarProduto(2, "Periferico", 10));
        String entrada = estoque.listarEntrada();
        String saida = estoque.listarSaida();
        assertEquals(entrada, saida, "O método listarSaida() deve retornar exatamente o mesmo que listarEntrada().");
        assertTrue(saida.contains("codigo=1"), "A string de saída deve conter os dados do produto.");         // Garantir que não está retornando uma string vazia
    }
	
    
	
	// ----------- Testes da classe Produto -----------
	
    
    // Teste 01 da classe Produto
    @Test
    public void calcularValorProdutoCorretamente() {
        Produto produto = criarProduto(1, "Mouse", 10); // Preço Custo: 10.0, Margem: 0.1
        double resultadoEsperado = 11.0;                // Esperado: 10.0 * (1 + 0.1) = 11.0
        double atual = produto.valorProduto();
        assertEquals(resultadoEsperado, atual, 0.001, "O valor do produto deve ser calculado com a margem de venda.");
    }
    
    
	
    // Teste 02 da classe Produto
    @Test
    public void conterNomeNoToString() {
        Produto produto = criarProduto(1, "Teclado", 1);
        String atual = produto.toString();
        assertTrue(atual.contains("nome='Item 1'"), "O toString deve conter o nome do produto.");
    }

	
}
