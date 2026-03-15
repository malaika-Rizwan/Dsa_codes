package dsaPractice1;

public class SelectionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // moves to next line
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 1, 8, 11, 0, 16, 3};

        // selection sort logic
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            // find index of smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            // swap smallest with current element
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // print sorted array
        printArray(arr);
    }
}
