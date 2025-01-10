#include <iostream>
using namespace std;

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
    Node *head;
    Node *mover;

public:
    LinkedList() {
        head = nullptr;
        mover = nullptr;
    }

    void createNode(int value) {
        Node *newNode = new Node(value);

        if (head == nullptr) {
            head = newNode;
            mover = head;
        } else {
            mover->next = newNode;
            mover = newNode;
        }
    }

    void deleteAtBegin() {
        if (head == nullptr) {
            cout << "Link-List is empty" << endl;
            return;
        }
        Node *ptr = head;
        head = head->next;
        delete ptr;

        if (head == nullptr) { // If list becomes empty
            mover = nullptr;
        }
    }

    void deleteAtEnd() {
        if (head == nullptr) {
            cout << "Link-List is empty" << endl;
            return;
        }

        if (head->next == nullptr) { // Single node in LinkedList
            delete head;
            head = mover = nullptr;
            return;
        }

        Node *ptr = head;
        Node *backk = nullptr;
        while (ptr->next != nullptr) {
            backk = ptr;
            ptr = ptr->next;
        }
        backk->next = nullptr;
        delete ptr;

        mover = backk; // Updating the mover pointer afte deleting the last node in list.
    }

    void displayNode() {
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


    // Operationss;;;;;;;;;;;;;;;;
    void findPosition( int value){
        if(head == nullptr)
    }






};

int main() {
    LinkedList list;

    int arr[] = {1, 3, 5, 7, 9, 11};
    for (int i = 0; i < 6; i++) {
        list.createNode(arr[i]);
    }

    cout << "Node-List: ";
    list.displayNode();

    list.createNode(13); // Adding to the end
    list.displayNode();

    // Delete Operations:
    list.deleteAtBegin();
    cout << "After deleting at the beginning: ";
    list.displayNode();

    cout << "After deleting at the end: ";
    list.deleteAtEnd();
    list.displayNode();



    //Operations:

    // Search for a value
    list.findPosition(11);

    return 0;
}
