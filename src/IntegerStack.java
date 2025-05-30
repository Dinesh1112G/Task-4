import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {

    // Stack to store integers
    Stack<Integer> stack = new Stack<>();

    // Method to push element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    // Method to pop element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
        } else {
            int popped = stack.pop();
            System.out.println("Popped: " + popped);
        }
    }

    // Method to check if stack is empty
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is NOT empty.");
        }
    }

    // Main method
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    int num = scanner.nextInt();
                    s.pushElement(num);
                    break;
                case 2:
                    s.popElement();
                    break;
                case 3:
                    s.checkIfEmpty();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

/* sample output:
1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Exit
Choose option: 1
Enter number to push: 20
Pushed: 20

1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Exit
Choose option: 2
Popped: 20

1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Exit
Choose option: 3
Stack is empty.

1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Exit
Choose option: 4
Exiting...
 */