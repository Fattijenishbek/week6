package week6;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeroEnd {
    public static void main(String[] args) {
        ArrayList<String> arr1= new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String [] dig = input.nextLine().trim().split(" ");
        try{
            for (String digit : dig){
                if (Integer.parseInt(digit)==0) arr1.add(digit);
                else arr2.add(digit);
            }
            for (int i = 0; i <arr2.size() ; i++) {
                System.out.print(arr2.get(i)+" ");
            }
            for (int j = 0; j < arr1.size(); j++) {
                if (j==arr1.size()-1)
                    System.out.print(arr1.get(j));
                else System.out.print(arr1.get(j)+" ");
            }

        } catch (Exception e){
            System.out.println(" Input error");
        }


    }
}

