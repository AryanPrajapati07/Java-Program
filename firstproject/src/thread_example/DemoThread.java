package thread_example;

public class DemoThread {

	public static void main(String[] args) {
		Thread1 th = new Thread1();
		Thread2 th2 = new Thread2();
		Thread thr = new Thread(th2);

		System.out.println(th.getName());

		th.start();

		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		thr.start();

		System.out.println("Hello");

	}

}
