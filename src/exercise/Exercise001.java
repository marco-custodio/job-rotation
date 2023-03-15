package exercise;

public class Exercise001 {
    public static void main(String[] args) {

        var INDICE = 13;
        var SOMA = 0;
        var K = 0;


        while (K < INDICE){
            K++;
            SOMA += K;
        }

        System.out.println(SOMA);
    }
}
