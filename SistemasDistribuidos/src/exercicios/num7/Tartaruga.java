package exercicios.num7;

public class Tartaruga implements Runnable {

	private int velocidadeTartaruga;
	private int distanciaCorrida;

	public Tartaruga(int velocidadeTartaruga, int distanciaCorrida) {
		// TODO Auto-generated constructor stub
		this.velocidadeTartaruga = velocidadeTartaruga;
		this.distanciaCorrida = distanciaCorrida*100;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int tartarugaTempo = (distanciaCorrida * 100) / velocidadeTartaruga;
		for (int i = 1; i <= tartarugaTempo; i++ ) {
		
		distanciaCorrida=-velocidadeTartaruga;
		System.out.println("Tartaruga: Falta percorrer " + distanciaCorrida);
		}
	}

}
