package L3_Linked_Lists;

/*
In a linked list, a link is an object of a class called something like 'Link'.
* There are many similar links in a linked list.
* Each link contains Data items and a reference to the next link in the list.
* Here we use data item -> Student (Stores the name and the mark of particular student)
*/
public class Link {
    public Student student; //data item
    public Link next; //reference to the next link
    public Link previous; //reference to the previous

    //Constructor
    public Link(Student student) {
        this.student = student;
        next = null;
        previous = null;
    }

    //Display the data item
    public void displayLink() {
        System.out.println(this.student.toString());
    }
}
