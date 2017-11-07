package exercicios.num7;


import java.lang.reflect.Array;
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
		this.velocidade = gerador.nextInt(51);
		this.quantidadeCochilosPorCorrida = gerador.nextInt(11);
		this.tempoCochilo = gerador.nextInt(5);
		this.array = array;

		
		System.out.println("Ficha Técnica LEBRE:");
		System.out.println("Velocidade: " + velocidade + " centimetros por segundo!");
		System.out.println("Cochilos: " + quantidadeCochilosPorCorrida + " cochilos");
		System.out.println("Tempo de Cochilo: " + tempoCochilo + " segundos\n");
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		int distanciaCorrida = array.length;
		
		if (tempoCochilo == 0 || velocidade == 0 || quantidadeCochilosPorCorrida == 0) {
			tempoCochilo = 1;
			velocidade = 1;
			quantidadeCochilosPorCorrida = 1;
		}

		faltaPercorrer = array.length;
		
		for (int i = 1; i <= distanciaCorrida; i++) {
			
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
	}
}

		
		