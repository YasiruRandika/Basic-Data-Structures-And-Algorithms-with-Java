package Lecture01.LabSheet01;

import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    private Character[] stackArray;
    private int maxSize, top = -1;

    public Stack(int maxSize) {
        this.stackArray = new Character[maxSize];
    }

    public boolean isEmpty() {
        if (stackArray[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == (maxSize - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Character character) {
        if (!isFull()) {
            stackArray[++top] = character;
        } else {
            System.out.println("\n*** The Stack is Full ***");
        }
    }

    public char pop() {
        char popValue = '*';
        if (!isEmpty()) {
            ArrayList<Character> arrayStack = new ArrayList<Character>(Arrays.asList(stackArray));
            popValue = Character.valueOf(stackArray[top--]);
            arrayStack.remove(Character.valueOf(stackArray[top--]));
            stackArray = arrayStack.toArray(new Character[0]);
        }
        return popValue;
    }

    public Character peek() {
        Character peek = '*';
        if (!isEmpty()) {
            peek = stackArray[top];
        } else {
            System.out.println("\n*** Array is Empty ***");
        }
        return peek;
    }
}
