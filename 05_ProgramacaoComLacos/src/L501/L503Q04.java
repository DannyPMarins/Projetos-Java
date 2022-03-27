package L501;

public class L503Q04 {
	
	/*
	 * 4)	Desenvolver um programa que apresente todos os números divisíveis por 5 que sejam menores que 50.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int cont = 0 ; cont < 50 ; cont ++) {
			
			if (cont % 5 == 0) {
				System.out.println("Os numero divisiveis por 5 são: " + cont);
			}
		}
	}

}
