package Lista0302;

import util.Teclado;

public class ex_02 {
	/*
	 * 2)Desenvolver um programa que fa�a duas perguntas: o valor referente �s horas atuais e o valor referente aos minutos atuais. 
	 *  Exemplo, se agora s�o 09:35h o usu�rio dever� informar como resposta �s horas atuais o valor 09 e como resposta aos minutos atuais o valor 35.
	 *  Em seguida o programa dever� apresentar como resposta quantos minutos j� se passaram desde �s 00:00h deste dia
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas, min, x;
		
		horas = Teclado.lerInt("Digite a hora:");
		min = Teclado.lerInt("Digite os minutos : ");
		
		x = (horas * 60) + min;
		
		
		System.out.println("Se passaram " + x +" desde as 00:00");

	}

}
