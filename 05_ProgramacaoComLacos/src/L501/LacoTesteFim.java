package L501;

import util.Teclado;

public class LacoTesteFim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x, r , cont = 1;
		
		
		do {
			x = Teclado.lerInt("Informe o valor de x:");
			r = x * 3;
			System.out.println("o valor de r é: " + r);
			cont ++;
		}while( cont <= 5 );
		
		
		
		
		/*
		int x, r, cont = 0;
		
		
		
		while (cont < 5) {
			x = Teclado.lerInt("Informe o valor de x:");
			
			r = x * 3;
			
			System.out.println("o valor de r é: " + r);
			
			cont ++;
		}
		*/

	}

}
