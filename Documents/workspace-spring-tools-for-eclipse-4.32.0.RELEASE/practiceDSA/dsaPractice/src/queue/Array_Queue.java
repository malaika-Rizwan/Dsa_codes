package queue;

class Array_Queue {
    int size;
    int front, rear;
    int[] arr;

    Array_Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        arr[++rear] = data;
    }

    // Dequeue
    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }

    // Peek
    int peek() {
        if (front == -1) return -1;
        return arr[front];
    }
}
