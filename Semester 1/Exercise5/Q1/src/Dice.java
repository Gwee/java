//import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Guy on 1/1/2016.
 */
public class Dice {
    private int numOfSides;
    private int[] statistics;
    public Dice(){
        numOfSides=6;
        statistics=new int[6];
    }
    public Dice(int n) {
        numOfSides=n;
        statistics=new int[numOfSides];
    }
    public int rollDie(){
        int result;
        result=(int)(Math.random()*numOfSides);
        statistics[result]++;
        return result;
    }

    public void showStatistics(){
        int k;
        for (k=0; k<numOfSides ; k++)
            System.out.println(k+1 +":"+statistics[k]);
    }

   public void showMostCommon(){

        int max = 0;
        int index = 0;
        for (int i = 0; i < statistics.length; i++) {
            if (statistics[i] > max) {
                index = i;
                max = statistics[i];
            }
        }
        System.out.println("The most common number is: " + (index + 1));
 }

}