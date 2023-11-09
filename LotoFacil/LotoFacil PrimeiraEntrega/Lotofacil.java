package lp;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Lotofacil {

	public static void main(String[] args) throws IOException { 

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int opcao;

        do {

            System.out.println("**************************");

            System.out.println("Menu LOTOFÁCIL:");

            System.out.println("1) Apostar de 0 a 100");

            System.out.println("2) Apostar de A à Z");

            System.out.println("3) Apostar em par ou ímpar");

            System.out.println("0) Sair");

            System.out.println("**************************");

            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();



            switch (opcao) {

                case 1:

                    // Aposta de 0 a 100

                    System.out.print("Digite um número de 0 a 100: ");

                    int napostado = sc.nextInt();

                    if (napostado < 0 || napostado > 100) {

                        System.out.println("Aposta inválida.");

                    } else {

                        int nsorteado = random.nextInt(101);

                        if (napostado == nsorteado) {

                            System.out.println("Você ganhou R$ 1.000,00 reais.");

                        } else {

                            System.out.println("Que pena! O número sorteado foi: " + nsorteado);

                        }

                    }

                    break;



                case 2:

                    // Aposta de A à Z

                    System.out.print("Digite uma letra de A à Z: ");

                    char lapostada = Character.toUpperCase((char) System.in.read());

                    if (Character.isLetter(lapostada)) {

                        char lpremiada = 'R'; 

                        if (lapostada == lpremiada) {

                            System.out.println("Você ganhou R$ 500,00 reais.");

                        } else {

                            System.out.println("Que pena! A letra sorteada foi: " + lpremiada);

                        }

                    } else {

                        System.out.println("Aposta inválida.");

                    }

                    // Limpe o buffer do teclado

                    System.in.read();

                    break;



                case 3:

                    // Aposta em número par ou ímpar

                    System.out.print("Digite um número inteiro: ");

                    int napostadoParImpar = sc.nextInt();

                    if (napostadoParImpar % 2 == 0) {

                        System.out.println("Você ganhou R$ 100,00 reais.");

                    } else {

                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");

                    }

                    break;



                case 0:

                    System.out.println("Saindo do jogo LOTOFÁCIL. Até mais!");

                    break;



                default:

                    System.out.println("Opção inválida. Tente novamente.");

                    break;

            }

        } while (opcao != 0);



        sc.close();

    }

}