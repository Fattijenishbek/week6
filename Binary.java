package week6;

import java.util.Scanner;
import java.lang.Math;
public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result;
        double  f = 0;

        int a = input.nextInt();
        String number = String.valueOf(a);
        int s = number.length();
        int[] arr;
        arr = new int[s];

        for (int i = 0; i < s ; i++) {
            arr[i] = a % 2;
            a = a % 10;
        }
        for (int d = 0; d <= s ; d++) {
            for (int l = s - 1; l >= 0; l--) {




                if (arr[d] == 1) {
                    result = Math.pow(2, l);
                    f= f+result;}
                if(arr[d]==0){
                    f=f-0;
                }



            }
            System.out.println(f);
            return;

        }

    }


}