
public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("Marcos", "123");
		
		marcos.setEndereco("Rua Agreste de Itabaiana");
		
		System.out.println("Seu nome é "+ marcos.getNome());
		System.out.println("Seu cpf é "+ marcos.getCpf());
		System.out.println("Seu endereço é "+ marcos.getEndereco());

	}
}
