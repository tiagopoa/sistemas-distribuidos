package exercicios.num7;

<<<<<<< HEAD
import java.lang.reflect.Array;
import java.util.Random;

public class Lebre implements Runnable {
	
	int distanciaCorrida;

	public Lebre(int distanciaCorrida) {
		// TODO Auto-generated constructor stub
		//this.i = i;

		this.distanciaCorrida = distanciaCorrida*100;
=======
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
>>>>>>> c41522105e7bb0eff58d90986c5c21189d080bbe
		
		System.out.println("Ficha Técnica LEBRE:");
		System.out.println("Velocidade: " + velocidade + " centimetros por segundo!");
		System.out.println("Cochilos: " + quantidadeCochilosPorCorrida + " cochilos");
		System.out.println("Tempo de Cochilo: " + tempoCochilo + " segundos\n");
			
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
				
		Random gerador = new Random();
		
<<<<<<< HEAD
		int velocidadeLebre = gerador.nextInt(51);
		int quantidadeCochilosPorCorrida = gerador.nextInt(4);
		int tempoCochilo = gerador.nextInt(4);
		int tempo = 0;
		int falta = distanciaCorrida;
		
		if (tempoCochilo == 0 || velocidadeLebre == 0 || quantidadeCochilosPorCorrida == 0) {
			tempoCochilo = 1;
			velocidadeLebre = 1;
			quantidadeCochilosPorCorrida = 1;
		}
=======
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
>>>>>>> c41522105e7bb0eff58d90986c5c21189d080bbe
		
		System.out.println("\n#############################################");
		System.out.println("Ficha técnica da LEBRE:");
		System.out.println("Velocidade: " + velocidadeLebre);
		System.out.println("Cochilos: " + quantidadeCochilosPorCorrida);
		System.out.println("Tempo de cada Cochilo: " + tempoCochilo);
		System.out.println("#############################################\n");
		
		
		for (int i = 1; i <= distanciaCorrida; i++) {
			if (falta >= 0) {
			falta = falta - velocidadeLebre;
			
				
				for (int j = 0; j <= quantidadeCochilosPorCorrida; j++) {
					
					System.out.println("j = " + j);
					System.out.println("QUantidade cochilo: " + quantidadeCochilosPorCorrida);
					
								
				}
		
			} else {
			
			System.out.println("\nLebre cruzou a linha de chegada em " + tempo + " segundos!!!");
			}
			
	

			}
	}
	}
