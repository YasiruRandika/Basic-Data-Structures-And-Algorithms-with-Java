package L3_Linked_Lists;

/*
* A double-ended list is simlilar to an ordinary linked list with an additional reference to the last link
* */

public class Double_Ended_List {
   Link first;
   Link last;

   //Constructor
    public Double_Ended_List() {
        first = null;
        last = null;
    }

    //True if list is empty
    public boolean isEmpty() {
        return (first == null);
    }

    //Display the list
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
        }
    }

    //insertFirst Method
    public void insertFirst(Student student) {
        Link newLink = new Link(student);
        newLink.next = first;
        first = newLink;

        if (newLink.next == null) {
            last = newLink;
        }
    }

    //deleteFirst Method
    public Link deleteFirst() {
        Link temp = first;
        first = first.next;

        if (first == null) {
            last = null;
        }
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
                current.next = newLink;

                if (newLink.next == null) {
                    last = newLink;
                }

                inserted = true;

                break;
            }
        }

        return inserted;
    }
}
