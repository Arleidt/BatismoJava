package NivelBasico.Condicoes;

public class IfeElse {
    public static void main(String[] args) {
        /*
        obj passar o ninja de nivel de acordo com o numero de missoes com condições if e else */
        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 10;
        // se(condicao) {faça isso} , if(condicao) {resultado} else if (condicao) {resultado} else {resultado caso nada seja verdadeiro}
        if (numeroDeMissoes >= 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        }else if (numeroDeMissoes >= 20){
            System.out.println( "Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim ");
        }
    }
}
