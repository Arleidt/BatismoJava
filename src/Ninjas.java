public class Ninjas {
    public static void main(String[] args) {
        String ninja1 = "Naruto";
        int idadeNinja1 = 18;
        String missaoNinja1 = "Encontrar o Bandido";
        String statusDaMissaoNinja1 = "Em Andamento";
        char  nivelDaMissaoNinja1 = 'Z';
        if (idadeNinja1 < 15){
            if(nivelDaMissaoNinja1 == 'C' || nivelDaMissaoNinja1 == 'D'){
                statusDaMissaoNinja1 = "Missao Concluida";
            } else {
                statusDaMissaoNinja1 = "Nao Concluida você é muito novo";
            }
        } else {
            statusDaMissaoNinja1= statusDaMissaoNinja1;
        }
        System.out.println("Nome do ninja: " + ninja1 );
        System.out.println("Idade: " + idadeNinja1);
        System.out.println( "Missao " + missaoNinja1);
        System.out.println("Status da Missao " + statusDaMissaoNinja1);
        System.out.println("Nivel da Missao " + nivelDaMissaoNinja1);

        String ninja2 = "Gaara";
        int idadeNinja2 = 12;
        String missaoNinja2 = "Reconhecimento da Aldeia";
        String statusDaMissaoNinja2 = "Em Andamento";
        char  nivelDaMissaoNinja2 = 'S';
        if (idadeNinja2 < 15){
            if(nivelDaMissaoNinja2 == 'C' || nivelDaMissaoNinja2 == 'D'){
                statusDaMissaoNinja2 = "Missao Concluida";
            } else {
                statusDaMissaoNinja2 = "Nao Concluida você é muito novo";
            }
        } else {
            statusDaMissaoNinja2= "Concluída";
        }
        System.out.println("Nome do ninja: " + ninja2 );
        System.out.println("Idade: " + idadeNinja2);
        System.out.println( "Missao " + missaoNinja2);
        System.out.println("Status da Missao " + statusDaMissaoNinja2);
        System.out.println("Nivel da Missao " + nivelDaMissaoNinja2);

        String ninja3 = "Itachi";
        int idadeNinja3 = 17;
        String missaoNinja3 = "Curar Feridos da Guerra";
        String statusDaMissaoNinja3 = "Concluído";
        char  nivelDaMissaoNinja3 = 'D';
        if (idadeNinja3 < 15){
            if(nivelDaMissaoNinja3 == 'C' || nivelDaMissaoNinja3 == 'D'){
                statusDaMissaoNinja3 = "Missao Concluida";
            } else {
                statusDaMissaoNinja3 = "Nao Concluida você é muito novo";
            }
        } else {
            statusDaMissaoNinja3= "Concluída";
        }
        System.out.println("Nome do ninja: " + ninja3 );
        System.out.println("Idade: " + idadeNinja3);
        System.out.println( "Missao " + missaoNinja3);
        System.out.println("Status da Missao " + statusDaMissaoNinja3);
        System.out.println("Nivel da Missao " + nivelDaMissaoNinja3);
    }
}
