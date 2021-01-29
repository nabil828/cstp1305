class Node{
    int data;
    Node next;
    Node prev;
    Node(){
        next = null;
        prev = null;
    }
}
public class QueueUsingDoubleList {
    Node front;
    Node back;
    QueueUsingDoubleList(){
        front = null;
        back = null;
    }
    void insertAtFront(int a ) {
        Node aNewNode = new Node();
        aNewNode.data = a;
        if(back == null) // the queue is empty
        {
            front = aNewNode;
            back = aNewNode;
        }else { // we have at least one ite
            aNewNode.next = front; // 1
            front.prev = aNewNode; // 2
            // 1 & 2 can interchange
            front = aNewNode; // 3

        }

    }
    void insertAtBack(int a ) {
        Node aNewNode = new Node();
        aNewNode.data = a;
        if(front == null) // the queue is empty
        {
            front = aNewNode;
            back = aNewNode;
        }else { // we have at least one ite
            aNewNode.prev = back; // 1
            back.next = aNewNode; // 2
            back = aNewNode; // 3

        }
    }

    int removeFromBack() {
        int tmp = back.data; // 1
        back = back.prev; // 2
        back.next = null; // 3
        return tmp;
    }


    int removeFromFront(int a ) {
        int tmp = front.data; // 1
        front = front.next; // 2
        front.prev = null; // 3
        return tmp;
    }
    int peekFromBack(){
        return back.data;
    }
    int peekFromFront(){
        return front.data;
    }
}


//class Main{
//    public static void main(String args[]){
//        QueueUsingDoubleList aQueue = new QueueUsingDoubleList();
////        aQueue.insertAtBack(10);
////        aQueue.insertAtBack(4);
////        aQueue.insertAtBack(2);
////        aQueue.insertAtBack(5);
////
////
//
//        aQueue.insertAtBack(2);
//        aQueue.insertAtBack(5);
//        aQueue.insertAtFront(4);
//        aQueue.insertAtFront(10);
//
//        aQueue.removeFromBack();
//        System.out.println(aQueue.peekFromBack()); // 2 the expected node
//
//    }
//}