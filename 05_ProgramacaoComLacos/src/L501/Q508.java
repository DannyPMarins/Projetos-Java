package L501;

public class Q508 {
	
	/*
	 * 8) Desenvolver um programa que apresente todos os valores numéricos inteiros ímpares situados na faixa de 0 a
20. Para saber se o número é ímpar, será necessário verificar essa condição com o comando if. Sendo ímpar,
mostre-o; não sendo, passe para o próximo passo
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 1;
		
		
		while (cont <= 20) {
			
			if (cont % 2 == 1) {
				System.out.println(cont);
	
			}
			cont ++;
		}
		
	}

}
