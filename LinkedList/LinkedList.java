package LinkedList;
import java.util.Scanner;
public class LinkedList {
    class Node {
        int data; 
        Node next;
         Node(int data){
            this.data = data;
            this.next = null; 
         }
    }
    Node head = null;

    public static void insertNode(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Element to insert into Node");
        int data = sc.nextInt();
        

    }
    public static void printNode(){
        Node temp =null;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Option to Perform Linked List Operation:");
        System.out.print("1. InsertNode 2. PrintNode:\t ");
        int opt = sc.nextInt();
        switch(opt)
        {
            case 1:
            insertNode();
            break;
            case 2:
            printNode();
            break;

        }
        sc.close();
    }
}
