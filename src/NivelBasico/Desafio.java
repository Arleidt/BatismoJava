package NivelBasico;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Fazer o array
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            // MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        // Somando mais um ninja na minha lista
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");

                    } else {
                        System.out.println("A lista de ninjas esta cheia, impossivel cadastrar um novo ninja");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("============ Lista de ninjas ============");
                        for (int i = 0; i < ninjas.length ; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos saindo o programa...Aguarde");
                    break;

                default:
                    System.out.println("Essa opcao nao é valida.");
                    break;
            }

        }



    }
}


