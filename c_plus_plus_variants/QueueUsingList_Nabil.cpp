#include <iostream> 
using namespace std;



class Node {
public:
    int data;
    Node* next;
};


class myQueue {
public:
    Node* front;
    Node* back;
    int size;
    myQueue() {
        size = 0;
    }

    void insert(int a) {
        if(size == 0) {//this is the first element in the stack
            front = new Node();
            front ->data = a;
            front ->next = NULL; // this important to indicate the end of this list
            back = front;
        }
        else { // this is a non empty list
            Node* tmp = new Node();
            tmp->data = a;
            tmp->next = NULL;
            back->next = tmp;
            back = tmp;
        }
        size++;
    }
    int remove() {
        int tmp = front->data;
        Node* toBeDeleted = front;
        
        // also need to move the front
        front = front->next;
        delete(toBeDeleted); // just garbage collection
        return tmp;
    }
    int peek() {
        int tmp = front->data;
        return tmp;
    }

};


int main() {
    cout << "Hi" << endl;
    myQueue aQueue;
    aQueue.insert(6);
    aQueue.insert(4);
    aQueue.insert(7);
    aQueue.insert(3);
    aQueue.remove();
    aQueue.remove();
    aQueue.insert(9);
    aQueue.insert(5);
    cout << "The front of the queue at this point should be seven: " << aQueue.peek() << endl;
    

    return 0;


}
