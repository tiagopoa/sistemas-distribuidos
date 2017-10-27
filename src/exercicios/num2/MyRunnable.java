package exercicios.num2;

public class MyRunnable implements Runnable {
	
	int idThread = 0;
	int num = 0;

	public MyRunnable(int i, int numThread) {
		// TODO Auto-generated constructor stub
		this.idThread = i;
		this.num = numThread;	
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = idThread; j <= 100; j+=4){
		System.out.println("Thread" + idThread + ": " + j );
		
		}

		

	}

}
