package L501;

public class Q510 {
	/*
	 * 10) Desenvolver um programa que apresente as pot�ncias de 3 variando de 0 a 15. Deve ser considerado que
		qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. A apresenta��o deve observar a seguinte
		exibi��o na tela:
		3 elevado � 0 = 1
		3 elevado � 1 = 3
		3 elevado � 2 = 9
		(...)
		3 elevado � 15 = 14348907
		OBS: Tente fazer em uma classe utilizando Math.pow() e em outra classe sem utilizar Math.pow()
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n3 = 3, cont = 0;
		
		while (cont <= 15) {
			
			System.out.println(n3 + " elevado � " + cont + " = " + (Math.pow(n3, cont)));
			
			
		cont ++;	
		}
		
	}

}
