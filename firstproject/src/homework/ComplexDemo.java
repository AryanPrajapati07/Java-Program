package homework;

public class ComplexDemo {
	
//	Question 3

	public static void main(String[] args) {
		Complex number1 = new Complex(3, 4);
        Complex number2 = new Complex(1, 2);

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        Complex sum = number1.add(number2);
        System.out.println("Sum: " + sum);

        Complex difference = number1.subtract(number2);
        System.out.println("Difference: " + difference);

        Complex product = number1.multiply(number2);
        System.out.println("Product: " + product);

        Complex quotient = number1.divide(number2);
        System.out.println("Quotient: " + quotient);
	}

}
