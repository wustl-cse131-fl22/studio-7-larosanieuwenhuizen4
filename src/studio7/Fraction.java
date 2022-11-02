package studio7;

public class Fraction {

	private int num;
	private int denom;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Fraction() {
		this.num = 0;
		this.denom = 1;
	}

	public Fraction(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public Fraction add(Fraction frac) {
		int numSum = (frac.getNum()*this.denom)+(this.num*frac.getDenom());
		int denomSum = frac.getDenom()*this.denom;
		Fraction result = new Fraction(numSum, denomSum);
		return result;
	}
	
	public Fraction multiply(Fraction frac) {
		int numProd = frac.getNum()*this.num;
		int denomProd = frac.getDenom()*this.denom;
		Fraction result = new Fraction(numProd, denomProd);
		return result;
	}
	
	public Fraction reciprocal(Fraction frac) {
		int numRecip = this.denom;
		int denomRecip = this.num;
		Fraction result = new Fraction(numRecip, denomRecip);
		return result;
	}
	
	public int gcd(int p, int q) {
		if(p%q==0) {
			return q;
		}
		else {
			return gcd(q, p%q);
		}
			
		
	}
	
	public Fraction simplify(Fraction frac) {
		if(this.num%this.denom==0) {
			int numSimp = this.num/this.denom;
			Fraction result = new Fraction(numSimp, this.denom);
			return simplify(result);
		}
		else {
			return frac;
		}
	}
	
	@Override
	public String toString() {
		return "Fraction [num=" + num + ", denom=" + denom + "]";
	}
	
	
	
	
	
	
	
	

}
