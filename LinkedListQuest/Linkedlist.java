
public class Linkedlist {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    Node head = null,tail= null;
    Scanner sc = new Scanner(System.in);
   
   public void insertAtBegin(int val){
       Node node = new Node(val);
         if(head==null){
            head = tail= node;
        }
        else{
                node.next= head;
                head = node;
             }
    }

    public void insertMiddle(int val, int pos){
        int count=1;
         Node node = new Node(val);
         if(head == null){
             insertAtBegin(val);
             return;
         }
         else{
              Node temp = head;
             while(count < pos-1){
                  count++;
                  temp = temp.next;
             }
             node.next = temp.next;
             temp.next = node;
         }
     }

    public void insertAtLast(int val){
        Node node = new Node(val);
        if(head==null){
         insertAtBegin(val);
         return;
        }
        else{
                tail.next = node;
                tail = node;
            }
    }
    
   public void removeDuplicate(){
        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
   }

    public void printNode(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
}

// Insert at Particular position BY RECURSION
    public void insertRec(int val, int pos){
        head = insertAtPosByRecursion(val, pos, head);
    }

    public Node insertAtPosByRecursion(int val, int pos, Node node){
        if(pos==1){
            Node temp = new Node(val, node);
            return temp;
        }
        node.next = insertAtPosByRecursion(val, pos--, node.next);
        return node;

    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        // ll.insertAtBegin(12);
        // ll.insertAtBegin(24);
        // ll.insertAtBegin(36);
        // ll.insertAtBegin(48);
        // ll.insertAtLast(0);
        // ll.insertMiddle(30, 2);

        ll.insertAtLast(1);
        ll.insertAtLast(2);
        ll.insertAtLast(3);
        ll.insertAtLast(4);
        ll.insertAtLast(5);
        ll.insertAtLast(6);
        ll.printNode();
        ll.removeDuplicate();
        ll.printNode();
        ll.insertRec(88,3);
        ll.printNode();

    }
}
