package exercicios.num7;

import java.util.Random;
import java.util.Scanner;

import exercicios.num3.MyRunnable;

//7. Implemente uma corrida entre lebres e tartarugas:
//a. Cada animal deve ser uma Thread;
//b. Tartaruga possui o atributo velocidade (cent�metros por segundo)
//c. Lebre possui os atributos: velocidade (cent�metros por segundo), quantidade de cochilos por
//corrida, tempo de cochilo (m�ximo 20 segundos).
//d. Os dados dos animais devem ser aleat�rios (gerado pela classe Random).
//e. A corrida tem uma dist�ncia de N metros, onde N � solicitado pelo usu�rio.


public class Corrida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Corrida entre Lebre e Tartaruga\nQuantos metros ser� a corrida?");
		int distanciaCorrida = scan.nextInt();
				
		
		
		
		//System.out.println(velocidadeLebre+"\n"+velocidadeTartaruga);
		
		
			Thread lebre = new Thread(new Lebre(distanciaCorrida));
			lebre.start();
			
			Thread tartaruga = new Thread(new Tartaruga(distanciaCorrida));
			tartaruga.start();
		

	}

}
