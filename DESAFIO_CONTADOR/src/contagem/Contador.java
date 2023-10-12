package contagem;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo número:");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			
		} catch (Exception e) {
			System.out.println("O segundo paramêtro dever ser maior que o primeiro");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}else {
			int contagem = parametroDois - parametroUm;
			for(int conta = 1; conta <= contagem; conta++) {
				System.out.println("Imprimindo o número "+ conta);
			}
			
		}

	}
}
