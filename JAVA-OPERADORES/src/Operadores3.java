public class Operadores3 {
    public static void main(String[] args) {
        int numero = 5;

        // numero = numero + 1; // -> é a mesma coisa que numero++;
        numero++; // agora numero = 6
        System.out.println(numero);

        System.out.println(numero++); // este código está me dizendo pra imprimir numero e dps incrementar ou seja, vai imprimir 6 novamente e na proxima vez que eu for imprimir vai aparecer 7

        System.out.println(numero); // 7

        System.out.println(++numero); // já aqui ja esta pedindo p incrementar e imprimir o valor apos. Dará 8

        // a mesma coisa servirá para quando eu quiser decrementar (--)
        System.out.println(numero--); // vai imprimir o valor atual e decrementar na proxima 

        System.out.println(numero); // decrementou. Dará 7

        System.out.println(--numero); // Já aqui decrementou e mandou imprimir o novo valor. Dará 6
    }
    
}
