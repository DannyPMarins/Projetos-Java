package L501;

public class L503Q07 {
	
	/*
	 * 7)	Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa de 3 até 21.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma = 0;
		
		for (int cont = 3 ; cont <= 21 ; cont++ ) {
			
			if (cont % 2 == 0) {
				
				soma = soma + cont;
			}
			
			
		}
		
		System.out.println("A soma dos valores pares de  3 á 21 é: " + soma);
	}

}
