package studio7;

public class Die {

	private int n;
	private int value;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Die(){
		this.n = 1;
		this.value = 1;
	}
	
	public Die(int initN){
		this.n = initN;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int roll() {
		return (int)(Math.random()*this.n)+1;
	}

	@Override
	public String toString() {
		return "Die [n=" + n + ", value=" + value + "]";
	}
	
	

}
