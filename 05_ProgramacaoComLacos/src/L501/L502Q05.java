package L501;

public class L502Q05 {

	/*
    * 5)	Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 20.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = 0;
		
		do {
			
				if (cont % 4 == 0) {
					System.out.println(cont);
				}
			
				cont = cont + 1;
			
		} while (cont < 20);

	}

}
