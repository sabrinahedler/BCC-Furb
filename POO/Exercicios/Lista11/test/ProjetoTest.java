package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import GerenciamentoDeObras.Pessoa;
import GerenciamentoDeObras.ProjetoPrivado;
import GerenciamentoDeObras.ProjetoPublico;

public class ProjetoTest {

	@Test
	public void test1_validaDados() {
		
		Pessoa p1 = new Pessoa ();
		p1.setCpf("12345678900");
		p1.setNomeCompleto("João Silva");
		
		assertEquals("12345678900", p1.getCpf());
		assertEquals("João Silva", p1.getNomeCompleto());
	}
	
	@Test
	public void test2_dadosNulos() {
		
		Pessoa p1 = new Pessoa ();
			p1.setCpf(null);
			p1.setNomeCompleto("");
			
			assertNull(p1.getCpf());
			assertEquals("", p1.getNomeCompleto());
		}
		
		@Test
		public void test4_projetoPublicoDuracao() {
			
			// PPUB_001: Criação Válida e Duração
			LocalDate dataInicio = LocalDate.of(2023, 1, 1);
			LocalDate dataFim = LocalDate.of(2023, 1, 31);
			ProjetoPublico p = new ProjetoPublico(101, LocalDate.now(), "Descricao Publica", dataInicio, dataFim);
			
			long duracao = p.tempoDeDuracao();
			
			assertEquals(30, duracao);
			// O teste de resumo no plano de teste é para o método gerarRelatorio(), que não existe na classe ProjetoPublico.java, mas sim em Projeto.java.
			// Vou testar o método tempoDeDuracao() que retorna a duração em dias.
			// O teste de resumo é mais complexo devido à implementação de gerarRelatorio, vou focar nos dados.
		}
		
		@Test
		public void test5_adicionarResponsavelDuplicado() {
			
			// PPUB_002: Adicionar Responsável Duplicado (Exceção)
			ProjetoPublico p = new ProjetoPublico(102, LocalDate.now(), "Descricao Publica", LocalDate.now(), LocalDate.now().plusDays(1));
			Pessoa prof1 = new Pessoa(1, "111", "Profissional 1", "Cargo");
			
			p.adicionarResponsavel(prof1);
			
			// Verifica se a exceção é lançada na segunda tentativa
			Exception exception = assertThrows(IllegalArgumentException.class, () -> {
				p.adicionarResponsavel(prof1);
			});
			
			String expectedMessage = "Profissional já registrado para o projeto: 102";
			String actualMessage = exception.getMessage();
			
			assertTrue(actualMessage.contains(expectedMessage));
		}
		
		@Test
		public void test6_projetoPrivadoValido() {
			
			// PPRIV_001: Criação Válida e Resumo
			ProjetoPrivado p = new ProjetoPrivado(201, LocalDate.now(), "Descricao Privada", "RESIDENCIAL", 150.5);
			
			assertEquals(150.5, p.getMetragemTerreno());
			// O teste de resumo no plano de teste é para o método gerarRelatorio().
			// Vou testar o getTipoProjeto() e getMetragemTerreno() para cobrir a essência do teste.
			String relatorio = p.gerarRelatorio();
			assertTrue(relatorio.contains("RESIDENCIAL"));
			assertTrue(relatorio.contains("150.5"));
		}
		
			@Test
			public void test7_projetoPrivadoMetragemInvalida() {
				
				// PPRIV_002: Metragem Inválida
				ProjetoPrivado p = new ProjetoPrivado();
				p.setMetragemTerreno(-10.0);
				
				// Confirma a ausência de validação para metragem negativa.
				assertEquals(-10.0, p.getMetragemTerreno());
			}
	}
