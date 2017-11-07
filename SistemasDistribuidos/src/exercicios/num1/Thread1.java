package exercicios.num1;


public class Thread1 implements Runnable {
	
	int i = 0;

	public Thread1(int i) {
		// TODO Auto-generated constructor stub		
		this.i = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if (i == 1) {
		for (int i = 1; i <= 500; i++) {
			System.out.println("Thread1: " + i);
		}
		} else if (i == 2) {
			for (int i = 500; i >= 0; i--) {
				System.out.println("Thread2: " + i);
		}
		}
			
			/*try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}*/
		
	
	

	

}
}
