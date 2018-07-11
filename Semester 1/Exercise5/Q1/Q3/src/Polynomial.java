/**
 * Created by Guy on 1/15/2016.
 */
public class Polynomial {
    //private int[] polynomial;
    private Pair[] polynomial;

    public Polynomial (int ... num){
        if (num == null || num.length % 2 == 1){
            System.out.println("Must have pairs of 2 numbers");
        }
        this.polynomial = new Pair[num.length/2];
        int j = 0;
        for (int i = 0; i < num.length ; i=i+2) {
            this.polynomial[j]= new Pair(num[i],num[i+1]);
            j++;
        }
    }

    public double evaluate (double x){
        double result = 0;
        polynomial[0].showPair();
        for (int i = 0; i < polynomial.length ; i++) {
            result = result + (polynomial[i].evaluate(x));
        }
        return result;
    }

    public boolean isRoot(double x ){
        return evaluate(x) == 0;
    }

    public void show(){
        System.out.print("p(x)=");
        for (int i = 0; i < polynomial.length ; i++) {
            if (i==polynomial.length-1){
                System.out.print(polynomial[i].showPair());
            }else {
                System.out.print(polynomial[i].showPair() + "+");
            }
        }
        System.out.println();
    }

    public void showDerivative() {
        System.out.print("p'(x)=");
        for (int i = 0; i < polynomial.length; i++) {
            if (i == polynomial.length - 1) {
                System.out.print(polynomial[i].derivativePair());
            } else {
                System.out.print(polynomial[i].derivativePair() + "+");
            }
        }
        System.out.println();
    }


  private class Pair {
      private int x1, x2;

      public Pair(int x1, int x2) {
            if (x2 == 0){
                System.out.println("Cannot have 0 as coeffecient!");
            }else {
                this.x1 = x1;
                this.x2 = x2;
            }
      }

      public double evaluate(double x){
          return x2*Math.pow(x,x1);
      }

      public String showPair(){
          if (x1 == 0){
              return ""+x2;
          }else if (x1 == 1){
              return x2+"x";
          }
          else {
              return x2 + "x^" +x1;
          }
      }

      public String derivativePair(){
          if (x1==0){
//              return x1+"";
              return this.showPair();
          }else{
              x2 = x1 * x2;
              x1=x1-1;
              if (x1 == 1){
                  return x2+"x";
              }
          }
          return this.showPair();
      }
  }
}
