package exercicios.num3;

import java.util.Random;
import java.util.Scanner;

/*Faça uma aplicação Java multithread para buscar um dado elemento em um vetor de 200 posições
(desordenado). Utilize um objeto Random para gerar números aleatórios.
 - Cada Thread ficará responsável pela busca em uma parte do vetor
 - Retorne a posição do elemento no vetor ou –1 caso o elemento não foi encontrado*/

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numThreads = 0;		

		int[] array = new int[200];
		Random r = new Random(); //instância um objeto da classe Random usando o construtor padrão
		for (int i = 0; i < array.length; i++) {
		   array[i] = r.nextInt(50);
			//System.out.println(r.nextInt());
		}
		
		System.out.println("Quantas Threads?");
		numThreads = scan.nextInt();
		
		System.out.println("Qual elemento deseja buscar?");
		int elemento = scan.nextInt();
		
		for (int i = 1; i <= numThreads; i++) {
			Thread thread = new Thread(new MyRunnable(i,numThreads,array,elemento));
			thread.start();
		}

	}

}
