#include<bits/stdc++.h>
using namespace std;

class Node{
    public:
     int data;
     Node *next, *prev;

     Node(int value){
        data = value;
        prev = next = nullptr;
     }
};

class DoublyLL{
private:
    Node *head;
    int totalNodes;

public:
    DoublyLL(){ 
        head =  nullptr;
        totalNodes = 0;
    }

    void insertAtBegin(int );
    void insertAtPosition(int , int);
    void insertAtEnd(int);

    void countNodes();
    void displayDLL();

    void deleteAtBegin();
    void deleteAtPosition(int);
    void deleteAtEnd();

};


  void DoublyLL :: insertAtBegin(int value){
        Node *newNode = new Node(value);
    // Base case:
        if( head == nullptr){
            head = newNode;
        }
        else{
            newNode->next = head;
            head->prev = newNode;
            head = newNode;
        }
        totalNodes++;
    }


    void DoublyLL :: insertAtPosition(int value, int position){
    // Base case:
     if (position < 1 || position > totalNodes + 1) {
        cout << "Invalid position!" << endl;
        return;
    }
     Node *newNode = new Node(value);
     if(position == 1){
        insertAtBegin(value);
        return ;
     }

     // Insert at the end
     if (position == totalNodes+1){
            insertAtEnd(value);
            return ;
     }
    // Insert At Specific Position:

        Node* temp = head;
        for (int i = 1; i < position - 1; i++) {
                   temp = temp->next;
        }
        newNode->next = temp->next;
        newNode->prev = temp;
        temp->next->prev = newNode;
        temp->next = newNode;
        totalNodes++;

    }

    void DoublyLL :: insertAtEnd(int value){
        Node *newNode = new Node(value);
    // Base case:
        if( head == nullptr){
            head = newNode;
            totalNodes++;  
            return;
        }
    Node *temp = head;
        while(temp->next != nullptr){
            temp= temp->next;
        }
         temp->next = newNode;
         newNode->prev = temp;
         totalNodes++;   // increment the node after inserting at end of the node.
   }


void DoublyLL :: deleteAtBegin(){
    Node *temp = head;
    
    if (head == nullptr) {
        cout << "List is empty. Cannot delete." << endl;
        return;
    }
    // If there's only one node
    if (head->next == nullptr) {
        head = nullptr;
    } 
    else {
            head = head->next;
            head->prev = nullptr;
            return ;
    }
            delete temp;
            totalNodes--;
}


void DoublyLL :: deleteAtPosition(int position){
     Node *temp = head;
    
    if (head == nullptr) {
        cout << "List is empty. Cannot delete." << endl;
        return;
    }

    // when position ==1 is head itself
    if(position == 1){
        head = head->next;
        if (head != nullptr) {
            head->prev = nullptr; 
        }
        delete temp;
        totalNodes--;
        return;
    }

    for(int i=1; i<position; i++){
        temp = temp->next;
    }
    // Updating pointer here
    if (temp->next != nullptr) {
        temp->next->prev = temp->prev;
    }
    temp->prev->next = temp->next;

    delete temp;
    totalNodes--;
}



void DoublyLL :: deleteAtEnd(){ 
    Node *temp = head;
    
    if (head == nullptr) {
        cout << "List is empty. Cannot delete." << endl;
        return;
    }
    // If there is only-one node in the list
    if(head->next == nullptr){
        head = nullptr;
        delete temp;
        totalNodes--;
        return;
    }

    while(temp->next !=nullptr){
        temp = temp->next;
    }
        temp->prev->next = nullptr;
        delete temp;

        totalNodes--;    
}

 void DoublyLL :: countNodes(){
        cout<<"Total number of nodes in the list are:"<<" "<<totalNodes <<endl; 

 }

 void DoublyLL :: displayDLL(){
    if(head == nullptr){
        cout<<"Node list is empty:" <<endl;
    }
    else{
        Node *temp = head;
        while(temp !=nullptr){
            cout<<temp->data <<" ";
            temp = temp->next;
        }
        cout<<endl;
    }
 }
int main(){
    DoublyLL doublyll;
// Insert at Begin:
    doublyll.insertAtBegin(15);
    doublyll.insertAtBegin(13);
    doublyll.insertAtBegin(11);
    doublyll.insertAtBegin(9);
    doublyll.insertAtBegin(7);
doublyll.displayDLL();
    doublyll.countNodes();

// Insert at End:
    doublyll.insertAtEnd(17);
    doublyll.insertAtEnd(19);
    doublyll.insertAtEnd(21);
doublyll.displayDLL();
    doublyll.countNodes();


// Insert at Specifivc Position:
    doublyll.insertAtPosition(12,4);
doublyll.displayDLL();
    doublyll.countNodes();



// Delete Operations:

// Delete at Begin:
    doublyll.deleteAtBegin();
doublyll.displayDLL();

// Delete at Specific Position:
    doublyll.deleteAtPosition();
doublyll.displayDLL();


// Delete at End:
    doublyll.deleteAtEnd();
doublyll.displayDLL();

    return 0;
}
