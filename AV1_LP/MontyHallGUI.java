package Questao1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MontyHallGUI extends JFrame {
    private JButton jogarButton;
    private int portaEscolhida;
    private int portaPremiada;
    private int portaVazia;

    public MontyHallGUI() {
        setTitle("** Monty Hall **");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        jogarButton = new JButton("Jogar");
        jogarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jogar();
            }
        });
        panel.add(jogarButton, BorderLayout.CENTER);

        add(panel);
    }

    private void jogar() {
        Random random = new Random();
        portaPremiada = random.nextInt(3) + 1;

        String codigo = JOptionPane.showInputDialog(null, "Escolha uma porta (1, 2 ou 3):",
                "Imput", JOptionPane.QUESTION_MESSAGE);
        if (codigo == null || !codigo.matches("[1-3]*")) return;
        Component painel = null;
        JOptionPane.showMessageDialog(painel, "" + Integer.parseInt(codigo));

        do {
            portaVazia = random.nextInt(3) + 1;
        } while (portaVazia == portaEscolhida || portaVazia == portaPremiada);

        JOptionPane.showMessageDialog(null, "O apresentador abriu a porta " + portaVazia + " que está vazia.");

        String trocarPorta = JOptionPane.showInputDialog("Você deseja trocar para a outra porta? (s/n):");

        if (trocarPorta.equalsIgnoreCase("s")) {
            for (int i = 1; i <= 3; i++) {
                if (i != portaEscolhida && i != portaVazia) {
                    portaEscolhida = i;
                    JOptionPane.showMessageDialog(null, "Você trocou pra porta " + portaEscolhida);
                    break;
                }
            }
        }

        if (portaEscolhida == portaPremiada) {
            JOptionPane.showMessageDialog(null, "Você ganhou! Parabéns!");
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu. A porta premiada era a: " + portaPremiada + ".");
        }
        JOptionPane.showMessageDialog(null, "porta premiada: " + portaPremiada
                + "  porta vazia: " + portaVazia + " porta escolhida: " + portaEscolhida);
    }


    public static void main(String[] args) {
        MontyHallGUI game = new MontyHallGUI();
        game.setVisible(true);
    }
}
