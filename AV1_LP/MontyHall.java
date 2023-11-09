package Questao1;

import java.util.Scanner;
import java.util.Random;

public class MontyHall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao jogo Monty Hall!");
        System.out.print("Escolha uma porta (1, 2 ou 3): ");
        int portaEscolhida;
        int portaVazia;
        int portaPremiada = random.nextInt(3) + 1;

        do {
            portaEscolhida = sc.nextInt();
        } while (portaEscolhida < 1 || portaEscolhida > 3);

        do {
            portaVazia = random.nextInt(3) + 1;
        } while (portaVazia == portaEscolhida || portaVazia == portaPremiada);

        System.out.println("O apresentador abriu a porta " + portaVazia + " que está vazia.");

        System.out.print("Você deseja trocar para a outra porta? (s/n): ");
        String escolha = sc.next();

        if (escolha.equalsIgnoreCase("s")) {
            for (int i = 1; i <= 3; i++) {
                if (i != portaEscolhida && i != portaVazia) {
                    portaEscolhida = i;
                    System.out.printf("Você trocou para a porta " + i + "\n");
                    break;
                }
            }
        }

        if (portaEscolhida == portaPremiada) {
            System.out.println("Você ganhou! Parabéns!");
        } else {
            System.out.println("Você perdeu. A porta premiada era a " + portaPremiada + ".");
        }

        sc.close();
    }
}
