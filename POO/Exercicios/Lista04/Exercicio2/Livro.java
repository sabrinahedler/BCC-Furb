package Exercicio2;

public class Livro {

	private String titulo;
    private String autor;
    private int anoPublicacao;
    private static int totalLivros = 0;

    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        totalLivros++;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        totalLivros++;
    }

    public String exibirInfo() {
        return "Título: " + titulo + ". Autor: " + autor + ". Ano: " + anoPublicacao;
    }

    public String exibirInfo(boolean resumido) {
        if (resumido) {
            return "Título: " + titulo;
        } else {
            return exibirInfo(); 
        }
    }

    public static int getTotalLivros() {
        return totalLivros;
    }
}
