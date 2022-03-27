package L501;

import util.Teclado;

public class Q511 {
	
	/*
	 * 11) Elaborar um programa que apresente o valor de uma potência de uma base qualquer (Variável b) elevada a um
	expoente qualquer (Variável e), ou seja, de b e
.    (Sem usar Math.pow();)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b, e, aux = 1;
		int cont = 1;
		
		b = Teclado.lerDouble("Base da potencia: ");
		e = Teclado.lerDouble("Expoente da potencia: ");
		
		while (cont <= e) {
			
			aux = aux * b;
			
			cont ++;
		}
		
			System.out.println(b + " elevado a " + e + " = " + aux);
	}

}
