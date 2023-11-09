package ListaDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("== Aplicativo de Lista de Tarefas ==");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada:");
                    String tarefa = sc.nextLine();
                    adicionarTarefa(tarefas, tarefa);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = sc.nextInt();
                    removerTarefa(tarefas, indice);
                    break;
                case 3:
                    listarTarefas(tarefas);
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void adicionarTarefa(ArrayList<String> tarefas, String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso.");
    }
    private static void removerTarefa(ArrayList<String> tarefas, int indice) {
        tarefas.remove(indice);
        System.out.println("Tarefa removida com sucesso.");
    }
    private static void listarTarefas(ArrayList<String> tarefas) {
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}