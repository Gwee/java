/**
 * Created by Guy on 1/1/2016.
 */
public class Program {
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);
        for (int i = 0; i < 1000; i++) {
            dice1.rollDie();
        }
        dice1.showStatistics();
        dice1.showMostCommon();
    }
}
