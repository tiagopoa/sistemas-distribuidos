package exercicios.num2;

import java.util.Scanner;

import exercicios.num1.Thread1;

/*Crie uma aplica��o concorrente que imprima todos os valores de 1 a 100. O n�mero de Threads �
solicitado ao usu�rio e cada Thread vai ser respons�vel por uma sequ�ncia de n�meros, conforme o
resto da divis�o de 100 pelo n�mero de Threads.*/


public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numThread = 0;
		
		System.out.println("Quantas Threads?");
		numThread = scan.nextInt();
		
		for (int i = 1; i <= numThread; i++){
			Thread thread = new Thread(new MyRunnable(i,numThread));
			thread.start();
		}
		
		

	}

}
