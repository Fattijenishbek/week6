package week6;

import java.util.Scanner;

public class MaxMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] digit = input.nextLine().split(" ");
        int max=0;

        for (int i = 0; i <digit.length ; i++) {

            for (int j = digit.length-1; j >i ; j--) {
                int c=0;
                if(digit[i].equals(digit[j])){
                    for (int kl=j, kf = i; kl>kf && kf<kl;  kf++, kl--) {
                        //System.out.println(i+" "+kl+" "+kf);
                        if(digit[kf].equals(digit[kl]))
                            c++;}
                    }if (max<c) max=c;
            }
        }
        System.out.println(max);
    }
}
