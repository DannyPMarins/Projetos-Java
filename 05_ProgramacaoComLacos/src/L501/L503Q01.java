package L501;

public class L503Q01 {
	
	/*
	 * 1) Desenvolver um programa que apresente todos os valores numéricos inteiros ímpares situados na
	 *    faixa de 1000 a 1500.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int cont = 1000 ; cont <= 1500 ; cont ++) {
			
			if (cont % 2 == 1) {
						
				System.out.println(cont);
			}
		}

	}

}
