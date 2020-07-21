package Lecture02.Tutorial;

import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        QueueX queueX = new QueueX(5);
        Scanner scanner = new Scanner(System.in);

        /*Question 02*/
        //Retrieve User inputs from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter the value : ");
            queueX.insert(scanner.nextDouble());
        }

        //Print the values from queue
        for (int i = 0; i < 5; i++) {
            double value = queueX.remove();
            System.out.println("\n" + value);
            queueX.insert(value);
        }

        /*Question 03*/
        Stack stack = new Stack();
        for (int i = 0; i < queueX.size(); i++) {
            double value = queueX.remove();
            stack.push(value);
            queueX.insert(value);
        }

        System.out.println("*** Values in reverse order ***");
        for (int i = 0; i < queueX.size(); i++) {
            System.out.println(stack.pop());
        }

        /*Addition Question*/
        PointerLine pointerLine = new PointerLine(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter JobID : ");
            pointerLine.insert(scanner.nextInt());
        }

        pointerLine.remove();
        pointerLine.remove();
        pointerLine.remove();
    }
}
