package abdullahcodes;

public class Stack {
    int arr[] = new int[5];
    int top = -1;

    // push
    public void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    // pop
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // peek
    public int peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top];
    }

    // display
    public void display() {
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(5);
        s.push(10);
        s.push(15);
        s.pop();
        s.push(20);

        s.display();
    }
}