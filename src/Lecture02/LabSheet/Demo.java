package Lecture02.LabSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        QueueX printerQueue = new QueueX(5);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> oddQueue = new ArrayList(), evenQueue = new ArrayList();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Transaction ID " + i + " :");
            printerQueue.insert(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            int temp = printerQueue.remove();
            if (temp % 2 == 0) {
                evenQueue.add(temp);
            } else {
                oddQueue.add(temp);
            }
        }

        System.out.println("\nPC 1");
        for (int id : evenQueue){
            System.out.println("Transaction " + id);
        }

        System.out.println("\nPC 2");
        for (int id : oddQueue){
            System.out.println("Transaction " + id);
        }
    }
}
