#include <iostream>
using namespace std;

/* How to compile C++ File:
    g++ filename.cpp  -o ( output_file_name)
 
 */

class Node {
public:
    int data;
    Node *next;

    Node(int value) {
        data = value;
        next = nullptr;
    }
};

class LinkedList {
private:
    Node *head ,*mover;

public:
    LinkedList() {
        head = nullptr;
        mover = nullptr;
    }

    void createNode(int);  
    void maekOddEvenList();
    void displayNode();
 };
 void LinkedList :: createNode(int value) {
        Node *newNode = new Node(value);

        if (head == nullptr) {
            head = newNode;
            mover = head;
        } else {
            mover->next = newNode;
            mover = newNode;
        }
 }

 void LinkedList :: maekOddEvenList(){
    if (head == nullptr) {
        cout << "Node-List is empty." << endl;
        return;
    }

    Node *odd = head;           
    Node *even = head->next;    
    Node *evenHead = even;

    while (even != nullptr && even->next != nullptr) {
        odd->next = even->next; // Link odd nodes
        odd = odd->next;

        even->next = odd->next; // Link even nodes
        even = even->next;
    }
    odd->next = evenHead; 
    }


 void LinkedList :: displayNode() {
        if (head == nullptr) {
            cout << "Node-List is empty." << endl;
        } else {
            Node *temp = head;
            while (temp != nullptr) {
                cout << temp->data << " ";
                temp = temp->next;
            }
            cout << endl;
        }
}

int main() {
    LinkedList list;
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    for (int i = 0; i < 7; i++) {
        list.createNode(arr[i]);
    }
    list.displayNode();   
    cout<<endl;
    list.maekOddEvenList();
    list.displayNode();
    
    


    return 0;
}
