package edu.Marlon.primeiraSemana;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = numeroNormal;

        System.out.println(numeroCurto2);
        // está dando erro, pois por mais que temos ciência que o valor de numeroNormal
        // é um short, o Java não permite correr o risco. Já que Java é uma linguagem
        // fortemente "tipada”!
    }
}
