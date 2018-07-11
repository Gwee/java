/**
 * Created by Guy on 1/19/2016.
 */
import java.util.Scanner;

/**
 * Created by guy on 03/01/2016.
 */
public class Set {
    private Integer[] set;

    public boolean isMember(int number){
        boolean b1 = false;
        for (int i = 0; i < this.set.length ; i++) {
            if (set[i] != null && set[i] == number ){
                b1 = true;
            }
        }
        return b1;
    }

    public boolean isMember (int number, Integer[] arr){
        boolean b1 = false;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != null && arr[i] == number ){
                b1 = true;
            }
        }
        return b1;
    }

    public Set (Set s){
        this.set = new Integer[s.set.length];
    }

    public Set (){
        this.set = new Integer[10];
    }

    public Set(Integer ... n){
        int j=0;
        if (n.length ==0){
           this.set = new Integer[100];
            return;
        }
        Integer[] temp = new Integer[n.length];
        for (int i = 0; i < n.length; i++) {
            if (!this.isMember(n[i],temp) && n[i] != null) {
                temp[j] = n[i];
                j++;
            }
        }
        this.set = new Integer[j];
        for (int i = 0; i < this.set.length ; i++) {
            this.set[i] = temp[i];
        }
    }
    public boolean equals (Set s){
        boolean b1 =false;
        if (this.set.length != s.set.length){
            return false;
        }
        for (int i = 0; i < s.set.length ; i++) {
            if (!this.isMember(s.set[i])) {
                return false;
            } else {
                b1 = true;
            }
        }
        return b1;
    }
    public Set union (Set s){
        int j = 0;
        int sLength = 0;
        int sLength2 = 0;
        for (int i = 0; i < s.set.length ; i++) {
            if (s.set[i]!=null){
                sLength++;
            }
        }
        for (int i = 0; i <this.set.length ; i++) {
            if (set[i]!=null){
                sLength2++;
            }
        }
        Integer[] union = new Integer[sLength+sLength2];
        for (int i = 0; i < set.length ; i++) {
                union[i] = this.set[i];
        }
        for (int i = 0; i < union.length ; i++) {
            if (union[i]==null){
                union[i] = s.set[j];
                j++;
            }

        }
        Set newSet = new Set(union);
        return newSet;
    }
    public Set interset (Set s){
        Set newSet = new Set();
        for (int i = 0; i < this.set.length ; i++) {
            for (int j = 0; j < s.set.length ; j++) {
                if (this.set[i] == s.set[j]){
                    newSet.set[i] = this.set[i];
                }
            }
        }

        return newSet;
    }
    public boolean subset (Set s){
        boolean b1 =false;
        int temp = 0;
        for (int i = 0; i < s.set.length ; i++) {

            if (s.set[i] != null) {
                if (isMember(s.set[i])) {
                    b1 = true;
                } else {
                    b1 = false;
                }
            }
        }
        return b1;
    }
    public int[] toArray(){
        int sLength = 0;
        for (int i = 0; i < this.set.length ; i++) {
            if (this.set[i] != null)
                sLength++;
        }
        int[] arr = new int[sLength];
        for (int i = 0; i < this.set.length ; i++) {
            if(this.set[i] != null) {
                arr[i] = this.set[i];
            }
        }
        return arr;
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
}
