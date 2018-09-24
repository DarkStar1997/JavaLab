import java.util.Scanner;

class Stack {
    Node top;

    Stack() {
        top = null;
    }

    Stack(Stack copy) {
        if (copy.top == null)
            top = null;
        else {
            top = new Node(copy.top.elm);
            Node tempc = copy.top, temp = top;
            while (tempc.next != null) {
                tempc = tempc.next;
                temp.next = new Node(tempc.elm);
                temp = temp.next;
            }
        }
    }

    void push(int elm) {
        top = new Node(elm, top);
    }

    void pop() {
        if (top == null)
            return;
        else
            top = top.next;
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

    void sort() {
        if (top == null) {
            System.out.println("Nothing to sort!");
            return;
        }
        Stack temp = new Stack(), copy = new Stack(this);
        top = new Node(copy.top.elm);
        Node temp_n = copy.top;
        while (temp_n.next != null) {
            temp_n = temp_n.next;
            while (top.elm < temp_n.elm) {
                temp.push(top.elm);
                this.pop();
                if (top == null)
                    break;
            }
            this.push(temp_n.elm);
            while (temp.top != null) {
                this.push(temp.top.elm);
                temp.pop();
            }
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
        System.out.print("Enter the size of stack: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in the stack: ");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }
        System.out.print("\nBefore sorting:\n\t");
        st.display();
        st.sort();
        System.out.print("\nAfter sorting:\n\t");
        st.display();
        sc.close();
    }
}