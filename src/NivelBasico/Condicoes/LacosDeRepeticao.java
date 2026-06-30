package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*Laços de repeticao? vao repetir infinitamente ou ate atingir o parametro desejado
        * while e o for
        * while (condicao enquanto verdadeira) {tudo aqui vai acontecer}
        * */
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones < numeroMaximoDeClones){
            numeroDeClones = numeroDeClones + 1;
            //numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras: " + numeroDeClones);
        }
    //for for ( INICIALIZAÇÃO ; CONDIÇÃO ; ATUALIZAÇÃO ) {
        //    CORPO
        //}
        for (int i = 0; i < numeroMaximoDeClones ; i++) {
            System.out.println("O Naruto fez um clone das sombras laço for: " + i);
        }
        System.out.println("O Naruto esta se clonando e ja se clonou: " + numeroMaximoDeClones);

    }
}
