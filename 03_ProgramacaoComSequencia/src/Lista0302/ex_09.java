package Lista0302;

import util.Teclado;

public class ex_09 {
	
	/*
	 * 9)	Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
	 * 		 meses e dias e mostre-a expressa apenas em dias.
	 *  		Obs: Considere os anos com 365 dias e os meses com 30 dias.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos, meses, dias, totalDias;
		
		anos = Teclado.lerInt("Quantos anos voce tem? ");
		meses = Teclado.lerInt("Quantos meses se passaram desde o seu aniversario? ");
		dias = Teclado.lerInt("Quantos dias se passaram desde o ultimo mes da resposta anterior? ");
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Voce viveu " + totalDias + " em dias");
		
		

	}

}
