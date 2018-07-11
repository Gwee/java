import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers for the quadratic function");
		int[] inputArr = new int[3];
		int i=0;
		while (i <inputArr.length) {
			switch (i) {
			case 0:
				System.out.println("Please enter the A: ");
				inputArr[i] = scan.nextInt();
				i++;
				break;
			case 1:
				System.out.println("Please enter the B: ");
				inputArr[i] = scan.nextInt();
				i++;
				break;
			case 2:
				System.out.println("Please enter the C: ");
				inputArr[i] = scan.nextInt();
				i++;
				break;
			}
		}
		
		QuadFun newQuad = new QuadFun(inputArr[0], inputArr[1], inputArr[2]);
		newQuad.show();
		newQuad.solve();
		i=0;
		int number=1;
		int[] numbersToEvalArr= new int[10];
		System.out.println("Please enter 10 numbers to be evaluated");
		while (i<numbersToEvalArr.length) {
			number = i+1;
			System.out.println("Please enter Number "+number);
			numbersToEvalArr[i] = scan.nextInt();
			i++;
		}
		int[] evaluatedArr = new int[10];
		for (int j = 0; j < numbersToEvalArr.length; j++) {
			double f = newQuad.evaluate(numbersToEvalArr[j]);
			System.out.println("The value of "+numbersToEvalArr[j]+" in the quad function is: "+f);
			evaluatedArr[j] = (int)f;
		}
		int min=evaluatedArr[0];
		int max=evaluatedArr[0];
		for (int j = 0; j < evaluatedArr.length; j++) {
			if (evaluatedArr[j] > max ) {
				max = evaluatedArr[j];
			}
			if (evaluatedArr[j] < min) {
				min = evaluatedArr[j];
			}
		}
		System.out.println("Minimum value is "+min+", Maximum value is "+max);
		System.out.println("BiSection = "+newQuad.solveByBisection());
		scan.close();
	}
}
