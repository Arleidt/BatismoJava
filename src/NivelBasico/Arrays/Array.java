package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {
        /*inicializando array mas da tb da outra forma que é boa pratica em java String[]
        String ninja[];
        array e lista em java sao diferentes, array tem tipo definido e sabe exatamente, o tamanho dados simples ja lista se extende sozinho
        arrays sao tipos referencia. array inicializa como null
         */
        String[] ninja = new String[4]; //criou 3 espaços
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        System.out.println(ninja);
        System.out.println(ninja[0]);
        /*redeclarar array ficou vazio mesmo array comentar para voltar o texto,
        nesse caso nao ta criando um vazio, o que acontece que sobrescrevendo o espaço da memoria
        mas nao usa o mesmo espaço é outro espaço e o antigo espaco nao existe mais nao tem como acessar o antigo array */
        ninja = new String[4];
        ninja[0] = "Tobirama";
        ninja[1] = "Minato";
        ninja[2] = "Kakashi";
        System.out.println(ninja);
        //System.out.println(ninja[0]);
        //for para lopp no array
        for (int i = 0; i < 4; i++) {
            System.out.println(ninja[i]);
        }
        //array idade inicializa 0
        int[] idade = new int[2];
        idade[0]= 16;
        System.out.println(idade[1]);

        // inicializa como false
        boolean[] verdadeiroOuFalso = new boolean[2];
        verdadeiroOuFalso[0]= true;
        System.out.println(verdadeiroOuFalso[1]);
        //inicializa como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);
        //inicializa como 0.0
        float[]flutuante2 = new float[1];
        System.out.println(flutuante2[0]);
        //redeclarar
        String nomeNinja= "Naruto";
        nomeNinja = "Boruto";
        System.out.println(nomeNinja);



    }
}
