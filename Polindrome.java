package week6;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long a = input.nextLong();
        long check =1;
        int c =0;
        while (a%check!=a){
            check*=10;
            c++;
        }
        long n =10L;
        long nr=1L;
        long sum=0L;
        while (c>0){
            sum += (long) (((a%n)/nr)*Math.pow(10,c-1));
            c--;
            n*=10;
            nr*=10;
        }
        if (sum==a)
            System.out.println("This number is a palindrome");
        else System.out.println("This number is not a palindrome");
    }
}