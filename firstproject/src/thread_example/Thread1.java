package thread_example;

public class Thread1 extends Thread{
	@Override
	public void run() {

		for (int i = 100; i <= 110; i++) {

			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}
