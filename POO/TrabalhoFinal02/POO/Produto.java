package POO;
import java.time.LocalDate;

public class Produto implements Calculavel {
    private int codigo;
    private String nome;
    private String tipo;
    private double precoCusto;
    private double porcentagemVenda; // ex: 0.30 = 30%
    private int quantidade;
    private LocalDate dataEntrada;

    public Produto(int codigo, String nome, String tipo, double precoCusto,
                   double porcentagemVenda, int quantidade, LocalDate dataEntrada) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.precoCusto = precoCusto;
        this.porcentagemVenda = porcentagemVenda;
        this.quantidade = quantidade;
        this.dataEntrada = dataEntrada;
    }

    @Override
    public double valorProduto() {
        return precoCusto * (1 + porcentagemVenda);
    }

    // Getters e Setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getPrecoCusto() { return precoCusto; }
    public void setPrecoCusto(double precoCusto) { this.precoCusto = precoCusto; }
    public double getPorcentagemVenda() { return porcentagemVenda; }
    public void setPorcentagemVenda(double porcentagemVenda) { this.porcentagemVenda = porcentagemVenda; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public LocalDate getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precoCusto=" + precoCusto +
                ", porcentagemVenda=" + porcentagemVenda +
                ", quantidade=" + quantidade +
                ", dataEntrada=" + dataEntrada +
                '}';
    }
}