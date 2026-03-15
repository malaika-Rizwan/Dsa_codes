package dsaPractice1;

public class BubbleSort {

    // method to print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 8, 11, 0, 16, 3};

        // optimized bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // track swaps
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // array already sorted → stop early
        }

        printArray(arr);
    }
}
