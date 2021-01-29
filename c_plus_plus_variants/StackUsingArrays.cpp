#include <iostream> 
using namespace std; 

class myStack { // this is our ADT + CDT(Arrays)
private:
    int arr[10]; // a private data member
    int top = -1; // to point at the top of the stack
public:
    void push(int a) { // a public member function
        top++; // -1 + 1
        arr[top] = a;
    }
    int pop() { // a public member function
        int tmp = arr[top];
        top--;
        return tmp;
    }
    int peek() { // a public member function
        return arr[top];
    }

    void test() {
        arr[133] = 34;
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
    aStack.test();

    return 0;
}