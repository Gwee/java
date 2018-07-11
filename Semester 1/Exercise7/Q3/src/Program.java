import java.util.Arrays;

/**
 * Created by guy on 16/02/2016.
 */
public class Program {
    public static void main(String[] args) {
        int[] a = {2,3,4,8,20};
        int[] b = {7,9,10,11};
        int[] c = new int[a.length+b.length];
        mergeArrays(a,b,c,a.length,b.length,c.length);
        System.out.println(Arrays.toString(c));
    }
    public static void mergeArrays(int[] a, int[] b, int[] c, int aLength, int bLength, int cLength) {
        if (cLength > 0) {
            int aCurrentLocation = aLength - 1;
            int bCurrentLocation = bLength - 1;
            int cCurrentLocation = cLength - 1;
            if (aCurrentLocation < 0) {
                c[cCurrentLocation] = b[bCurrentLocation];
            } else if (bCurrentLocation < 0) {
                c[cCurrentLocation] = a[aCurrentLocation];
                aLength = aCurrentLocation;
            } else if (a[aCurrentLocation] >= b[bCurrentLocation]) {
                c[cCurrentLocation] = a[aCurrentLocation];
                aLength = aCurrentLocation;
            } else {
                c[cCurrentLocation] = b[bCurrentLocation];
                bLength = bCurrentLocation;
            }
            mergeArrays(a, b, c, aLength, bLength, cCurrentLocation);
        }
    }
}
