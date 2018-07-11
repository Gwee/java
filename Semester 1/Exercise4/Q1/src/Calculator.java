public class Calculator {

	public Calculator(){
	}

	public static double approximateTwo(int n){
		int x = 1;
		int sum = 0;
		int counter = 0;
		int[] arr = new int[n];
		while (counter<=arr.length -1) {
			arr[counter] =  x*=2;
			sum += arr[counter];
			counter++;
		}
		return Math.pow(sum, -1);
	}

	public static double approximateE(int n){
		int x = 0;
		int sum = 1;
		int counter = 0;
		int[] arr = new int[n];
		while (counter<= arr.length -1) {
			arr[counter] = x+1;
			sum *= arr[counter];
			counter++;
			x++;
		}
		return Math.pow(sum, -1);
	}

}
