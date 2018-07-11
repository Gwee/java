import java.util.Scanner;

public class Program {
	public static void main (String[] args){
		System.out.println("Please enter 10 numbers");
		calcTenValues();
	}

	private static int calcTenValues() {
		int n;
		int counter=0;
		double diffE;
		double diffTwo;
		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		while (counter <arr.length) {
			System.out.println("Number "+(counter+1)+": ");
			n = scan.nextInt();
			arr[counter]= n;
			diffE = Calculator.approximateE(n) - Math.E;
			diffTwo = Calculator.approximateTwo(n) - 2;
			System.out.println("DiffE="+diffE+", approximateE="+Calculator.approximateE(n)+", DiffTwo="+diffTwo+", approximateTwo="+Calculator.approximateTwo(n)+", n="+n);
			counter++;
		}
		
		scan.close();
		return counter;
	}
}
