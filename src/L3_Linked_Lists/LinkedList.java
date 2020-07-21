package L3_Linked_Lists;

/*
* The  Linklist class contains only one data item, a reference to the first link on the list called 'first'.
* It is possible to find the other links by the chain of references from 'first', using each link's next field.
* */

import java.util.logging.Logger;

public class LinkedList {
    Link first;

    //Constructor
    public LinkedList() {
        first = null;
    }

    //True if list is empty
    public boolean isEmpty() {
        return (first == null);
    }

    //Display the List
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    //insertFirst Method
    public void insertFirst(Student student) {
        Link newLink = new Link(student);
        newLink.next = first;
        first = newLink;
    }

    //deleteFirst Method
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    //Find a Link
    public Link find(String name) {
        Link current = first;
        Link findLink = null;

        while (current != null) {
            if (current.student.getName() == name) {
                findLink = current;
                break;
            }
        }

        return findLink;
    }

    //insertAfter method
    public boolean insertAfter(String key, Student newData) {
        Link current = first;
        boolean inserted = false;

        while (current != null) {
            if (current.student.getName().equals(key.trim())) {
                Link newLink = new Link(newData);
                Link next = current.next;
                newLink.next = next;
                current.next = newLink;

                inserted = true;

                break;
            }
            current = current.next;
        }

        return inserted;
    }

}
