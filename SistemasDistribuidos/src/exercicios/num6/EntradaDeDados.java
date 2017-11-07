package exercicios.num6;

import javax.swing.JOptionPane;


public class EntradaDeDados implements Runnable{
	
	public void run() {
		
		/*for (int i = 1; i <= 10000; i++) {
			System.out.println("Thread1 : " + i);
		}*/
		String sensor1;

			sensor1 = JOptionPane.showInputDialog("Qual valor para o Sensor1");
			
			System.out.println(sensor1);
		
	}

}
