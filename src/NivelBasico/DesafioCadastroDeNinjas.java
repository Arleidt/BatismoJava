package NivelBasico;

import java.util.Scanner;

public class DesafioCadastroDeNinjas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[4];
        int totalCadastrados = 0;
        int opcao;
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer
            switch (opcao) {
                case 1:
                    int continuar;
                    do {
                        if (totalCadastrados < ninjas.length) {
                            System.out.print("Digite o nome do ninja: ");
                            ninjas[totalCadastrados] = scanner.nextLine();
                            totalCadastrados++;
                            if (totalCadastrados < ninjas.length) {
                                System.out.println("Quer cadastrar outro? (1 - Sim | 2 - Não)");
                                continuar = scanner.nextInt();
                                scanner.nextLine();
                            } else {
                                System.out.println("Array cheio!");
                                continuar = 2;
                            }
                        } else {
                            System.out.println("Array cheio!");
                            continuar = 2;
                        }
                    } while (continuar == 1);
                    break;
                case 2:
                    if (totalCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        System.out.println("\n===== Ninjas Cadastrados =====");
                        for (int i = 0; i < totalCadastrados; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
        scanner.close();
    }
}
