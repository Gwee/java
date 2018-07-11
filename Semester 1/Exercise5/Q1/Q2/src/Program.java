import java.util.Scanner;

/**
 * Created by guy on 03/01/2016.
 */
public class Program {
    public static void main(String[] args) {
        Set s1 = new Set(10);
        s1.add(5);
        s1.add(14);
        s1.readSet(5);
        Scanner sc = new Scanner(System.in);
        int num =1;
        int temp=0;
        System.out.println("Please enter 10 numbers to see if they are in the set");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Number "+num);
            temp=sc.nextInt();
            arr[i]=temp;
            num++;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (s1.isMember(arr[i])){
                System.out.println(arr[i]+" exists in the set :)");
            }else{
                System.out.println(arr[i]+" does not exist in the set :(");
            }
        }
        sc.close();
        s1.show();
    }
}