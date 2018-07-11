
public class Program {
	public static void main (String [] args){


		//Perpendicular Lines
		StraightLine Line1 = new StraightLine(1,4,7,4);
		StraightLine Line2 = new StraightLine(3,7,3,1);

		test(Line1, Line2);

		//Crossing Lines
		StraightLine Line3 = new StraightLine(0,-5,-1,-7);
		StraightLine Line4 = new StraightLine(3,0,-3,2);

		test(Line3, Line4);
		
		//Parallel Lines
		StraightLine Line5 = new StraightLine(2,2, 6,6);
		StraightLine Line6 = new StraightLine(3,3);

		test(Line5, Line6);
}

	private static void test(StraightLine Line1, StraightLine Line2) {
		boolean originInOnLine = Line2.isOnLine(0,0);
		if (originInOnLine == true){
			System.out.println("Line2 is on the origin");	
		}
		else{
			System.out.println("Line2 is not on the origin");
		}

		double slope1 = Line1.slope();
		double slope2 = Line2.slope();

		boolean parallels = slope1 == slope2;
		if (parallels){
			System.out.println("Line1 and Line2 are parellel to each other");
		} else if (perpendicular(slope1, slope2)){
			System.out.println("Line1 and Line2 are perpendicular to each other");				
		}
		else {
			System.out.println("Line1 and Line2 cross each other");
		}
	}
	
	public static boolean perpendicular(double slope1, double slope2){
		if (slope1 != 0){
			return (-1/slope1)==slope2;
		} else if (slope2 != 0){
			return (-1/slope2)==slope1;
		}
		return false;
	}
}
