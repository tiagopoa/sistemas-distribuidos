package exercicios.num7;

public class Lebre implements Runnable {
	
	private int velocidadeLebre;
	private int quantidadeCochilosPorCorrida;
	private int tempoCochilo;
	private int distanciaCorrida;

	public Lebre(int velocidadeLebre, int quantidadeCochilosPorCorrida, int tempoCochilo, int distanciaCorrida) {
		// TODO Auto-generated constructor stub
		//this.i = i;
		this.velocidadeLebre = velocidadeLebre;
		this.quantidadeCochilosPorCorrida = quantidadeCochilosPorCorrida;
		this.tempoCochilo = tempoCochilo;
		this.distanciaCorrida = distanciaCorrida;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int lebreTempo = (distanciaCorrida * 100) / velocidadeLebre;		
		
		for (int i = 1; i <= quantidadeCochilosPorCorrida; i++) {
			
			try {
				Thread.sleep(tempoCochilo * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}	
			
		}
	
		System.out.println("Lebre percorreu " + distanciaCorrida + " metros em: " + lebreTempo + " segundos");
		
	}
	

}
