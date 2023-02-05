package lab1;

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
        if (top == maxSize - 1) // check whether stack is full or not
            System.out.println("stack is full");
        else
            //      top++;
            //      stackArray[top] = i;
            stackArray[top++] = i;
    }

    //pop method
    public char pop(){
        return stackArray[top--];
    }



}