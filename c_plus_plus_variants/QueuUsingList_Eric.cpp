// ConsoleApplication1.cpp : This file contains the 'main' function. Program execution begins and ends there.
// Credit to Eric '.'

#include <iostream>

class Node {
public:
    int data;
    Node* next;
};

class QueueUsingLists {

    int size;
    Node* front;
    Node* back;

public:
    QueueUsingLists() {
        size = 0;
    }

    void insert(int a) {
        if (size == 0) {
            Node* aNewNode = new Node();
            aNewNode->data = a;
            aNewNode->next = nullptr;
            front = aNewNode;
            back = aNewNode;
        }
        else { // insert at the back
         // 1 - create a new node
            Node* aNewNode = new Node();
            aNewNode->data = a;
            aNewNode->next = nullptr;
            // 2 - Link the queue node to this new node
            back->next = aNewNode;
            // 3 - move the back now to the newly added node
            back = back->next;
        }
        size++;

    }

    int remove() {
        int result = front->data;
        Node* temp = front;
        // one step: moving the front
        front = front->next;
        delete temp;
        size--;
        return result;
    }

    int peek() {
        return front->data;
    }

};

int main()
{
    QueueUsingLists aQueuelist;
    aQueuelist.insert(6);
    aQueuelist.insert(4);
    aQueuelist.insert(7);
    aQueuelist.insert(3);
    aQueuelist.remove();
    aQueuelist.remove();
    aQueuelist.insert(9);
    aQueuelist.insert(5);
    // some debugging 
    std::cout << aQueuelist.peek();
}