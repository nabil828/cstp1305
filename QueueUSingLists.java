class QueueNode{
    int data;
    QueueNode next;
}

public class QueueUSingLists {

    int size;
    QueueNode front;
    QueueNode back;

    QueueUSingLists(){
        size = 0;
    }

    void insert(int a){
        if(size == 0){
            QueueNode aNewNode = new QueueNode();
            aNewNode.data = a;
            aNewNode.next = null;
            front = aNewNode;
            back = aNewNode;

        }else{ // insert at the back
            // 1 - create a new node
            QueueNode aNewNode = new QueueNode();
            aNewNode.data = a;
            aNewNode.next = null;
            // 2 - link the queue nodes to this new node
            back.next = aNewNode;
            // 3 - move the back now to the newly added node
            back = back.next;

        }
        size++;
    }


    int remove(){
        int result = front.data;
        // we have to do soemthing
        // one step: moving the front
        // how? :)
        front = front.next; // Thank you Eric
        size --;
        return result;
    }


    int peek(){
        int result = front.data;
        return result;
    }
}


// Driver code
//class Main {
//    public static void main(String args[])
//    {
//        QueueUSingLists aQueue = new QueueUSingLists();
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
