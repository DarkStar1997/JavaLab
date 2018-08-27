import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int n, Node ptr)
    {
        data = n;
        next = ptr;
    }
}
class List
{
    Node head;
    void insert(int n, int pos)
    {
        if(head == null)
        {
            head = new Node(n, null);
        }
        else
        {
            if(pos==1)
            {
                Node tmp = new Node(n, head);
                head = tmp;
            }
            else
            {
                int i = 1;
                Node tmp;
                for(tmp = head; i < pos - 1; i++, tmp = tmp.next);
                if(tmp.next == null)
                {
                    Node tmp1 = new Node(n, null);
                    tmp.next = tmp1;
                }
                else
                {
                    Node tmp1 = new Node(n, tmp.next);
                    tmp.next = tmp1;
                }
            }
        }
    }
    void delete(int pos)
    {
        if(head == null)
            return;
        if(pos == 1)
        {
            Node tmp = head;
            head = head.next;
            tmp = null;
        }
        else
        {
            Node tmp; int i = 1;
            for(tmp = head; i < pos - 1; i++, tmp = tmp.next);
            if(tmp.next.next == null)
                tmp.next = null;
            else
            {
                Node tmp1 = tmp.next;
                tmp.next = tmp.next.next;
                tmp1 = null;
            }
        }
    }
    void display()
    {
        System.out.print("Current list: ");
        Node tmp = head;
        while(tmp != null)
        {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List obj = new List();
        int ch;
        do{
            System.out.println("1-Insert\n2-Delete\n3-Display\n4-Exit");
            System.out.println("Input choice (1/2/3/4)");
            int pos, val;
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Enter position and value");
                        pos = sc.nextInt();
                        val = sc.nextInt();
                        obj.insert(val, pos);
                        break;
                case 2: System.out.println("Enter position of deletion");
                        pos = sc.nextInt();
                        obj.delete(pos);
                        break;
                case 3: obj.display();
                        break;
                case 4: break;
            }
        }while(ch!=4);
        obj.display();
    }
}
