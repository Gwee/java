import java.util.Scanner;


public class Rational {
	private double denominator, numerator;
	
	public Rational(){
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public Rational(int numer, int denom){
		this.numerator = numer;
		if (denom ==0) {
			System.out.println("ERROR- A denominator of 0 is not allowed!");
		}else {
			this.denominator = denom;	
		}
	}
	
	public Rational(int numer){
		this.numerator = numer;
		this.denominator = 1;
	}
	
	public void show(){
		//int denom = (int) (this.denominator);
		//int num = (int) (this.numerator);
		//System.out.println(num+"/"+denom);
		System.out.println(this.numerator+"/"+this.denominator);
	}
	
	public void fractionReduction(){
		double multiplier = (this.denominator / this.numerator);
		if (numerator <denominator) {
			while (numerator - 1 != 0 || denominator - multiplier != 0) {
				numerator -= 1;
				denominator -= multiplier;
				}
		}
		
	}
	
	public double rationalDecimal(){
		return numerator / denominator;
	}
	
	public void readRational(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numerator for the rational number:");
		this.numerator = sc.nextInt();
		while (this.numerator == 0) {	
			System.out.println("0 is not a valid number! Please re-enter the numerator:");
			this.numerator = sc.nextInt();
		}
		System.out.println("Please enter the denominator for the rational number:");
		this.denominator = sc.nextInt();
		while (this.denominator == 0) {
			System.out.println("0 is not a valid number! Please re-enter the denominator:");
			this.denominator = sc.nextInt();
		}
	}
}