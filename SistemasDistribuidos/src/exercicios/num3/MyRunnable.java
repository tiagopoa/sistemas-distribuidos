package exercicios.num3;

public class MyRunnable implements Runnable {
	
	int idThread = 0;
	int[] arr = new int[200];
	int elemento = 0;
	int num = 0;

	public MyRunnable(int i, int numThreads, int[] array, int elemento) {
		// TODO Auto-generated constructor stub
		this.elemento = elemento;
		this.idThread = numThreads;
		this.arr = array;
		this.num = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = num; i < arr.length; i+=idThread) {
			if (arr[i] == elemento) {
				System.out.println("Thread" + num + " encontrou o Elemento " + elemento + " na posição " + i);
			}
			//System.out.println(arr[i]);
		}


	}
	
	


}
