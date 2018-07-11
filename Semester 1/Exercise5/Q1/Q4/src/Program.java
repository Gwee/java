/**
 * Created by Guy on 1/16/2016.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("There are "+countWords("  a  string called     guy    moyal   :)  ")+" words in the string '  a  string called     guy    moyal   :)  '");
        stringFlip("hello my name is guy ");

    }
    public static int countWords(String s) {
        int count = 0;
        boolean word = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word = true;
            } else if (s.charAt(i) == ' ' && word) {
                count++;
                word = false;
            }
            if (i == s.length() - 1 && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static void stringFlip(String s){
        String word = "";
        boolean isword=false;
        for (int i = s.length()-1 ; i >= 0 ; i--) {
            char tmp = s.charAt(i);
            if (i == s.length() -1 ){
                word = word +" ";
            }
            if (tmp != ' '){
                word =  s.charAt(i) + word;
                isword = true;
            }

            if (tmp == ' ' && isword){
                System.out.print(word);
                word = " ";
                isword=false;
            }
        }
        System.out.println(word);
    }

}
