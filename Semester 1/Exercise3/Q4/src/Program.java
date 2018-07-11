import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Progression p1 = new Progression(2, 3, true);
		Progression p2 = new Progression(2, 2, false);
		long sum = 0;
		if (p1.getElement(20) > p2.getElement(5)) {
			for (int i = 1; i <= 20; i++) {
				sum += p1.getElement(i);
			}
			System.out.println("Sum of Progression 1 is "+sum);
			sum=0;
		}
		if (p2.getElement(8) >p1.getElement(20)) {
			for (int i = 1; i <= 8; i++) {
				sum += p2.getElement(i);
			}
			System.out.println("Sum of Progression 2 is "+sum);
		}
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		System.out.println("Please enter 10 numbers to see if they exist within the progression:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter Number "+i);
			userInput = sc.nextInt();

			boolean stopP1 = false;
			boolean stopP2 = false;
			int counter = 1;
			while (!stopP1 || !stopP2 ){
				if ( !stopP1 ){
					long elementP1 = p1.getElement(counter);
					if ( elementP1 > userInput ){
						stopP1 = true;
					} else if ( elementP1 == userInput ){
						System.out.println("In p1");
						stopP1 = true;
					}
				}
				if ( !stopP2 ){
					long elementP2 = p2.getElement(counter);
					if ( elementP2 > userInput ){
						stopP2 = true;
					} else if ( elementP2 == userInput ){
						System.out.println("In p2");
						stopP2 = true;
					}
				}
				counter++;
			}

		}
	}
}
