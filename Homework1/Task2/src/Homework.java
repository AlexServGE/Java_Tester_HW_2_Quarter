import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        Boolean[] arrayP = {false, true};
        Boolean[] arrayQ = new Boolean[2];
        System.arraycopy(arrayP, 0, arrayQ, 0, arrayP.length);

        Boolean[][] resultArray = new Boolean[4][4];
        int m = -1;
        for (int i = 0; i < arrayP.length; i++) {
            for (int j = 0; j < arrayQ.length; j++) {
                System.out.println("-------------------------------------------------------------------");
                System.out.printf(String.format("p = %b , q = %b \n",arrayP[i],arrayQ[j]));
                System.out.println("-------------------------------------------------------------------");
                resultArray[++m][0] = arrayP[i] & arrayQ[j];
                System.out.printf(String.format("%b = %b & %b \n",resultArray[m][0],arrayP[i],arrayQ[j]));
                resultArray[m][1] = arrayP[i] | arrayQ[j];
                System.out.printf(String.format("%b = %b | %b \n",resultArray[m][1],arrayP[i],arrayQ[j]));
                resultArray[m][2] = arrayP[i] ^ arrayQ[j];
                System.out.printf(String.format("%b = %b ^ %b \n",resultArray[m][2],arrayP[i],arrayQ[j]));
                resultArray[m][3] = !arrayP[i];
                System.out.printf(String.format("%b = !%b \n",resultArray[m][3],arrayP[i]));
            }
        }
    }
}