
public class Circle {
	private int x,y;
	private int radius;
	
	public Circle(int a,int b,int r) {
		x=a; y=b; radius=r;
	}
	public Circle(){
		radius=1;
		x=0;
		y=0;
	}
	public Circle(int a, int b){
		radius=1;
		x=a;
		y=b;
	}
	public int getRadius(){
		return radius;
	}
	public boolean isInCircle(int a, int b){
		int xA = (a-x)*(a-x);
		int yB = (b-y)*(b-y);
		int r = radius*radius;
		return xA+yB <= r;
	}
	public void move(int a, int b){
		x=a;
		y=b;
	}
	public void showCircle(){
		System.out.println("Circle Properties: X="+x+", Y="+y+", Radius="+radius);
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
	
}

