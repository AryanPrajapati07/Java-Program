package homework;

public class Question1 {
	
//	https://beginwithjava.com/java/classes-ii/questions.html

	private static int count = 0;
	private int x;

	public Question1(int i) {
		x = i;
	}

	public void incrementCount() {
		count++;
	}

	public void printX() {
		System.out.println("Value of x : " + x);
	}

	public static void printCount() {
		System.out.println("Value of count : " + count);
	}

	public static void main(String[] args) {
		Question1 myObject1 = new Question1(5);
		Question1 myObject2 = new Question1(7);

		myObject1.printX();
		myObject1.incrementCount();
//		Question1.incrementCount();
		myObject1.printCount();
		myObject2.printCount();
		myObject2.printX();
//		myObject1.setX(14);
		myObject1.incrementCount();
		myObject1.printX();
		myObject1.printCount();
		myObject2.printCount();

	}
}
