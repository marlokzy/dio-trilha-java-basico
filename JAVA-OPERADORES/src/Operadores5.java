public class Operadores5 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("O número um é igual ao número dois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("O número um é diferente do número dois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("O número um é maior que o número dois? " + simNao);

        // == ou equals?

        // int numeroUm = 130;
        // int numeroDois = 130;
        // System.out.println(numero1 == numero2); //true

        Integer numeroUm = 130;
        Integer numeroDois = 130;

        System.out.println(numero1 == numero2); // false

        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals

        System.out.println(numeroUm.equals(numeroDois)); // true
    }
}
