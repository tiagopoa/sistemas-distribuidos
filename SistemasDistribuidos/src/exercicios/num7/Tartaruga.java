package exercicios.num7;

import java.util.Random;

public class Tartaruga implements Runnable {
	
	Random gerador = new Random();

<<<<<<< HEAD
	private int velocidadeTartaruga = gerador.nextInt(51);
	private int distanciaCorrida;

	public Tartaruga(int distanciaCorrida) {
		// TODO Auto-generated constructor stub
		this.velocidadeTartaruga = velocidadeTartaruga;
		this.distanciaCorrida = distanciaCorrida * 100;
=======
	private int velocidade;
	private int[] array;
	private int faltaPercorrer;

	public Tartaruga(int[] array) {
		// TODO Auto-generated constructor stub
		this.velocidade = gerador.nextInt(10);
		this.array = new int[array.length];
		
		System.out.println("Ficha Técnica TARTARUGA:");
		System.out.println("Velocidade: " + velocidade + " centimetros por segundo!");
		
>>>>>>> c41522105e7bb0eff58d90986c5c21189d080bbe
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
<<<<<<< HEAD
		if (velocidadeTartaruga == 0) {
			velocidadeTartaruga = 1;
		}
		
		System.out.println("\n#############################################");
		System.out.println("Ficha técnica da TARTARUGA:");
		System.out.println("Velocidade: " + velocidadeTartaruga);		
		System.out.println("#############################################\n");
		
		int tempo = 0;
		int falta = distanciaCorrida;
		
		for (int i = 0; i <= distanciaCorrida; i++ ) {
				
		//System.out.println("Tartaruga: Falta percorrer " + distanciaCorrida);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}	

		tempo++;
		falta = falta - velocidadeTartaruga;
		if (falta <= 0) {
			System.out.println("\nTartaruga cruzou a linha de chegada!!!\n");
			System.out.println("\nTartaruga percorreu " + distanciaCorrida + " centímetros em: " + tempo + " segundos\n");
			break;
		} else {
		System.out.println("\nTartaruga: Faltam " + falta + " centímetros para a linha de chegada\n");
=======
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
>>>>>>> c41522105e7bb0eff58d90986c5c21189d080bbe
		}

	}

		
	}
	}


