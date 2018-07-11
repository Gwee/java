import java.util.StringTokenizer;

/**
 * Created by guy on 26/01/2016.
 */
public class Program {
    public static void main(String[] args) {
        String str = "abcd xyz abcd abcd def xyz";
        String str2 = "gu assf def tt";
        System.out.println(uniqWords(str));
        System.out.println(maxStr(str,str2));

    }
    public static String uniqWords(String s){
        String[] strArr = s.split(" ");
        String[] newStrArr = new String[strArr.length];
        String retStr="";
        boolean b1 = false;
        //Create a new String array without duplicates
        for (int i = 0; i < strArr.length ; i++) {
            for (int j = 0; j < newStrArr.length ; j++) {
                if (strArr[i].equals(newStrArr[j])){
                    b1=true;
                }
            }
            if (!b1){
                newStrArr[i] = strArr[i];
            }
            b1=false;
            if (retStr.equals("")&&newStrArr[i]!=null){
                retStr = newStrArr[i];
            }else
            if (newStrArr[i] != null)
                retStr = retStr +" "+ newStrArr[i];
        }
        return retStr;
    }
    public static String maxStr(String s1, String s2){
        String[] strArr = s1.split(" ");
        String[] strArr2 = s2.split(" ");
        String[] newStrArr = new String[strArr.length+strArr2.length];
        String retStr="";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr2.length ; j++) {
                if (strArr[i].equals(strArr2[j])){
                    newStrArr[i] = strArr[i];
                }
            }
            if (retStr.equals("")&& newStrArr[i] !=null){
                retStr = newStrArr[i];
            }else
            if (newStrArr[i] != null)
                retStr = retStr +" "+ newStrArr[i];
        }
        return retStr;
    }
}
