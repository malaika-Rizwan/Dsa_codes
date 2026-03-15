package infix_postfix;

import java.util.Scanner;
import java.util.Stack;

public class infixtopostfix {

    // Return precedence of operators
    public static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
        }
        return -1;
    }

    // Convert infix to postfix
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Skip spaces
            if (ch == ' ')
                continue;

            // Operand → directly append
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            // '(' → push
            else if (ch == '(') {
                stack.push(ch);
            }
            // ')' → pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // Operator
            else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // pop remaining operators
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Evaluate postfix expression
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // Operand (digit)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');   // convert char to int
            }
            else {
                // Pop two operands
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                    case '^': stack.push((int)Math.pow(a, b)); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Convert Infix to Postfix");
            System.out.println("2. Evaluate Postfix Expression");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Infix Expression: ");
                    String infix = sc.nextLine();
                    String postfix = infixToPostfix(infix);
                    System.out.println("Postfix: " + postfix);
                    break;

                case 2:
                    System.out.print("Enter Postfix Expression: ");
                    String post = sc.nextLine();
                    int result = evaluatePostfix(post);
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
    }
}
