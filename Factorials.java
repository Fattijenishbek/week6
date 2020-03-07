package week6;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter an integer number:");
        int a = input.nextInt();

        System.out.printf("%s%6s%n", "X","X!");
        if (a==0)
            System.out.println(0+"    "+1);
        else{
        int s=1;
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=i; j++) {
                s=s*j;}
            System.out.println(i+"    "+s);
            s=1;
        }}

    }
}
