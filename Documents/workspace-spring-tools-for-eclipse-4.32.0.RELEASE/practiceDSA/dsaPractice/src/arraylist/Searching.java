package arraylist;

import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[20];

     
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number to store in array: ");
            arr[i] = s.nextInt();
        }

       
        System.out.print("Enter number you want to search: ");
        int value = s.nextInt();

        boolean found = false; 

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(value + " found at index " + i);
                found = true;
                break;
            }
        }

     
        if (!found) {
            System.out.println("Value not found in the array.");
        }

        s.close();
    }
}
