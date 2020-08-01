package L4_Tree;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Tree employeeTree = new Tree();

        employeeTree.insert(149, "Anusha");
        employeeTree.insert(167, "Kosala");
        employeeTree.insert(047, "Dinusha");
        employeeTree.insert(066, "Mihiri");
        employeeTree.insert(159, "Jayani");
        employeeTree.insert(118, "Nimal");
        employeeTree.insert(195, "Nishantha");
        employeeTree.insert(034, "Avodya");
        employeeTree.insert(105, "Bimali");
        employeeTree.insert(133, "Sampath");

        System.out.println("\n***Display Tree inOrder Traversing***");
        employeeTree.inOrder(employeeTree.getRoot());

        System.out.println("\n***Display Tree pastOrder Traversing***");
        employeeTree.pastOrder(employeeTree.getRoot());

        System.out.println("\n***Display Tree preOrder Traversing***");
        employeeTree.preOrder(employeeTree.getRoot());

        System.out.println("\n---------------------------------------\n");
        System.out.println("Enter employee Number : ");
        Scanner scanner = new Scanner(System.in);

        //Find a node
        Node findNode = employeeTree.find(scanner.nextInt());
        if (findNode != null) {
            findNode.displayNode();
        } else {
            System.out.println("\nThere are no matching results !\n");
        }

        //Delete all nodes
        employeeTree.deleteAll();

        //Show the deletion
        employeeTree.inOrder(employeeTree.getRoot());
    }
}
