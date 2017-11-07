package exercicios.num7;

import java.util.Random;
import java.util.Scanner;

import exercicios.num3.MyRunnable;

//7. Implemente uma corrida entre lebres e tartarugas:
//a. Cada animal deve ser uma Thread;
//b. Tartaruga possui o atributo velocidade (centímetros por segundo)
//c. Lebre possui os atributos: velocidade (centímetros por segundo), quantidade de cochilos por
//corrida, tempo de cochilo (máximo 20 segundos).
//d. Os dados dos animais devem ser aleatórios (gerado pela classe Random).
//e. A corrida tem uma distância de N metros, onde N é solicitado pelo usuário.


public class Corrida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Corrida entre Lebre e Tartaruga\nQuantos metros será a corrida?");
		int distanciaCorrida = scan.nextInt();
				
		
		
		
		//System.out.println(velocidadeLebre+"\n"+velocidadeTartaruga);
		
		
			Thread lebre = new Thread(new Lebre(distanciaCorrida));
			lebre.start();
			
			Thread tartaruga = new Thread(new Tartaruga(distanciaCorrida));
			tartaruga.start();
		

	}

}
