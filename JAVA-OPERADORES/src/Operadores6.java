public class Operadores6 {
    public static void main(String[] args) {
        // A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado, isso quer dizer que se a condição1 atender aos critérios não será necessário validar a condição2.
        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == 2 & numero2++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

        // Vamos mudar a linha 6 do código acima para: if(numero1== 2 && numero2 ++ == 2
        // )
    }

}
