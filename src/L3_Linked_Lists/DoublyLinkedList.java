package L3_Linked_Lists;

/*
* A doubly linked list allows to traverse backwards as well as forward through the list
* */

public class DoublyLinkedList {
    Link first;

    //Constructor
    public DoublyLinkedList() {
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
            current.student.toString();
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    //insertFirst Method
    public void insertFirst(Student student) {
        Link newLink = new Link(student);
        newLink.next = first;
        newLink.previous = null;

        if (first != null) {
            first.previous = newLink;
        }

        first = newLink;
    }

    //deleteFirst Method
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        first.previous = null;
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
            if (current.student.getName() == key) {
                Link newLink = new Link(newData);
                Link next = current.next;
                newLink.next = next;
                newLink.previous = current;
                current.next = newLink;
                next.previous = newLink;

                inserted = true;

                break;
            }
        }

        return inserted;
    }
}
