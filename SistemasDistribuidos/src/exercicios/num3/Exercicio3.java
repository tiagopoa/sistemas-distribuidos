package exercicios.num3;

import java.util.Random;
import java.util.Scanner;

/*Fa�a uma aplica��o Java multithread para buscar um dado elemento em um vetor de 200 posi��es
(desordenado). Utilize um objeto Random para gerar n�meros aleat�rios.
 - Cada Thread ficar� respons�vel pela busca em uma parte do vetor
 - Retorne a posi��o do elemento no vetor ou �1 caso o elemento n�o foi encontrado*/

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numThreads = 0;		

		int[] array = new int[200];
		Random r = new Random(); //inst�ncia um objeto da classe Random usando o construtor padr�o
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
