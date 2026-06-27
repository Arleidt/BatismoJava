package NivelBasico.TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
/* Dados nao primitivos: String Class Array Enum
* obj Criar um ninja e atribuir metodos a ele caracterisitas que vai por dentro das nossas var */

        String nome = "Naruto";
        String  nomeUpperCase = nome.toUpperCase();// vai colocar tudo capslook
        System.out.println("Texto em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Texto normal: "+ nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Caixa baixa: " + aldeiaLowerCase);
        System.out.println("Normal: " + aldeia );
    }
}
