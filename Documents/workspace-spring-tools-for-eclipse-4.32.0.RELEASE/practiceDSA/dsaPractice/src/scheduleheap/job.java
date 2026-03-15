package scheduleheap;

import job.Job;

class MinHeap {
    private Job[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new Job[capacity];
        size = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        Job temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(Job job) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }

        heap[size] = job;
        int current = size;
        size++;

        while (current != 0 && heap[parent(current)].priority > heap[current].priority) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

  
    public Job extractMin() {
        if (size == 0) {
            return null;
        }

        Job root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapify(0);
        return root;
    }

    
    private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left].priority < heap[smallest].priority) {
            smallest = left;
        }

        if (right < size && heap[right].priority < heap[smallest].priority) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public Job peek() {
        if (size == 0) {
            return null;
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}