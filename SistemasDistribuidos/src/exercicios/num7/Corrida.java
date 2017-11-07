package exercicios.num7;

import java.util.Scanner;

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
		scan.close();
		
		int[] array = new int[distanciaCorrida*100];
		
		System.out.println("A corrida terá um total de " + array.length + " centimetros");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		System.out.println("\nFOI DADA A LARGADA ! ! !");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		System.out.println("\nELAS PARTIRAM ! ! !\n");
		
		
			Thread lebre = new Thread(new Lebre(array));
			lebre.start();
			
			Thread tartaruga = new Thread(new Tartaruga(array));
			tartaruga.start();
			
			
		

	}

}
