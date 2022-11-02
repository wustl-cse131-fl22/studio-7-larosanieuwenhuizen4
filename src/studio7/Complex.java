package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Complex() {
		this.real = 0.0;
		this.imaginary = 0.0;
	}
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	public Complex add(Complex com) {
		double realSum = this.real+com.getReal();
		double imagSum = this.imaginary+com.getImaginary();
		Complex result = new Complex(realSum, imagSum);
		return result;
		
	}
	
	public Complex multiply(Complex com) {
		double realProd = (this.real*com.getReal())-(this.imaginary*com.getImaginary());
		double imagProd = (this.real*com.getImaginary())+(com.getReal()*this.imaginary);
		Complex result = new Complex(realProd, imagProd);
		return result;
		
	}

	@Override
	public String toString() {
		return "Complex [real=" + real + ", imaginary=" + imaginary + "]";
	}
}
