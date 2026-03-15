package ArrayPractice;


class DynamicArray {
    private int[] arr;       // underlying array
    private int size;        // number of elements currently in the array
    private int capacity;    // total capacity of the array

    // Constructor — initializes array with default size 2
    public DynamicArray() {
        capacity = 2;
        arr = new int[capacity];
        size = 0;
    }

    // Method to insert value at the end
    public void insertAtEnd(int value) {
        if (size == capacity) {
            resize(capacity * 2); // Double the capacity if full
        }
        arr[size] = value;
        size++;
    }

    // Method to insert value at the start
    public void insertAtStart(int value) {
        if (size == capacity) {
            resize(capacity * 2);
        }
        // Shift all elements right by 1
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
        size++;
    }

    // Method to insert value at a particular index
    public void insertAtIndex(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (size == capacity) {
            resize(capacity * 2);
        }
        // Shift elements to the right
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
    }

    // Method to delete value by index
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        // Shrink array if necessary (when 1/4 full)
        if (size > 0 && size <= capacity / 4) {
            resize(capacity / 2);
        }
    }

    // Method to view all elements
    public void viewElements() {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("(Size = " + size + ", Capacity = " + capacity + ")");
    }

    // Helper method to resize the array
    private void resize(int newCapacity) {
        int[] newArr = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity = newCapacity;
    }



    }
