package exercicios.num1;


//Faça um programa composto por duas threads: a primeira deve exibir em ordem crescente os números
//de 1 a 500; a segunda deve exibir em ordem decrescente os números entre 500 e 1. As threads devem
//ser executadas concorrentemente

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   	for (int i = 1; i <= 2; i++) {
			Thread thread = new Thread(new Thread1(i));
			thread.start();
		   	}
		
			/*Thread thread2 = new Thread(new Thread2());
			thread2.start();*/
		
		

	}



}
