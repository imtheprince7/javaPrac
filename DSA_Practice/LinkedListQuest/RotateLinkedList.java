public class RotateLinkedList {
    public static void main(String[] args) {
        // Logic to rotate Linked List:

        vector<int> aux; int n=0;
        Node* temp = head;
        while(temp!=nullptr){
            aux.push_back(temp->data);
            temp = temp->next;
            n++;
        }temp = head;
        reverse(aux.begin(), aux.begin()+(k%n));
        reverse(aux.begin()+(k%n),aux.end());
        reverse(aux.begin(),aux.end());
        
        for(int i=0; i<aux.size(); i++){
            temp->data = aux[i];
            temp = temp->next;
        }
        return head;
    }
}
