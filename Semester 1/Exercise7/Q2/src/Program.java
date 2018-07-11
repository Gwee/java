import java.util.Scanner;

/**
 * Created by guy on 09/02/2016.
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the level of the game (Please type - Easy, Medium or Hard");
        String gameLevel = sc.nextLine();
        Game game1 = new Game(gameLevel);
        System.out.println(gameLevel +" game has started! The game will end when you have marked all of the mines or if one explodes :)");
        game1.start();
        sc.close();
    }
}
