
public class Progression {
	long firstNum, difference;
	boolean isArithmetic;
	
	public Progression(int first,int difference, boolean isArithmetic){
		this.firstNum = first;
		this.difference = difference;
		this.isArithmetic = isArithmetic;
		int counter = 0;
		
	}
	
	public long getElement(final int k){
		long retVal = 0;
		int counter = 0;
		if (isArithmetic == true) {
			while (k >= counter) {
				retVal = this.firstNum+(counter - 1)*this.difference;
				counter++;	
			}
		
		return retVal;
		}else if (isArithmetic== false) {
			while (k >= counter) {
				retVal = this.firstNum*(int)Math.pow(this.difference, counter-1);
				counter++;	
			}
		return retVal;
		}else{
			return retVal;
		}
		
	}
	
	public void showProg(){
		this.showProg(10);
	}
	
	public void showProg(int k){
		String prog = new String();
		int counter = 1;
		while ( k >= counter) {
			//prog = toString(counter+counter);
		System.out.print(this.getElement(counter)+" ");
		counter++;
		}
		System.out.println();
	}
}
