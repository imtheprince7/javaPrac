import java.util.Scanner;

public class DoublyLL{
  static class Node{
        int data; 
        Node next, prev;

        Node(int data){
            this.data= data;
            this.next =null;
            this.prev = null;
        }
    }
    Node head = null, tail = null;
 
  
    public void insertAtBegin(int data){
        
           Node newNode =  new Node(data);
            newNode.next = head;
            newNode.prev= null;

            if(head !=null){
                tail = head;
                head.prev = newNode;             
            }
            head = newNode;
        }

    public void printList(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("->END");
        System.out.println();
    }

    public void insertEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            insertAtBegin(val);
            return;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
           
        }
         newNode.prev =temp;
         temp.next = newNode;
    }

    public void insertMiddle(int val, int pos){
        int count=1;
        Node newNode = new Node(val);
        if(head == null){
            insertAtBegin(val);
            return;
        }
        Node temp = head;
        while(count != pos){
            temp = temp.next;
            count++;
        }
        newNode.prev = temp.prev;
        newNode.next= temp;
        temp.prev.next = newNode; 
    }

    public static void main(String[] args) {
        
        DoublyLL dl = new DoublyLL();
        dl.insertAtBegin(5);
        dl.insertAtBegin(7);
        dl.insertAtBegin(9);
        dl.insertAtBegin(11);
        dl.insertAtBegin(13);
        dl.insertAtBegin(15);
        dl.insertAtBegin(17);
        dl.printList();
      
       dl.insertEnd(3);
       dl.insertEnd(1);
       dl.insertEnd(0);
       dl.printList();

       dl.insertMiddle(14, 3);
       dl.printList(); 
       dl.insertMiddle(8, 7);
       dl.printList();
       
       

    }
}