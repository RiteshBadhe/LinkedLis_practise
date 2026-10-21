
public class NewLL {

    static class Node{
        int data; 
        
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    Node head;
    public void show(){
        Node temp = head;
         while(temp!=null){
            System.out.print(temp.data + " -> ");
        temp= temp.next;
    }
}
    public void Insert(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void dlt(){
        if(head == null){
            return ;
        }
        head = head.next;
    }
    public void AddAtEnd(int value){
        Node temp = head;
        Node newNode = new Node(value);
        while(temp.next!=null){
            temp = temp.next;
            
        }
        temp.next = newNode;
    }
    public void dltAtEnd(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void InAtSomewhere(int value){
        Node temp = head;
        Node newNode = new Node(value);

        while(temp.next.data<value){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public static void main(String[] args) {
        NewLL ll = new NewLL();
        Node head = new Node(10);
        Node sec = new Node(20);
        Node third = new Node(30);

        ll.head = sec;
        sec.next = third;
        third.next = null;
        ll.Insert(5);
        ll.show();
        System.out.println();
        ll.dlt();
        ll.show();
        System.out.println();
        ll.AddAtEnd(40);
        ll.show();
        ll.dltAtEnd();
        System.out.println();

        ll.show();
        System.out.println();
        ll.InAtSomewhere(25);
        ll.show();


    }
}
