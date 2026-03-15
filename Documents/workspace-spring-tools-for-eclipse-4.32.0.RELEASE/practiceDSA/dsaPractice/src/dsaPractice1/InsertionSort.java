package dsaPractice1;

public class InsertionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // moves to next line
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 99, 8, 11, 0, 16, 3};

        // insertion sort logic
        for (int i = 1; i < arr.length; i++) { // start from index 1
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j]; // shift elements
                j--;
            }
            arr[j + 1] = current; // place current element at right position
        }

        // print sorted array
        printArray(arr);
    }
}
