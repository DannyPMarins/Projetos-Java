package Lista0303;

import util.Teclado;

public class ex_10 {
	/*
	 * 10) Fazer um algoritmo que solicite a razão de uma pg (Progressão Geométrica)
	 * e o valor do 1º termo. E apresente o 5º termo da série.
	 */
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1, r, an;
		double n;
		
		a1 = Teclado.lerDouble("Informe o primeiro termo da P.G :");
		r = Teclado.lerDouble("Raazão da P.G :");
		
		n = 5;
		an = a1 * Math.pow(r, n - 1);
		
		System.out.println("Quinto termo da P.G : " + an);

	}

}
