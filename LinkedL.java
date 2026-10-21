 class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next = null;
    }
}

public class LinkedL{
    Node head;

    void dlt_a_Node(int value){
        Node temp = head;

        if(head.data == value){
            head.data = 0 ;
            head.next = null;
        }
        while(temp.next.data != value){
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }
    void dlt_At_Position( int pos){
        int cnt=0;
        Node temp = head;
        if(head == null || pos <1){
            return;
        }
        while(temp.next != null && cnt == pos-1){
            temp= temp.next;
            cnt++;
        }
        temp.next = temp.next.next;

    }

    void insert_At_End(int value){
        Node newNode  = new Node(value);
        Node temp;
        if(head == null){
            head = newNode;
            return;
        }
        temp= head;
        while(temp.next != null){
            temp = temp.next;
            //System.out.println(temp.data); 
        }
        temp.next = newNode;
    }

    void Insert_at_Start(int value){
        Node newNode = new Node(value);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void show(){
        Node temp = head;
        if(temp == null){
            System.out.println("Linked list is empty");
        }
        while(temp!= null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedL l1 = new LinkedL();

        l1.insert_At_End(10);
        l1.insert_At_End(20);
        l1.Insert_at_Start(40);
      //  l1.dlt_a_Node(20);
        l1.dlt_At_Position(3);
        l1.show();
       
    }
    
}