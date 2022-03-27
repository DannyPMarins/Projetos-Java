package L501;

public class L502Q02 {
	
	/*
	 * 2) Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500.
		  Utilize um laço que varie de 2 em 2.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0, cont = 0;
		
		do {
			
			n1 = n1 + cont;
			
			cont = cont + 2;
			
		}  while ( cont <= 500 );
		
		System.out.println("A soma dos valores pares existentes na faixa de 0 a 500 é: " + n1);

	}

}
