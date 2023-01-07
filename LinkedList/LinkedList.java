package LinkedList;

import java.util.Scanner;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void insertAtBegin() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Element to insert into Node");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Do you Wanna Continue: Press  1 or Press ANY_KEY");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }

    public void printNode() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtBegin();
        ll.printNode(); 
    }
}
