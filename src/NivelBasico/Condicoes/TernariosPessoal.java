package NivelBasico.Condicoes;

public class TernariosPessoal {
    public static void main(String[] args) {
        /*
        * Ternario maneira de diminuir o codigo
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        * */
        String ninja1 = "Naruto";
        int idadeNinja1 = 17;
        String missaoNinja1 = "Encontrar o Bandido";
        String statusDaMissaoNinja1 = "Em Andamento";
        char  nivelDaMissaoNinja1 = 'B';

        statusDaMissaoNinja1 = (idadeNinja1 < 15)
                ? (nivelDaMissaoNinja1 == 'C' || nivelDaMissaoNinja1 == 'D' ? "Missão Concluída" : "Não Concluída, você é muito novo")
                : statusDaMissaoNinja1;

        System.out.println("Nome do ninja: " + ninja1 );
        System.out.println("Idade: " + idadeNinja1);
        System.out.println( "Missao " + missaoNinja1);
        System.out.println("Status da Missao " + statusDaMissaoNinja1);
        System.out.println("Nivel da Missao " + nivelDaMissaoNinja1);
    }
}
