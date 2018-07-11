import java.util.Scanner;

/**
 * Created by guy on 03/01/2016.
 */
public class Set {
    private Integer[] set;

    public Set(Integer[] set, boolean a) {
        boolean b1 = true;
        checkDuplicate(set);
    }

    private boolean checkDuplicate(Integer[] set) {
        boolean b1=false;
        for (int i = 0; i < set.length; i++) {
            for (int j = 0; j < set.length; j++) {
                if (i != j && set[i]!=null && set[i] == set[j])
                    b1=true;
            }
        }
            return b1;
    }

    public boolean isMember(int number){
        boolean b1 = false;
        for (int i = 0; i < this.set.length ; i++) {
            if (set[i] != null && set[i] == number ){
                b1 = true;
            }
        }
        return b1;
    }

    public Set(int n){
        this.set = new Integer[n];
    }

    public boolean add (int number){
        int  i=0;
        boolean b1=false;
        if (isMember(number)){
            System.out.println(number+" already exists in the set");
            return b1;
        }
        //Runs through the array and adds the number respectively
        while (i < this.set.length) {
            if (this.set[i] == null) {
                this.set[i] = number;
                b1=true;
                break;
                }
             else {
                i++;
            }
        }
        //If number hasn't been added, then there is no room left in the array and returns false
        if (!b1){
            System.out.println("No room left in set");
            return b1;
        }else {
            return b1;
        }
    }
        //Prints values and if they are null shows them as empty
    public void show(){
        System.out.print("(");
        for (int i = 0; i < this.set.length; i++) {
            if (i==set.length-1){
                if (set[i] ==null){
                    System.out.print(")");
                    System.out.println();
                }else {
                    System.out.print(set[i] + ")");
                    System.out.println();
                }
            }else{
                if (set[i] == null){
                    System.out.print(", ");
                }else {
                    System.out.print(set[i] + ", ");
                }
            }
        }
    }

    public boolean isEmpty(){
        boolean b1=false;
        for (int i = 0; i < this.set.length ; i++) {
            if (set[i]==null){
                b1=true;
            }else{
                b1=false;
                return b1;
            }
        }
        return b1;
    }

    public boolean isFull(){
        boolean b1=false;
        for (int i = 0; i < this.set.length; i++) {
            if (set[i]!=null){
                b1= true;
            }else{
                b1= false;
            }
        }
        return b1;
    }
    private int spaceLeft(){
        int count=0;
        for (int i = 0; i < this.set.length ; i++) {
            if (set[i]==null){
                count++;
            }
        }
        return count;
    }
    public void readSet(int numOfMembers){
//        int[] arr = new int[numOfMembers];
        int num=1;
        int temp=0;
        Scanner sc = new Scanner(System.in);
        if (isFull()){
            System.out.println("Cannot add to set because its full");
            return;
        }
        else {

            System.out.println("Please enter the numbers you would like to add. There are currently "+spaceLeft()+" spaces left in the set");
            for (int i = 0; i < numOfMembers; i++) {
                if (spaceLeft()==0) {
                    System.out.println("Set is now full");
                    break;
                }else{
                    System.out.println("Number "+num);
                    num++;
                    temp = sc.nextInt();
                    if (isMember(temp)){
                        System.out.println(temp+" is in the set, please enter a different number");
                        i--;
                        num--;
                    }else{
                        add(temp);
                    }
                }
            }
        }
    }
}