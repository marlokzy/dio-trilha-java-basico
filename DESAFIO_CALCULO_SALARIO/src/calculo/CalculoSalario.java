package calculo;

import java.util.Scanner;

public class CalculoSalario {

	   public static void main (String[] args) {
	       // lê os valores de entrada:
	        Scanner leitorDeEntradas = new Scanner(System.in);
	        System.out.println("Digite o valor do salário: ");
	        float valorSalario = leitorDeEntradas.nextFloat();
	        System.out.println("Digite o valor dos benefícios: ");
	        float valorBeneficios = leitorDeEntradas.nextFloat();
	        
	       // atribuindo o imposto
	        float imposto = 0;
	        if (valorSalario >= 0 && valorSalario <= 1100) {
	            imposto = valorSalario * 0.05F; //5.00% sobre o salario 
	        }
	        else if(valorSalario > 1100 && valorSalario <= 2500){
	            imposto = valorSalario * 0.10F;//10.00% sobre o salario
	        }
	        else{
	            imposto = valorSalario * 0.15F;//15.00% sobre o salario
	        }
	        
	       // Saída (Calcula e imprime a saída com 2 casas decimais)
	        float valorFinal = (valorSalario - imposto) + valorBeneficios; 
	        System.out.println(String.format("O valor a ser transferido para o funcionário é de R$ %.2f", valorFinal));
	   }
}
