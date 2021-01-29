
/* Java program to implement basic stack
operations */
import java.lang.Exception;

public class StackUsingArraysWithExceptionHandling {
    int []arr = new int[10]; //usually you can't the array size
    int top =-1;
    void push(int a){

        // 1 - if the you have reached the limit
        // 2 - you need to create a new array of larger size (4)
        // 3 - copy all the old items into the newer array
        // 4 - assign the old array to the newer one

        // 5 -
        top++;
        arr[top] =a;
    }

    int pop() throws Exception {
        if(top < 0)
            throw new Exception();
//            System.out.println("This is not allowed '.'"); // in a sense this is something similar to exception handling!
//            return -1; // dummy value


        int tmp = arr[top];
        top = top -1;
        return tmp;


    }

    int peek(){
        return arr[top];
    }
}
// Driver code
class Main {
    public static void main(String args[])
    {
        StackUsingArraysWithExceptionHandling aStack = new StackUsingArraysWithExceptionHandling();

        int x_is_something_important = 10;
        try {
            aStack.push(6);
            aStack.push(7);
            aStack.push(1);
            aStack.push(5);
            aStack.pop();
            aStack.pop();
            aStack.pop();
            aStack.pop();
            x_is_something_important = aStack.pop(); // should not be allowed
            System.out.println(x_is_something_important);
        }catch (Exception e){
            System.out.println("Oh this is a invalid pop operation '.' ");
            System.out.println(x_is_something_important);

        }

        try {
            aStack.pop();
        }
        catch(Exception e) {
        }
    }


    }
}