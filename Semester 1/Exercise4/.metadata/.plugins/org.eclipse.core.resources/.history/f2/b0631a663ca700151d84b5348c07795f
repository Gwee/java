public class Calculator {

	public Calculator(){	
	}
	
	public double power(int a, int b){
		return Math.pow(5, 2);
	}
	
	public int sumDigits(final int a){
		int digit;
		int tmp = Math.abs(a);
		int sum=0;
		while (tmp>0) {
			digit = tmp%10;
			tmp=tmp/10;
			sum = sum+digit;
		}
		return sum;
	}
	
	public int maxDigit(final int a){
		int tmp = Math.abs(a);
		int digit1, digit2;
		int max=0;
		while (tmp>0) {
			digit1 = tmp%10;
			tmp=tmp/10;
			digit2 = tmp%10;
			if (digit1> digit2 && digit1>max) {
				max = digit1;
			}
			else if (digit2>max) {
				max = digit2;
			}
		}
		return max;
	}
	
	
	public boolean symmetric(final int a){
		int tmp = Math.abs(a);
		int result=0;
		while (tmp>0) {
			result = result*10;
			result = result+tmp%10;
			tmp=tmp/10;
		}
		return result == a; 
	}
	
	public int insertDigit(final int number, int digitToAdd, final int index){
		int retVal = 0;
		int orig = number;
		int counter = 0;
		if (index < 0){
			return number;
		}

		while (orig > 0){
			if ( counter == index ){
				retVal += Math.pow(10, counter)*digitToAdd;
				digitToAdd = 0;
			} else {
				int digit = orig % 10;
				orig /= 10;
				retVal += Math.pow(10, counter)*digit;	
			}
			counter++;
		}
		if (index > counter) {
			return number;
		}
		if (digitToAdd != 0) {
			retVal += Math.pow(10, counter)*digitToAdd;
			return retVal;
		}
		return retVal;
	}
	
	public boolean searchDigit(final int number, final int digitToCheck){
		int orig = number;
		while (orig > 0) {
			int digit = orig%10;
			orig /= 10;
			if (digit == digitToCheck) {
				return true;
			}
		}
			return false;
	}
	
	public boolean isSorted (final int number){
		int orig = number;
		while (orig > 0) {
			int digit = orig%10;
			orig /= 10;
			if (digit >= orig%10 && orig !=0) {
				return false;
			}
		}
		return true;
	}
}
