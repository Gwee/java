
public class Program {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		System.out.println(calc1.sumDigits(123987));
		System.out.println(calc1.maxDigit(123471231));
		System.out.println(calc1.insertDigit(123, 9, 3));
		System.out.println(calc1.searchDigit(1231989, 3));
		System.out.println(calc1.isSorted(9853210));
	}

}
