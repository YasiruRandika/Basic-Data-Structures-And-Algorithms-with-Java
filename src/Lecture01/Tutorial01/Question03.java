package Lecture01.Tutorial01;

import Lecture01.LabSheet01.Stack;

//Peek function using pop() and push()
public class Question03 {
    Stack stack = new Stack(5);
    public char peek() {
        char peek = stack.pop();
        stack.push(peek);
        return peek;
    }
}
