import java.util.concurrent.ThreadLocalRandom;

public class ExWhile {
    public static void main(String[] args) {
        Double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;
                
            System.out.println("Doce do valor: " + valorDoce + " foi adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
