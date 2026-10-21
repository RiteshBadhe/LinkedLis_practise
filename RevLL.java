import java.util.LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }

 class RevLL {
    public void intsert(int value){
    Node newNode = new Node(10);
            Node head;
            if(head == null){
                head = newNode;
                return;
            }
            Node temp= head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public static void main(String[] args) {
        
    }
}
