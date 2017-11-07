package exercicios.num7;

import java.util.Random;

public class Tartaruga implements Runnable {
	
	Random gerador = new Random();

	private int velocidade;
	private int[] array;
	private int faltaPercorrer;

	public Tartaruga(int[] array) {
		// TODO Auto-generated constructor stub
		this.velocidade = gerador.nextInt(10);
		this.array = new int[array.length];
		
		System.out.println("Ficha Técnica TARTARUGA:");
		System.out.println("Velocidade: " + velocidade + " centimetros por segundo!");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		faltaPercorrer = array.length;
		
		//System.out.println("Passou array de " + faltaPercorrer + "\nE a velocidade é " + velocidade);
		
		for (int i = 1; i <= array.length; i++ ) {			
		
		faltaPercorrer = faltaPercorrer - velocidade;
		
		if (faltaPercorrer > 0) {
			
		System.out.println("\nTartaruga: Falta percorrer " + faltaPercorrer + " centimetros");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		} else {
			System.out.println("\nE a Tartaruga cruzou a linha de chegada ! ! !");
			break;
		} 
		}
	}

}
