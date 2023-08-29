package edu.Marlon.segundaSemana;

public class Var_Metodos {
    public static void main(String[] args) {

            String primeiroNome = "Marlon";
            String segundoNome = "Rodrigues";

            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

            System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeroNome, String segundoNome) {
        return "Resultado do método: " + primeroNome.concat(" ").concat(segundoNome);
    }
}
