import java.awt.desktop.ScreenSleepEvent;

class singlylinked{
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = next;

        }
    }
    public Node head =null;
    public Node tail = null;


    public void insertnew(int data)
    {
        Node current =head;
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            tail.next = newnode;
            tail = newnode;

        }

    }
    public int countnode()
    {
        int count =0;
        Node current = head;
        while(current !=null) {
            count++;

            current = current.next;
        }
        return count;
    }
    public void reverse(Node current)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        else
        {
            if(current.next ==null)
            {
                System.out.println(current.data+"");
                return;

            }
            reverse(current.next);
            System.out.println(current.data+"");
        }
    }
    public void display()
    {
        Node current = head;
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        System.out.println(" linked list is");

            while(current!=null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        System.out.println();

    }
    public static void main(String[] args)
    {
        singlylinked obj = new singlylinked();
        obj.insertnew(10);
        obj.insertnew(20);
        obj.insertnew(30);
        obj.insertnew(40);
        obj.insertnew(50);
        obj.insertnew(60);
        obj.display();
        System.out.println("reverse linked list is");
        obj.reverse(obj.head);


        System.out.println("number of nodes in list is"+ obj.countnode());
    }

}
