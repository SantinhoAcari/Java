import javax.swing.*;
import java.awt.*;

public class Calculadora {

    private JFrame frame;
    private JPanel panel;
    private JTextField num1Field;
    private JTextField num2Field;
    private JComboBox<String> operacaoBox;
    private JTextArea resultadoArea;

    public Calculadora() {
        // Configuração da Janela Principal
        frame = new JFrame("Calculadora do Padilha");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("C:\\Santinho\\java\\CalculadoraSimplesJava\\sts1.ico");
        frame.setIconImage(icon.getImage());
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.MAGENTA);
        // frame.getContentPane().setBackground(new Color(173, 216, 230)); // Exemplo de
        // uma nova Cor no Formato RGB (Azul Claro)

        // Configuração do Painel 4 Linhas e 2 Colunas
        panel = new JPanel();
        panel.setOpaque(true);
        panel.setLayout(new GridLayout(10, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));

        // Adicionando Componentes
        JLabel lb1 = new JLabel("Digite o Primeiro Número:");
        lb1.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(lb1);

        num1Field = new JTextField();
        num1Field.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(num1Field);

        JLabel lb2 = new JLabel("Digite o Segundo Número:");
        lb2.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(lb2);

        num2Field = new JTextField();
        num2Field.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(num2Field);

        JLabel lb3 = new JLabel("Escolha a Operação:");
        lb3.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(lb3);

        // Array de String com as Operações
        String[] operacoes = { "Soma", "Subtração", "Multiplicação", "Divisão", "Verificar se é par" };
        operacaoBox = new JComboBox<>(operacoes);
        operacaoBox.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(operacaoBox);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(calcularButton);

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        // Ação do Botão Calcular
        calcularButton.addActionListener(e -> calcularOperacao());

        // Configuração Final
        frame.add(panel);
    }

    public void exibir() {
        frame.setVisible(true);
    }

    private void calcularOperacao() {
        try {
            // Pegando os Valores dos Campos
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());   
            while (true) {
            if (num2 != 0) {
                break;
            }else{
                JOptionPane.showMessageDialog(null,"Erro: Não Pode Dividir por Zero(0)");
                break;
            }
        }    
        num2Field.setText("");
            String operacao = (String) operacaoBox.getSelectedItem();
            String mensagem;

            // Verificando a Operação
            if ("Divisão".equals(operacao) && num2 == 0) {
                mensagem = "Erro: Divisão por zero não permitida!";
            } else {
                switch (operacao) {
                    case "Soma":
                        mensagem = num1 + " + " + num2 + " = " + (num1 + num2);
                        break;
                    case "Subtração":
                        mensagem = num1 + " - " + num2 + " = " + (num1 - num2);
                        break;
                    case "Multiplicação":
                        mensagem = num1 + " * " + num2 + " = " + (num1 * num2);
                        break;
                    case "Divisão":
                        mensagem = num1 + " / " + num2 + " = " + (num1 / num2);
                        break;
                    case "Verificar se é par":
                        mensagem = (num1 % 2 == 0) ? (num1 + " é par") : (num1 + " é ímpar");
                        break;
                    default:
                        mensagem = "Operação inválida!";
                }
            }
            resultadoArea.setText(mensagem);
        } catch (NumberFormatException ex) {
            resultadoArea.setText("Erro: Por favor, insira números válidos!");
        }
    }

}
