package week6;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int a = input.nextInt();
        for (int i =1; i <=a ; i++) {
            for (int j = a-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}


