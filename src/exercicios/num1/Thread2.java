package exercicios.num1;

public class Thread2 implements Runnable {
	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			for (int i = 500; i >= 1; i--) {
				System.out.println("Thread2: " + i);
				
				/*try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}*/
			
		}
	

}
}
