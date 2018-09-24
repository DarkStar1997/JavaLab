import java.util.Scanner;

abstract class DataHolder {
    final int MAX = 100;
    int arr[] = new int[MAX];
    int front = -1, rear = -1;

    abstract void insert(int newElm);

    abstract void del();

    abstract void display();
}

class Stack extends DataHolder {
    void insert(int newElm) {
        if (rear >= MAX - 1) {
            System.out.println("Stack Overflow!");
        } else {
            arr[++rear] = newElm;
            System.out.println("\tInserted");
        }
    }

    void del() {
        if (rear < 0) {
            System.out.println("Stack Underflow!");
        } else {
            rear--;
            System.out.println("\tDeleted");
        }
    }

    void display() {
        if (rear == -1)
            System.out.println("Nothing to display!");
        else {
            System.out.print("The Element(s) are: ");
            for (int i = 0; i <= rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

class Queue extends DataHolder {
    void insert(int newElm) {
        if (rear == -1) {
            front++;
            arr[++rear] = newElm;
            System.out.println("\tInserted");
        } else if (rear < MAX - 1) {
            arr[++rear] = newElm;
            System.out.println("\tInserted");
        } else {
            System.out.println("No more space!");
        }
    }

    void del() {
        if (rear == -1) {
            System.out.println("Nothing to delete!");
        } else {
            front++;
            if (front > rear) {
                rear = front = -1;
            }
            System.out.println("\tDeleted");
        }
    }

    void display() {
        if (rear == -1)
            System.out.println("Nothing to display!");
        else {
            System.out.print("The Element(s) are: ");
            for (int i = front; i <= rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1-> for Stack 2-> for Queue: ");
        int ch = sc.nextInt();
        if (ch == 1) {
            Stack st = new Stack();
            int flag;
            System.out.println("Stack created.\nEnter\n1:Insert\n2:Delete\n3:Display\n4:Exit");
            do {
                System.out.print("Enter the command: ");
                flag = sc.nextInt();
                switch (flag) {
                case 1:
                    System.out.print("Enter the element: ");
                    st.insert(sc.nextInt());
                    break;
                case 2:
                    st.del();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid input!");
                }
            } while (flag != 4);
            System.out.println("Bye!");
        } else if (ch == 2) {
            Queue st = new Queue();
            int flag;
            System.out.println("Queue created.\nEnter\n1:Insert\n2:Delete\n 3:Display\n 4:Exit");
            do {
                System.out.print("Enter the command: ");
                flag = sc.nextInt();
                switch (flag) {
                case 1:
                    System.out.print("Enter the element: ");
                    st.insert(sc.nextInt());
                    break;
                case 2:
                    st.del();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("invalid input!");
                }
            } while (flag != 4);
            System.out.println("Bye!");
        }
    }
}