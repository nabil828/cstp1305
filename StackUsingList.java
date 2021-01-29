class listNode{
    public int data;
    public Node next; // object type variable similar to pointers in c++
}
public class StackUsingList {
    Node top;
    int size;
    StackUsingList(){
        size = 0;
    }
    void push(int a){
        if(size == 0){
            top = new Node();
            top.data = a;
            top.next = null;
        }else{
            Node tmp = new Node();
            tmp.data = a;
            tmp.next = top;
            top = tmp;
        }
        size++;
    }

    int peek(){
        return top.data;
    }

    int pop(){
        int tmp = top.data;
        top = top.next;
        return  tmp;
    } // the Java garbage collector will take care of that node at the top
}


// Driver code
//class Main {
//    public static void main(String args[])
//    {
//        StackUsingArrays s = new StackUsingArrays();
//        s.push(7);
//        s.push(6);
//        s.push(1);
//        s.push(5);
//        s.pop();
//
//        System.out.println(s.peek()); // should be 1
//    }
//}