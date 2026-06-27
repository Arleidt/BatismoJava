package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        String ninja1 = "naruto";
        String ninja2 = "sasuke";
        String ninja3 = "sakura";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
        inicializando array mas da tb da outra forma que é boa pratica em java String[]
        String ninja[];
         */
        String[] ninja = new String[3]; //criou 3 espaços
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        System.out.println(ninja);
    }
}
