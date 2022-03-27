package Lista0303;

import util.Teclado;

public class ex_09 {
	/*
	 * 9) Fazer um algoritmo que solicite a razão de uma pa (Progressão Aritmética)
	 * 		e o valor do 1º termo. E apresente o 10º termo da série.
	 */
	// an = a1 + ( n - 1 )r

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1, r, an;
		// n = 10
		final int n;
		
		a1 = Teclado.lerInt("Digite o valor do primeiro termo da P.A. : ");
		r = Teclado.lerInt("Informe o valor da razão da P.A. :");
		n = 10;
		an = a1 + (n - 1) * r;
		
		System.out.println("O decimo termo é :" + an);

	}

}
