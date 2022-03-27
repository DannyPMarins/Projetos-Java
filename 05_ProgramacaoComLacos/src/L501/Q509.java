package L501;

public class Q509 {
	
	/*
	 * 9) Elaborar um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500.
	 *    Utilize um laço que efetue a variação de 2 em 2.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0, soma = 0;
		
		while (cont <= 500) {
			
			soma = soma + cont;
			
			cont = cont + 2;
		}
		
		System.out.println("A soma dos valores pares na faixa de 0 ate 500 é: " + soma);
	}

}
