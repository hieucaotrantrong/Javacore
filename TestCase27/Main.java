package TestCase27;

public class Main {
    public static void main(String[] args) {
        /*
         * MyArrayStack myStack = new MyArrayStack(3);
         * myStack.push(1);
         * myStack.push(2);
         * myStack.push(3);
         * System.out.println(myStack.push(4));
         * 
         * myStack.show();
         * myStack.pop();
         * myStack.show();
         * myStack.pop();
         * myStack.show();
         * myStack.pop();
         * myStack.show();
         */
        MyArrayQueue queue = new MyArrayQueue(3);
        System.out.println(queue.push(1));
        System.out.println(queue.push(2));
        System.out.println(queue.push(3));
        System.out.println(queue.push(4));
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
    }
}
