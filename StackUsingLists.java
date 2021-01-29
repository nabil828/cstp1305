//class Node{
//    int data;
//    Node next;
//}
public class StackUsingLists {
    Node top;
    int size;
    StackUsingLists(){
        size =0;
    }
    void push(int a){
        Node newNode = new Node();
        newNode.data =a;
        if (size ==0){
            newNode.next = null;
        }else{
            newNode.next =top;
        }
        top = newNode;
    }

    int pop(){
        int tmp = top.data;
        top = top.next;
        return tmp;
    }
    int peek(){
        return  top.data;
    }


}


//// Driver code
//class Main {
//    public static void main(String args[])
//    {
//        StackUsingArrays s = new StackUsingArrays();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        System.out.println(s.pop() + " Popped from stack");
//
//        System.out.println(s.peek());
//    }
//}