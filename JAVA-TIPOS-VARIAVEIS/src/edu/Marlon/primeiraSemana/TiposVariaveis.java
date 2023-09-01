package edu.Marlon.primeiraSemana;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; vai dar esse erro -> Type mismatch: cannot convert from int to short

        // System.out.println(numeroCurto2);
        System.out.println(numeroNormal);
        // está dando erro, pois por mais que temos ciência que o valor de numeroNormal
        // é um short, o Java não permite correr o risco. Já que Java é uma linguagem
        // fortemente "tipada”!
    }
}
