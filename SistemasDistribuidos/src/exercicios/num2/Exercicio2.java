package exercicios.num2;

import java.util.Scanner;

import exercicios.num1.Thread1;

/*Crie uma aplicação concorrente que imprima todos os valores de 1 a 100. O número de Threads é
solicitado ao usuário e cada Thread vai ser responsável por uma sequência de números, conforme o
resto da divisão de 100 pelo número de Threads.*/


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
