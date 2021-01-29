#include <iostream> 
using namespace std; 

class Node {
    /*Node(int a, Node* p) {
        data = a;
        pointer = p;
    }*/
public:
    int data;
    Node* next;
};

class myStack { // this is our ADT + CDT(List)
private:
    Node *top;
    int size;
public:
    myStack() {
        size = 0;
    }
public:
    void push(int a) { // a public member function
        Node* newNode = new Node();
        if (size == 0) {
            newNode->next = NULL;
            newNode->data = a;
        }
        else {
            newNode->next = top;
            newNode->data = a;
        }
        size++;
        top = newNode;
    }
    int pop() { // a public member function
        int tmp = top->data;
        top = top->next;
        return tmp;
    }
    int peek() { // a public member function
        return top->data;
    }

};




int main() {
    cout << "Hi"<< endl;
    myStack aStack;
    aStack.push(6);
    aStack.push(7);
    aStack.push(1);
    aStack.push(5);
    aStack.pop();
    cout<<"The top of the stack at this point should be one: "<< aStack.peek()<<endl;
    

    return 0;
}