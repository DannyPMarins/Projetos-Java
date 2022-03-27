package L501;

public class Q505 {
	
	/*
	 * 5) Desenvolver um programa que apresente os resultados de uma tabela de um número qualquer. Ela deve ser
			impressa no seguinte formato:
			Considerando como exemplo o fornecimento do número 2
			2 . 1 = 2
			2 . 2 = 4
			2 . 3 = 6
			2 . 4 = 8
			2 . 5 = 10
			(...)
			2 . 10 = 20
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n3 = 3, cont = 1;
		
		
		
		while ( cont <= 10 ) {
			
			System.out.println(n3  + " . " + cont + " = " + (n3 * cont));
			
			cont = cont + 1;
		}

	}

}
