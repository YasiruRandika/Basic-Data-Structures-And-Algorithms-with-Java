package L2_Stacks.Tutorial01;

import L2_Stacks.LabSheet01.Stack;

//Peek function using pop() and push()
public class Question03 {
    Stack stack = new Stack(5);
    public char peek() {
        char peek = stack.pop();
        stack.push(peek);
        return peek;
    }
}
