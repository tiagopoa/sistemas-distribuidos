package exercicios.num7;

import java.lang.reflect.Array;
import java.util.Random;

public class Lebre implements Runnable {
	
	int distanciaCorrida;

	public Lebre(int distanciaCorrida) {
		// TODO Auto-generated constructor stub
		//this.i = i;

		this.distanciaCorrida = distanciaCorrida*100;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
				
		Random gerador = new Random();
		
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
