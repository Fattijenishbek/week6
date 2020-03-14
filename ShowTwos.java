package week6;

import java.util.Scanner;

public class ShowTwos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print(num+" = ");
        int c=0;
        while (num % 2 == 0) {
            num = num/2;
            c++;
            ;
        }
        for (int i = 0; i < c; i++) {
            System.out.print("2 * ");
        }
        System.out.print(num);
    }
}
