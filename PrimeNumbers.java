package week6;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int a = input.nextInt();

        for (int i = 1; i <=a ; i++) {
            int c = 0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0) c++;
            }
            if (c==2) arr.add(i);
        }
        for (int i = 0; i <arr.size(); i++) {
        System.out.print(arr.get(i)+" ");}
    }
}
