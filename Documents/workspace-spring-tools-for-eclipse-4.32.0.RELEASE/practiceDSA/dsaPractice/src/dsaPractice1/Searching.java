package dsaPractice1;

import java.util.Scanner;

public class Searching {
    int arr[] = new int[10];

    public void Search() {
        Scanner s = new Scanner(System.in);

        // take input in array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        // take value to search
        System.out.print("Enter a value to search: ");
        int search_value = s.nextInt();

        boolean isFound = false;

        // linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search_value) {
                System.out.println(search_value + " found at index " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Value not found.");
        }
    }

    public static void main(String[] args) {
        Searching sg = new Searching();
        sg.Search();
    }
}
