package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        SwitchCases: Que Servem para gerar casos especificos
        Objetivo: Pedir para usuario escolher entre os Ninjas
        switchCase
        * */
        //Pedir para o Usuario  -abri a caixa
        Scanner caixaDeTexto = new Scanner(System.in);
        //Mostrar opcoes user e escolher um
        System.out.println("Escolha um personagem e digite o número correspondente:\n" + "1- Uzumaki \n" + "2- Sasuke \n" + "3- Sakura \n" + "Digite abaixo:");
        //Pedir para user escolher o numero
        int escolhaDoUsuario = caixaDeTexto.nextInt();
        System.out.println("Você digitou o número: "+ escolhaDoUsuario);
        //Reacao ao escolher personagem
        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O Usuario escolheu o Naruto Uzumaki!");
                break;
            case 2:
                System.out.println("O Usuario escolheu o Naruto Sasuke!");
                break;
            case 3 :
                System.out.println("O Usuario escolheu o Naruto Sakura!");
                break;
            default:
                System.out.println("Você digitou uma opção não válida!! ");
        }
        caixaDeTexto.close();
    }
}
