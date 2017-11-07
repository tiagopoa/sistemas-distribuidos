package exercicios.num7;

import java.util.Random;

//c. Lebre possui os atributos: velocidade (centímetros por segundo), quantidade de cochilos por
//corrida, tempo de cochilo (máximo 20 segundos).

public class Lebre implements Runnable {
	
	Random gerador = new Random();
	
	private int velocidade;
	private int quantidadeCochilosPorCorrida;
	private int tempoCochilo;
	private int[] array;
	private int faltaPercorrer;

	public Lebre(int[] array) {
		// TODO Auto-generated constructor stub
		this.velocidade = gerador.nextInt(1527);
		this.quantidadeCochilosPorCorrida = gerador.nextInt(21);
		this.tempoCochilo = gerador.nextInt(21);
		this.array = array;
		
		System.out.println("Ficha Técnica LEBRE:");
		System.out.println("Velocidade: " + velocidade + " centimetros por segundo!");
		System.out.println("Cochilos: " + quantidadeCochilosPorCorrida + " cochilos");
		System.out.println("Tempo de Cochilo: " + tempoCochilo + " segundos\n");
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		faltaPercorrer = array.length;
		
		for (int i = 1; i <= array.length; i++) {
			
			faltaPercorrer = faltaPercorrer - velocidade;
			
			if (faltaPercorrer > 0) {
				
			System.out.println("\nLebre: Falta percorrer " + faltaPercorrer + " centimetros");				
			
			if (i <= quantidadeCochilosPorCorrida) {
			
				System.out.println("\nA Lebre cochilou!\n");				
			
			try {
				Thread.sleep(tempoCochilo * 1000);
				System.out.println("\nA Lebre acordou!\n");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			} else {
				System.out.println("\nE a Lebre cruzou a linha de chegada ! ! !");
				break;
			}
		}
	
		//System.out.println("Lebre percorreu " + distanciaCorrida + " metros em: " + lebreTempo + " segundos");
		
	}
	

}
