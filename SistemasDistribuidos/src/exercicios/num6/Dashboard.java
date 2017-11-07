package exercicios.num6;

import javax.management.Attribute;

public class Dashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntradaDeDados entradaDedados = new EntradaDeDados();
		Thread threadEntradaDeDados = new Thread(entradaDedados);
		threadEntradaDeDados.start();
		
		AtualizaDashboard atualizaDashboard = new AtualizaDashboard();
		Thread threadAtualizaDashboard = new Thread(atualizaDashboard);
		threadAtualizaDashboard.start();
		

	}

}
