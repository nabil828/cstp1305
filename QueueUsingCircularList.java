//class Node{
//    int data;
//    Node next;
//}

public class QueueUsingCircularList {
    Node front;
    Node back;

    QueueUsingCircularList(){
        front = null;
        back = null;
    }
    void insert(int a){
        // 1 - create a new node
        Node newNode= new Node();
        newNode.data = a;

        // 2- update the pointers
        if( front == null ) // whether the queue is empty or not
        {
            front = newNode;
            back = newNode;
            newNode.next = front;
        }else{ // this means that there is at least one node in the queue
            //insert at back
            back.next = newNode; // 1
            back = newNode; // 2
            newNode.next = front; //3
            // 2 and 3 order is not important
        }

        // Don't repeat your self (DRY)
    }
    int remove(){
        int tmp =-1;
        if( front == null ) // whether the queue is empty or not
        {
             //later - check exceptions
        }else { //there is at least one node
            tmp = front.data;
            if (front == back ){ //only one item
                front = null;
                back = null;
            }
            else { // more than one item
                 front = front.next; // 2
            }
        }

        return tmp; //3
    }
    int peek(){
        return front.data;
    }
}


// Driver code
//class Main {
//    public static void main(String args[])
//    {
//        // test case
//        QueueUsingCircularList aQueue = new QueueUsingCircularList();
//        aQueue.insert(6);
//        aQueue.insert(4);
//        aQueue.insert(7);
//
//        aQueue.insert(3);
//
//
//        aQueue.remove();
//        aQueue.remove();
//
//        aQueue.insert(9);
//        aQueue.insert(5);
//        // some debugging // front pointing to the seven and its value is 2
//        // Back is pointing to the five and its value is 0
//        System.out.println(aQueue.peek()); // Should be 7
//    }
//}