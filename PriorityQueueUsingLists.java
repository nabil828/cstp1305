class anotherQueueNode{
    int data;
    anotherQueueNode next;

}

public class PriorityQueueUsingLists {

    int size;
    anotherQueueNode first;

    PriorityQueueUsingLists(){
        size = 0;
    }

    void insert(int a){
        if(size == 0){
            anotherQueueNode aNewNode = new anotherQueueNode();
            aNewNode.data = a;
            aNewNode.next = null;
            first = aNewNode;
        }else{ // insert at the back
            // 1 - create a new node
            anotherQueueNode aNewNode = new anotherQueueNode();
            aNewNode.data = a;
            aNewNode.next = first;
            first = aNewNode;
        }
        size++;
    }


    int remove(){
        //iterate over the whole list to find the max
        anotherQueueNode iterator= first;
        int max = Integer.MIN_VALUE; // this is the very miminm
        anotherQueueNode prev = iterator;
        anotherQueueNode theNodeBefore = iterator;
        anotherQueueNode theMaxnode = iterator;
        while(iterator != null){

            if (iterator.data > max) {
                max = iterator.data;

                //we also need to flag the prev node
                theNodeBefore = prev;
                theMaxnode = iterator;
            }
            prev = iterator;
            iterator = iterator.next;
        }

        //delete the node - TODO
        theNodeBefore.next = theMaxnode.next;

        //return the max
        return max;
    }

    int peek(){ //TODO we need to return the hight priority
        int result = first.data;
        return result;
    }
}


// Driver code
//class Main {
//    public static void main(String args[])
//    {
//        PriorityQueueUsingLists aQueue = new PriorityQueueUsingLists();
//        aQueue.insert(6);
//        aQueue.insert(4);
//        aQueue.insert(7);
//
//        aQueue.insert(3);
//
//
//        aQueue.remove(); // which item should be served if its data represent its priority
//        // (the higher the data, the higher the priority)
//        // 7
//        aQueue.remove(); // 6
//
//        aQueue.insert(9);
//        aQueue.insert(5);
//        // some debugging // front pointing to the seven and its value is 2
//        // Back is pointing to the five and its value is 0
//        System.out.println(aQueue.peek()); // Should be 9
//    }
//}