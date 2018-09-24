import java.util.Scanner;

class Stack {
    Node top;

    Stack() {
        Node top = null;
    }

    void push(int elm) {
        top = new Node(elm, top);
        System.out.println("\tPushed");
    }

    void pop() {
        if (top == null)
            System.out.println("Nothing to delete!");
        else {
            top = top.next;
            System.out.println("\tPopped");
        }
    }

    void display() {
        if (top == null)
            System.out.println("Nothing to display!");
        else {
            Node temp = top;
            System.out.print("The elements in the Stack: ");
            while (temp != null) {
                System.out.print(temp.elm + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

class Node {
    int elm;
    Node next;

    Node(int newElm) {
        elm = newElm;
        next = null;
    }

    Node(int newElm, Node nxt) {
        elm = newElm;
        next = nxt;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        int flag;
        System.out.println("Enter\n 1:Push\n 2:Pop\n 3:Display\n 4:Exit");
        do {
            System.out.print("Enter the command: ");
            flag = sc.nextInt();
            switch (flag) {
            case 1:
                System.out.print("Enter the element: ");
                st.push(sc.nextInt());
                break;
            case 2:
                st.pop();
                break;
            case 3:
                st.display();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid input!");
            }
        } while (flag != 4);
        System.out.println("Bye!");
    }
}