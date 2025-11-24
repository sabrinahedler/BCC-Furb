package POO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.*;

public class SistemaGUI extends JFrame {
    private Estoque estoque = new Estoque();
    private Caixa caixa = new Caixa(0.0, estoque.getEstoqueTotal());

    // Componentes da interface
    private JTextField txtCodigo = new JTextField(5);
    private JTextField txtNome = new JTextField(10);
    private JTextField txtTipo = new JTextField(10);
    private JTextField txtPreco = new JTextField(7);
    private JTextField txtPorcentagem = new JTextField(5);
    private JTextField txtQuantidade = new JTextField(5);

    private JTextArea txtOutput = new JTextArea(10, 40);

    public SistemaGUI() {
        super("Sistema de Estoque e Caixa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel de cadastro de produto
        JPanel painelCadastro = new JPanel(new GridLayout(7, 2));
        painelCadastro.add(new JLabel("Código:"));
        painelCadastro.add(txtCodigo);
        painelCadastro.add(new JLabel("Nome:"));
        painelCadastro.add(txtNome);
        painelCadastro.add(new JLabel("Tipo (componente/periferico/outro):"));
        painelCadastro.add(txtTipo);
        painelCadastro.add(new JLabel("Preço de Custo:"));
        painelCadastro.add(txtPreco);
        painelCadastro.add(new JLabel("Porcentagem Venda (ex: 0.3):"));
        painelCadastro.add(txtPorcentagem);
        painelCadastro.add(new JLabel("Quantidade:"));
        painelCadastro.add(txtQuantidade);

        JButton btnAdicionar = new JButton("Adicionar Produto");
        btnAdicionar.addActionListener(this::adicionarProduto);
        painelCadastro.add(btnAdicionar);

        JButton btnConsultar = new JButton("Consultar Estoque");
        btnConsultar.addActionListener(e -> consultarEstoque());
        painelCadastro.add(btnConsultar);

        // Painel de saída
        txtOutput.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtOutput);

        // Painel de operações de caixa
        JPanel painelCaixa = new JPanel();
        JButton btnVenda = new JButton("Realizar Venda");
        btnVenda.addActionListener(this::realizarVenda);
        painelCaixa.add(btnVenda);

        JButton btnCaixa = new JButton("Consultar Caixa");
        btnCaixa.addActionListener(e -> txtOutput.append("Valor em caixa: " + caixa.getValorTotal() + "\n"));
        painelCaixa.add(btnCaixa);

        // Adiciona painéis à janela
        add(painelCadastro, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(painelCaixa, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void adicionarProduto(ActionEvent e) {
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());
            String nome = txtNome.getText();
            String tipo = txtTipo.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            double porcentagem = Double.parseDouble(txtPorcentagem.getText());
            int quantidade = Integer.parseInt(txtQuantidade.getText());

            Produto p = new Produto(codigo, nome, tipo, preco, porcentagem, quantidade, LocalDate.now());
            estoque.adicionarProduto(p);

            txtOutput.append("Produto adicionado: " + p + "\n");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao adicionar produto: " + ex.getMessage());
        }
    }

    private void consultarEstoque() {
        txtOutput.append("Estoque total:\n" + estoque.listarEntrada() + "\n");
    }

    private void realizarVenda(ActionEvent e) {
        if (estoque.getEstoqueTotal().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há produtos no estoque.");
            return;
        }
        // Exemplo: vende todos os produtos cadastrados
        ArrayList<Produto> vendidos = new ArrayList<>(estoque.getEstoqueTotal());
        caixa.realizarVenda(vendidos);
        txtOutput.append("Venda realizada.\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SistemaGUI::new);
    }
}