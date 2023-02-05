public class StackMain{
    public static void main(String[] args) {
        Stack stack = new Stack (5);
//        Insert items to the stack
        stack.push ('S');
        stack.push ('T');
        stack.push ('A');
        stack.push ('C');
        stack.push ('K');
//        remove items form the stack
        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
