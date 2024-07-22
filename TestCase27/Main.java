package TestCase27;

public class Main {
    public static void main(String[] args) {
        MyArrayStack myStack = new MyArrayStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.push(4));

        myStack.show();
        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();
        myStack.pop();
        myStack.show();
    }
}
