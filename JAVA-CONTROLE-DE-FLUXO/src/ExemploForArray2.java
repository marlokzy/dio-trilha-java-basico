public class ExemploForArray2 {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma abreviada
        for (String aluno : alunos) { // nesse trecho ele diz que a cada interação de alunos o aluno atual do indice atual vai atualizar automaticamente esta variavel
            System.out.println(aluno);
        }
    }
}
