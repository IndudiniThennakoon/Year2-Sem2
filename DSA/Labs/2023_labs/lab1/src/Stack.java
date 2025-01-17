public class Stack{
    public char[]stackArray; // declaration of stack char type array
    public int maxSize;
    public int top; // top of the stack

    //parameterized construcotor
    public Stack(int arrSize){
        maxSize = arrSize; // set array size
        stackArray = new char[maxSize];
        top = -1 // no items in the stack
    }

    //push method
    public void push(char i){
        if (isFull()) // check whether stack is full or not
            System.out.println("stack is full");
        else
            //      top++;
            //      stackArray[top] = i;
            stackArray[top++] = i;
    }

    //pop method
    public char pop(){
        if(isEmpty()){ // check whether stack is empty or not
            System.out.println("Stack is empty");
            return -99;
        }else
            return stackArray[top--];
    }

    //peek method
    public char peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -99;
        }else
            return stackArray[top];
    }
    //method to check whether stack is full or not
    public boolean isFull(){
//        if(top == maxSize-1)
//            r eturn true;
//        else false;
        return (top == maxSize-1); // without using if condition check the stack is full or not
    }
    // method to check whether stack is empty or not
    public boolean isEmpty(){
        return(top ==-1);
    }
}