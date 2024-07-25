package static_example;

public class Staticexample {

	static String msg = "Aryan Prajapati";
	static int id = 0;
	int i = 0;

	public Staticexample() {
		i++;
		++id;
	}

	@Override
	public String toString() {
		return "Staticexample [i=" + i + "]";
	}

}
