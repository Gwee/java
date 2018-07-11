
public class QuadFun {
	private double a,b,c,x1,x2;
	final static double epsilon=0.01;
//	final double equation = Math.pow(b, 2) -4 * a * c;
	
	public QuadFun(int ax, int bx, int cx ){
		if (ax == 0) {
			System.out.println("Cannot have 0 as ax, changing value to 1");
			this.a=1;
			this.b = bx;
			this.c = cx;
		} else{
			this.a = ax;
			this.b = bx;
			this.c = cx;
		}
	}
	
	public QuadFun(int bx, int cx){
		this(1,bx,cx);
	}
	
	public QuadFun(int cx){
		this(1,0,cx);
	}
	
	public void show(){
		int a = (int)this.a;
		int b = (int)this.b;
		int c = (int)this.c;
		if (b==0) {
			System.out.println("f(x)="+a+"x^2+"+c);
		}
		if (c==0) {
			System.out.println("f(x)="+a+"x^2+"+b+"x");
		}else{
		System.out.println("f(x)="+a+"x^2+"+b+"x+"+c);
		}
	}
	
	public void solve(){
		double equation = Math.pow(b, 2) -4 * a * c;
		this.x1 = (-b + Math.sqrt(equation)) / (2*a); 
		this.x2 = (-b - Math.sqrt(equation)) / (2*a);
		System.out.println("X1: "+x1+", X2: "+x2);
	}
	
	public double evaluate(int x){
		return this.a*Math.pow(x,2)+this.b*x+this.c;
	}
	
	public double solveByBisection(){
		double randomA = (int)(Math.random()*20)-10;
		double randomB = (int)(Math.random()*20)-10;
		double tempC;
		while (randomA*randomB > 0) {
			randomA = (int)(Math.random()*20)-10;
			randomB = (int)(Math.random()*20)-10;
		}
		while (randomA-randomB > epsilon) {
			tempC = randomA + randomB / 2;
			if (randomA*tempC<0 ) {
				randomB = tempC;
			}else {
				randomA = tempC;
			}
		}
		return randomA + randomB / 2;
	}
}
