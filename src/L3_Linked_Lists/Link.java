package L3_Linked_Lists;

/*
In a linked list, a link is an object of a class called something like 'Link'.
* There are many similar links in a linked list.
* Each link contains Data items and a reference to the next link in the list
* */
public class Link {
    public int iData; //data item
    public Link next; //reference to the next link

    //Constructor
    public Link(int id) {
        this.iData = id;
        next = null;
    }

    //Display the data item
    public void displayLink() {
        System.out.println(iData);
    }
}
