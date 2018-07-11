import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by guy on 10/01/2016.
 */
public class Program {
    public static void main(String[] args) {
//        digitCount(53442);
//        System.out.println(multiply(224));
//        System.out.println(fibonacci(5));
//        int[] arr = new int[10];
//        arr= new int[]{1, 2, 3, 4, 5, 6};
//        System.out.println(isInArray(arr,5,2,5));
        System.out.println(Arrays.toString(getPermutations("guy", "guy is a yug")));
        int[] a = {5,4,3};
        System.out.println(findNum(a,a.length,2));
        System.out.println(sum(4));
        System.out.println(7/2);
    }

    public static int sum (int n) {
        if (n == 1)
            return 1;
        return sum(n-1) + n;
    }


    public static String[] getPermutations(String w, String s){
        String returnString ="";
        char[] wordToCompareArr = w.toCharArray();
        String[] word = s.split(" ");
        for (int i = 0; i < word.length ; i++) {
            char[] newWord = word[i].toCharArray();
            //if(compareChars(wordToCompareArr,newWord)){
            if (compareWords(word[i], w)){
                returnString += word[i]+ " ";
            }
        }
        String[] retStringArr = returnString.split(" ");
        return retStringArr;
    }

    public static boolean compareChars(char[] s1, char[] s2){
        boolean b1 = false;
        if (s1.length != s2.length){
            return false;
        }
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]){
                    b1 = true;
                    break;
                } else{
                    b1= false;
                }
            }
        }
        return b1;
    }

    public static boolean compareWords(String word1, String word2){
        boolean b1 = false;
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    b1=true;
                    break;
                }else {
                    b1 = false;
                }
            }
        }
        return b1;
    }

    public static boolean compareChars(char[] s1, char[] s2, int i){
        if (i == 0){
            return true;
        }
        else{
            return compareChars(s1,s2,i-1);
        }
    }

    public static boolean findNum (int[] A, int num, int count){
        if(count==1)
            return (A[0]==num) || (A[0]==-num);
        return findNum(A,num+A[count-1],count-1) || findNum(A,num-A[count-1], count-1);
    }
    //What is the mikre metzumtzam and mikre klali??
    public static int digitCount(int n) {
        if (-9 <= n && n <= 9) {
            return 1;
        }
        int dc = digitCount(n / 10);
        return dc + 1;
    }

    public static int multiply(int x){
        if (-9<= x && x <=9){
            return x;
        }
        return x%10 + multiply(x/10);
    }

    //Max element
    public static int maxElm(int[]  A , int n) {
        if (n == 1)
            return A[0];
        int tempMax = maxElm(A , n-1);
        if (tempMax > A[n-1] )
            return tempMax;
        else
            return A[n-1];
    }

    public static int fibonacci(int n){
        if (n <= 1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static boolean isInArray(int[] arr, int x, int start, int end) {
        if (end < start) {
            return false;
        }else if (arr[end] ==x){
            return true;
        }else {

            return isInArray(arr, x, start, end - 1);
        }
    }

    public static int ME2(int[] a, int i, int j){
        if (i==j){
            return a[i];
        }
        int mid = (i+j) /2;
        int mLeft = ME2(a,mid+1,j);
        int mRight = ME2(a, mid+1, 0);
        if (mLeft > mRight) {
            return mLeft;
        }else{
            return mRight;
        }

    }
}
