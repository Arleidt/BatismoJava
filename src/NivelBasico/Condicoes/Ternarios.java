package NivelBasico.Condicoes;
//TERNARIO maneira de reduzir o codigo
//variavel = (condicao) ? valorSeVerdade : ValorSeFalso;
public class Ternarios {
    public static void main(String [] args ){
        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 10;

    String nivel = (numeroDeMissoes >= 10 && idade >15) ? "Rank: Chunnin" : (numeroDeMissoes >=20
            ? "Rank: Jounin"
            : "Rank: Gennim");
    System.out.println(nivel);

    System.out.println(
            (numeroDeMissoes >= 10 && idade > 15) ? "Rank: Chunnin" : (numeroDeMissoes >= 20)? "Rank: Jounin" : "Rank: Gennim"
        );
    String nivelDoNinja = (numeroDeMissoes >=10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}