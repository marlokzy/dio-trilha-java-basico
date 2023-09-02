public class Operadores2 {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(-numero); // vai deixar ele negativo na hora da impressão mas n definitivo

        numero = -numero;
        System.out.println(numero); // agora sim ele está definitivamente negativo

        // e se eu quiser deixar/transformar ele positivo novamente?
        numero = +numero;
        System.out.println(numero); // não vai funcionar pq o + é um operador aritmetico p somar

        // então faço desse jeito
        numero = numero * -1;
        System.out.println(numero);

        numero++; // vai acrescentar +1
        System.out.println(numero); // 6

        numero ++; // vai acrescentar +1
        System.out.println(numero); // 7

        // usando o operador ! p retornar o oposto
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);
    }

}
