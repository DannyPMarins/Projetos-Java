package Lista0303;

import util.Teclado;

public class ex_10 {
	/*
	 * 10) Fazer um algoritmo que solicite a raz�o de uma pg (Progress�o Geom�trica)
	 * e o valor do 1� termo. E apresente o 5� termo da s�rie.
	 */
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1, r, an;
		double n;
		
		a1 = Teclado.lerDouble("Informe o primeiro termo da P.G :");
		r = Teclado.lerDouble("Raaz�o da P.G :");
		
		n = 5;
		an = a1 * Math.pow(r, n - 1);
		
		System.out.println("Quinto termo da P.G : " + an);

	}

}
