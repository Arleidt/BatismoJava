package NivelBasico.Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
    /*Scanner = é um jeito de trazer o usuario para dentro da aplicação
    * Objetivo = O usuario vai criar um ninja e vamos validar os dados*/

        //abrir Scanner
        Scanner caixaDeTexto = new Scanner(System.in);
        //Receber o nome do ninja
        System.out.println("Escreva o nome do Ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é " + idadeDoNinja + " Anos");
        if(idadeDoNinja >= 18){
            System.out.println("Ninja é maior de idade poder ir a Missões fora da Aldeira");
        }else{
            System.out.println("Ninja menor de idade, muito novo para sair da Aldeia");
        }

        //Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
