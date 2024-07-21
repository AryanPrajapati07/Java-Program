package homework;

public class Complex {
	
//	Question 3
	
	private double realPart, imaginaryPart;

	public Complex(double realPart, double imaginaryPart) {
		super();
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public Complex() {
		this.realPart = 0;
		this.imaginaryPart = 0;
	}

	public Complex add(Complex otherNumber) {
		double realPart1 = this.realPart + otherNumber.realPart;
		double imaginaryPart1 = this.imaginaryPart + otherNumber.imaginaryPart;
		return new Complex(realPart1, imaginaryPart1);
	}

	public Complex subtract(Complex otherNumber) {
		double realPart2 = this.realPart - otherNumber.realPart;
		double imaginaryPart2 = this.imaginaryPart - otherNumber.imaginaryPart;
		return new Complex(realPart2, imaginaryPart2);
	}

	public Complex multiply(Complex otherNumber) {
		double realPart3 = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
		double imaginaryPart3 = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
		return new Complex(realPart3, imaginaryPart3);
	}

	public Complex divide(Complex otherNumber) {
		double denominator = otherNumber.realPart * otherNumber.realPart
				+ otherNumber.imaginaryPart * otherNumber.imaginaryPart;
		double realPart4 = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart)
				/ denominator;
		double imaginaryPart4 = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart)
				/ denominator;
		return new Complex(realPart4, imaginaryPart4);
	}

	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	@Override
	public String toString() {
		return "Complex [realPart=" + realPart + ", imaginaryPart=" + imaginaryPart + "]";
	}

}
