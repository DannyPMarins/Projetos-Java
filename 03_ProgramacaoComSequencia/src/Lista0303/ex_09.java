package Lista0303;

import util.Teclado;

public class ex_09 {
	/*
	 * 9) Fazer um algoritmo que solicite a raz�o de uma pa (Progress�o Aritm�tica)
	 * 		e o valor do 1� termo. E apresente o 10� termo da s�rie.
	 */
	// an = a1 + ( n - 1 )r

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1, r, an;
		// n = 10
		final int n;
		
		a1 = Teclado.lerInt("Digite o valor do primeiro termo da P.A. : ");
		r = Teclado.lerInt("Informe o valor da raz�o da P.A. :");
		n = 10;
		an = a1 + (n - 1) * r;
		
		System.out.println("O decimo termo � :" + an);

	}

}
