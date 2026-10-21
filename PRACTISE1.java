class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class PRACTISE1 {
    Node head;

    void Insert_at_Start(int data){
        Node temp = head;
        Node newNode = new Node(data);
        if(head == null  ){
            System.out.println("Linked List is empty...\n");
        }
        
        newNode.next = head;
        head = newNode;
        
    }

    void insert_At_End(int data){
        Node temp = head;
        Node newNode = new Node( data);
        if(head == null){
        System.out.println("Linked List is empty...\n");
        return ;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;

    }
    void dlt_AT_begin(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        /*
        head.next = null;
        head.data= 0;
        */
        head = head.next;
        
    }
    void dlt_at_end(){
        Node temp = head;

        if(head == null){
            System.out.println("Linked List is empty...\n");
            return ;
        }
        if(head.next == null){
            head = null;
            return;
        }

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }   


    void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        PRACTISE1 p = new PRACTISE1();

        p.Insert_at_Start(10);
        p.Insert_at_Start(20);
        p.insert_At_End(30);
      //  p.dlt_AT_begin();
        p.Display();
    }
    
}
