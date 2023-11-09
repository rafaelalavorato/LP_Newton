package lp;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;


public class LotoFacilGUI extends JFrame { // herança de classes usada para criar janelas gráficas em app de desktop.
    //  permite que você personalize a janela de acordo com suas necessidades.

    private JPanel painel = new JPanel(); // janela da interface
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100"); // botões da janela
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private int numeroSorteado; // Número sorteado para as apostas

    public LotoFacilGUI() {
        this.setTitle("Lotofácil - Interface Gráfica"); // Define o título da janela
        this.setSize(400, 200); //  Define o tamanho da janela largura/altura
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20)); // alinhamento e espaçamento do painel
        painel.setBackground(new Color(255, 255, 255)); // define a cor

        // adiciona os botões no painel
        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);

        this.getContentPane().add(painel); // adiciona o painel na janela principal
        this.setLocationRelativeTo(null); // centraliza a janela no computador
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // encerrar o app
        this.setVisible(true); // torna a janela visível

        Random rnd = new Random(); // gera um número sorteado para as apostas
        numeroSorteado = rnd.nextInt(101); // gera um número aleatório

        // Adiciona ouvintes de ação aos botões, ou seja, cada botão está configurado para executar uma ação específica
        // chamar uma função quando é clicado
        jButtonAposta1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });
    }

    private void aposta1() {
        // permite que o usuário insira um valor como texto sendo exibido como uma mensagem na caixa de diálogo. 
        // input dialog -> caixa de diálogo > jOptionPane -> classe
        String input = JOptionPane.showInputDialog(null, "Digite sua aposta de 0 a 100:");
        // try usado para envolver código que pode lançar exceções (erros).
        try {
            // Integer.parseInt() é um método
            int aposta = Integer.parseInt(input); // tenta converter o texto inserido pelo usuário em um número inteiro
            if (aposta == numeroSorteado) {
                JOptionPane.showMessageDialog(null, "Você ganhou milzão!"); // caixa de diálogo informativa usando a classe `JOptionPane`.
            } else {
                JOptionPane.showMessageDialog(null, "Você perdeu! O número sorteado foi: " + numeroSorteado);
            }
        } catch (NumberFormatException ex) { // ocorre se o usuário inserir algo que não possa ser convertido em um número int válido
            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
        }
    }

    private void aposta2() {
        String input = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z:"); // valor digitado é armazenado na variável input
        // verificar se o usuário inseriu um valor válido
        if (input != null && input.length() == 1 && Character.isLetter(input.charAt(0))) { 
            // null verifica se o usuário não cancelou a caixa de diálogo
            // lenght verifica se o usuário digitou apenas um caractere
            // char.isletter verifica se o caractere digitado é uma letra do alfabeto
            char letraApostada = Character.toUpperCase(input.charAt(0)); // converte o char em maiúscula e armazena na variável
            char letraSorteada = (char) ('A' + numeroSorteado % 26); // Mapeia o número sorteado para uma letra.
            if (letraApostada == letraSorteada) { 
                // mensagens de diálogo
                JOptionPane.showMessageDialog(null, "Você ganhou quinhentão!");
            } else {
                JOptionPane.showMessageDialog(null, "Você perdeu! A letra sorteada foi: " + letraSorteada);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, digite uma letra válida de A a Z.");
        }
    }

    private void aposta3() {
        String input = JOptionPane.showInputDialog(null, "Digite um número par ou ímpar:");
        try {
            int numeroDigitado = Integer.parseInt(input); // tenta converter o valor,que está na forma de uma string, em um número int
            if (numeroDigitado % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Você ganhou cenzão!"); // faz exibir uma mensagem na caixa de diálogo
            } else {
                JOptionPane.showMessageDialog(null, "Você perdeu!");
            }
        } catch (NumberFormatException ex) { //exceção que ocorrerá se uma entrada não puder ser convertida em um número int

            JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
        }
    }

    public static void main(String[] args) { // método principal da classe, onde o programa começa a ser executado
        new LotoFacilGUI(); // cria uma nova instância da classe que é a classe que contém o código das funções `realizarAposta´
        // isso inicia a interface gráfica do jogo
    }
    
}