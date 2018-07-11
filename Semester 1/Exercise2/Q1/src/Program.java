
public class Program {
	
	public static void main(String[] args) {
		
			Circle c1 = new Circle(4,3,5);
			double result = c1.getArea();
			System.out.println(result);
			Circle c2 = new Circle(0,0,1);
			c2.move(5, 2);
			int radius1 = c1.getRadius();
			int radius2 = c2.getRadius();
			
			if (radius1>radius2 == true) {
				System.out.println("Circle1 is bigger with a radius of "+radius1);
			} else if (radius1==radius2) {
				System.out.println("Circle1 and Circle2 have the same radius of "+radius1);		
			} else {
			System.out.println("Circle2 is bigger with a radius of "+radius2);
			}
	}
}
