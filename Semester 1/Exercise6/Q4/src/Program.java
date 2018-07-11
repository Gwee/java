/**
 * Created by guy on 25/01/2016.
 */
public class Program {
    public static void main(String[] args) {
        Point[] allPoints = new Point[5];
        int k = 0;
        int rx, ry;
        while (k <= allPoints.length-1) {
            rx = (int) (1 + Math.random() * 10);
            ry = (int) (1 + Math.random() * 10);
            allPoints[k] = new Point(rx, ry);
            k++;

        }
        int i, j, mi, mj;
        int length = countLength(allPoints.length);
        double[] disArray = new double[length];
        double mDis = 0, cDis;
        mi = mj = 0;
        i = 0;
        int tmp =0;
        while (i < allPoints.length - 1) {
            j = i + 1;
            while (j < allPoints.length) {
                cDis = allPoints[i].distance(allPoints[j]);
                if (cDis > mDis)
                    mDis = cDis;
                mj = j;
                mi = i;
                disArray[tmp] = cDis;
                tmp++;
                j++;
            }

            i++;
        }
        for (int l = 0; l < disArray.length; l++) {
            for (int m = 0; m < disArray.length; m++) {
                double temp = 0;
                if (disArray[l] > disArray[m]){
                    temp = disArray[l];
                    disArray[l] = disArray[m];
                    disArray[m] = temp;

                }
            }
        }
        System.out.print("max dis is " + mDis +"first point is "+mi +"second point is "+mj);
        System.out.println();
        System.out.println("Sorted array is ");
        for (int l = 0; l < disArray.length ; l++) {
            System.out.print(disArray[l]+" ,");
        }

    }
    public static int countLength (int l){
        if (l==1){
            return 1;
        }else{
            return l+countLength(l-1);
        }
    }
}
