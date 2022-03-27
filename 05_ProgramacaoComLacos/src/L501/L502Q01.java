package L501;

public class L502Q01 {
	
	/*
	 * 1) Desenvolver um programa que apresente todos os valores numéricos inteiros pares situados na faixa de 100 a
		  200.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 100;

		
		do {
			if(cont % 2 == 0) {
				
			
			System.out.println(cont);
			}
			
			cont = cont + 1;
			
		}while(cont <= 200);
		
		
	}

}
